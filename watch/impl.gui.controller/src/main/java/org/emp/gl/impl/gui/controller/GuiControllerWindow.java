/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.impl.gui.controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.service.gui.controller.Reglable;

/**
 *
 * @author yacin
 */
public class GuiControllerWindow {
 JFrame frame = new JFrame();
 JButton configButton = new JButton("configuration");
 JButton modeButton = new JButton("mode");
 JButton incrementButton = new JButton("+");
 
 public GuiControllerWindow()
 {
     buttonsConfiguration();
        //***  configButton  **** 
        configButton.addActionListener(new ActionListener()
                {
                 @Override
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()==configButton) {
                Lookup.getInstance().getService(Reglable.class).config();
		}
        }});
      
        //***  modeButton  ****
        
        modeButton.addActionListener(new ActionListener()
                {
                    @Override
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()==modeButton) {
                Lookup.getInstance().getService(Reglable.class).mode();
		}
        }});
        
        //***  incrementButton  ****
        incrementButton.addActionListener(new ActionListener()
                {
                    @Override
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()==incrementButton) {
                Lookup.getInstance().getService(Reglable.class).increment();
		}
        }});     
        // creat 
        this.add_buttons();
       
 }
 private void buttonsConfiguration()
    {
        configButton.setBounds(122,200,100,50);
        configButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        configButton.setFocusable(false);
        
        modeButton.setBounds(222,200,100,50);
        modeButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        modeButton.setFocusable(false);
        
        incrementButton.setBounds(322,200,100,50);
        incrementButton.setFont(new Font("Ink Free",Font.PLAIN,20));
        incrementButton.setFocusable(false);
        
    }
 private void add_buttons()
    {
                frame.add(configButton);
                frame.add(modeButton);
                frame.add(incrementButton);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(570,420);
		frame.setLayout(null);
		frame.setVisible(true);
    }
    public void hide(){frame.hide();}
    
}
