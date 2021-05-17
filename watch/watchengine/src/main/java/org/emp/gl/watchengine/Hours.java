package org.emp.gl.watchengine;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.service.gui.horloge.GuiHorlogeService;

public class Hours extends WatchState{

    Hours(WatchEngine watchEngine) {
        super(watchEngine);
    }

    @Override
    void config() {






        Lookup.getInstance().getService(GuiHorlogeService.class).highlightHours(false);
        Lookup.getInstance().getService(GuiHorlogeService.class).setBlocked(false);



        WatchState watchState = new Init(this.watchEngine);
        this.watchEngine.setWatchState(watchState);

    }

    @Override
    void mode() {



        Lookup.getInstance().getService(GuiHorlogeService.class).highlightHours(false);
        Lookup.getInstance().getService(GuiHorlogeService.class).highlightSeconds(true);

        WatchState watchState = new Seconds(this.watchEngine);
        this.watchEngine.setWatchState(watchState);
    }

    @Override
    void increment() {
        Lookup.getInstance().getService(GuiHorlogeService.class).incrementHours();
    }

}
