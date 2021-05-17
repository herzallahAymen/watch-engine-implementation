/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.impl.gui.controller;

import org.emp.gl.service.gui.controller.GuiControllerService;


/**
 *
 * @author yacin
 */
public class GuiController implements GuiControllerService{
    // les variable
    GuiControllerWindow g;
    private Object lock=new Object();
 

    
    @Override
    public void show() {
        if(g==null){
            synchronized(lock){
                if(g==null){
                    g=new GuiControllerWindow();
                }
            }
        }
    }
    
   
   
}
