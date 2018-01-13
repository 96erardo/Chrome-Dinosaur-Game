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
import org.object.obstacle.Large;
import org.object.obstacle.Medium;
import org.object.obstacle.Small;
import org.world.World;

/**
 *
 * @author gerar
 */
public class Game {
    
    public static final int gravity = 400;
    public static int velocityX = 20;
    
    public static void main(String args[]) {
        
        Renderer.init();
        
        World.currentWorld = new World();
        World.currentWorld.sprites.add(new Dinosaur(10, 300));
        World.currentWorld.sprites.add(new Platform(0, 340));
        World.currentWorld.sprites.add(new Small(510, 329));
        World.currentWorld.sprites.add(new Medium(510, 324));
        World.currentWorld.sprites.add(new Large(510, 324));
        World.currentWorld.sprites.add(new Small(510, 329));
        World.currentWorld.sprites.add(new Medium(510, 324));
        World.currentWorld.sprites.add(new Large(510, 324));
    }
    
    public static void quit() {
        System.exit(0);
    }
}
