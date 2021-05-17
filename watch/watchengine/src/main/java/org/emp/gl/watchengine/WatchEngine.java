package org.emp.gl.watchengine;

import org.emp.gl.service.gui.controller.Reglable;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;

public class WatchEngine extends DummyTimeServiceImpl implements Reglable {

    private WatchState watchState;


    public WatchEngine(){
        this.watchState = new Init(this);
    }

    void setWatchState(WatchState watchState){
        this.watchState = watchState;
    }



    @Override
    public void config() {
        this.watchState.config();
    }

    @Override
    public void mode() {
        this.watchState.mode();
    }

    @Override
    public void increment() {
        this.watchState.increment();
    }


}
