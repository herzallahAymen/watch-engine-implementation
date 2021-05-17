/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.impl.gui.horloge;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author walid
 */
public class GuiHorlogeImplWindow {
    JFrame frame = new JFrame();
    JLabel timeLabelSec = new JLabel();
    JLabel timeLabelMin = new JLabel();
    JLabel timeLabelHour = new JLabel();


    int text_size = 24;
    String seconds_string = String.format("%02d", 0);
    String minutes_string = String.format("%02d", 0);
    String hours_string = String.format("%02d", 0);
    
    
    public GuiHorlogeImplWindow()
    {
        timeLabelSec.setText(seconds_string);
        timeLabelSec.setBounds(350,150,100,100);
        timeLabelSec.setFont(new Font("Verdana",Font.PLAIN,text_size));
        timeLabelSec.setBorder(BorderFactory.createEtchedBorder());
        timeLabelSec.setOpaque(true);
	    timeLabelSec.setHorizontalAlignment(JTextField.CENTER);

        timeLabelMin.setText(minutes_string+":");
        timeLabelMin.setBounds(250,150,100,100);
        timeLabelMin.setFont(new Font("Verdana",Font.PLAIN,text_size));
        timeLabelMin.setBorder(BorderFactory.createEtchedBorder());
        timeLabelMin.setOpaque(true);
        timeLabelMin.setHorizontalAlignment(JTextField.CENTER);

        timeLabelHour.setText(hours_string+":");
        timeLabelHour.setBounds(150,150,100,100);
        timeLabelHour.setFont(new Font("Verdana",Font.PLAIN,text_size));
        timeLabelHour.setBorder(BorderFactory.createEtchedBorder());
        timeLabelHour.setOpaque(true);
        timeLabelHour.setHorizontalAlignment(JTextField.CENTER);
        
        frame.add(timeLabelSec);
        frame.add(timeLabelMin);
        frame.add(timeLabelHour);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(570,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void setSeconds(int s ) {
        
        seconds_string = String.format("%02d", s);
        timeLabelSec.setText(seconds_string);
        
    }
    public void setMinutes(int s ) {
        minutes_string = String.format("%02d", s);
        timeLabelMin.setText(minutes_string+" ");
        
    }
    public void setHours(int s ) {
     
        hours_string = String.format("%02d",s);
        timeLabelHour.setText(hours_string+" ");
    }

}
