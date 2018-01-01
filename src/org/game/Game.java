/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game;

import org.graphics.Renderer;

/**
 *
 * @author gerar
 */
public class Game {
    public static void main(String args[]) {
        Renderer.init();
    }
    
    public static void quit() {
        System.exit(0);
    }
}
