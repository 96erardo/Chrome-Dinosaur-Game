/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.graphics.Renderer;
import org.object.Dinosaur;
import org.object.Platform;
import org.world.World;

/**
 *
 * @author gerar
 */
public class Game {
    
    public static final int gravity = 200;
    
    public static void main(String args[]) {
        
        Renderer.init();
        
        World.currentWorld = new World();
        World.currentWorld.sprites.add(new Dinosaur(100, 100));
        World.currentWorld.sprites.add(new Platform(0, 300));
    }
    
    public static void quit() {
        System.exit(0);
    }
}
