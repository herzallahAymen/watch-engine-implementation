package org.emp.gl.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.impl.gui.controller.GuiController;
import org.emp.gl.impl.gui.horloge.GuiHorlogeImpl;
import org.emp.gl.service.gui.controller.GuiControllerService;
import org.emp.gl.service.gui.controller.Reglable;
import org.emp.gl.service.gui.horloge.GuiHorlogeService;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.watchengine.WatchEngine;

public class ServiceRegistrator {
    public static void registerServices(){
        WatchEngine engine = new WatchEngine();
        GuiHorlogeImpl guiHorloge = new GuiHorlogeImpl();
        GuiController guiController = new GuiController();

        Lookup.getInstance().register(Reglable.class,engine );
        Lookup.getInstance().register(TimerService.class,engine);
        Lookup.getInstance().register(GuiControllerService.class ,guiController);
        Lookup.getInstance().register(GuiHorlogeService.class ,guiHorloge);
    }
}
