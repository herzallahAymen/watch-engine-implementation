/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.service.gui.horloge;

/**
 *
 * @author yacin
 */
public interface GuiHorlogeService {

    public void show();
    public void setBlocked(boolean blocked);

    public void incrementSeconds();
    public void incrementMinutes();
    public void incrementHours();

    public void highlightSeconds(boolean light);
    public void highlightMinutes(boolean light);
    public void highlightHours(boolean light);


}
