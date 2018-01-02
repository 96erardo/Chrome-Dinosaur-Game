/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author gerar
 */
public class Input implements KeyListener {

    private static boolean[] keys = new boolean[222];
    
    public static boolean getKey(int keyCode) {
        return keys[keyCode];
    } 
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
    
}
