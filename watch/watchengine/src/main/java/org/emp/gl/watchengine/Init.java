package org.emp.gl.watchengine;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.service.gui.horloge.GuiHorlogeService;

public class Init extends WatchState {

    Init(WatchEngine watchEngine) {
        super(watchEngine);
    }

    @Override
    void config() {

        Lookup.getInstance().getService(GuiHorlogeService.class).setBlocked(true);
        Lookup.getInstance().getService(GuiHorlogeService.class).highlightSeconds(true);

        WatchState watchState = new Seconds(this.watchEngine);
        this.watchEngine.setWatchState(watchState);
    }

    @Override
    void mode() {
        System.out.println("Do nothing");
    }

    @Override
    void increment() {
        System.out.println("Do nothing");
    }
}
