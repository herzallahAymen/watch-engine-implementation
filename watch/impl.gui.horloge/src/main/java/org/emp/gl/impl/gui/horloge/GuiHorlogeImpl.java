package org.emp.gl.impl.gui.horloge;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.service.gui.horloge.GuiHorlogeService;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

import java.awt.*;
import java.beans.PropertyChangeEvent;


public class GuiHorlogeImpl implements GuiHorlogeService,TimerChangeListener
{ 
    GuiHorlogeImplWindow g;
    private Object lock = new Object();
    int seconds;
    int minutes;
    int hours;

    
    
    public GuiHorlogeImpl()
    {

    }
    @Override
    public void show() {
        if(g==null){
            synchronized(lock){
                if(g==null) {
                    g = new GuiHorlogeImplWindow();
                    TimerService timerService = Lookup.getInstance().getService(TimerService.class);

                    seconds = timerService.getSecondes();
                    minutes = timerService.getMinutes();
                    hours = timerService.getHeures();

                    System.out.println(seconds+" "+minutes);

                    g.setSeconds(seconds);
                    g.setMinutes(minutes);
                    g.setHours(hours);
                    timerService.addTimeChangeListener(this);

                }
            }
        }
    }

    @Override
    public void setBlocked(boolean blocked) {
        
       if (blocked == true)
       {
           Lookup.getInstance().getService(TimerService.class).removeTimeChangeListener(this);
       }
       else 
       {
           Lookup.getInstance().getService(TimerService.class).addTimeChangeListener(this);
       }
       
    }

    @Override
    public void incrementSeconds() {
     
      seconds = (seconds + 1 ) % 60 ;
      if ( seconds == 0 ){
          incrementMinutes();
      }
        
      g.setSeconds(seconds);
    }

    @Override
    public void incrementMinutes() {
        minutes = ( minutes + 1 ) % 60 ; 
        if ( minutes == 0 ){
            incrementHours();
        }
        g.setMinutes(minutes);
    }

    @Override
    public void incrementHours() {
   
    hours = ( hours + 1 ) % 24 ;
   
    g.setHours(hours);
    
    }

    @Override
    public void highlightSeconds(boolean light) {
        if(light == true){

            g.timeLabelSec.setForeground(Color.RED);


        }else{
            g.timeLabelSec.setForeground(Color.BLACK);
        }
    }

    @Override
    public void highlightMinutes(boolean light) {
        if(light == true){
            g.timeLabelMin.setForeground(Color.red);
        }else{
            g.timeLabelMin.setForeground(Color.BLACK);

        }
    }

    @Override
    public void highlightHours(boolean light) {
        if(light == true){
            g.timeLabelHour.setForeground(Color.red);
        }else{
            g.timeLabelHour.setForeground(Color.BLACK);

        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch(evt.getPropertyName()){
            case TimerChangeListener.DIXEME_DE_SECONDE_PROP:

                break;
            case TimerChangeListener.HEURE_PROP:
                this.incrementHours();
                break;
            case TimerChangeListener.MINUTE_PROP:
                this.incrementMinutes();
                break;
            case TimerChangeListener.SECONDE_PROP:
                this.incrementSeconds();
                break;
            default:
                break;
        }
    }

}
