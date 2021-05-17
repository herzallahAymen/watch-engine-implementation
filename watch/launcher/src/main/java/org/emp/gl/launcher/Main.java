package org.emp.gl.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.service.gui.controller.GuiControllerService;
import org.emp.gl.service.gui.horloge.GuiHorlogeService;


public class Main
{
    public static void main( String[] args )
    {
        ServiceRegistrator.registerServices();

        Lookup lkup = Lookup.getInstance();

        GuiHorlogeService guiHorloge = lkup.getService(GuiHorlogeService.class);
        GuiControllerService guiController = lkup.getService(GuiControllerService.class);

        guiHorloge.show();
        guiController.show();

    }
}
