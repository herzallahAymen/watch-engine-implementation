package org.emp.gl.watchengine;

public abstract class WatchState {

    protected WatchEngine watchEngine;

    private WatchState(){}

    WatchState(WatchEngine watchEngine){

        this.watchEngine = watchEngine;

    }

    abstract void config();
    abstract void mode();
    abstract void increment();

}
