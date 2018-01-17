/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.world;

import java.awt.Graphics;   
import java.util.ArrayList;
import org.object.Sprite;

/**
 *
 * @author gerar
 */
public class World {
    
    public static World currentWorld = null;
    
    public static int obstacles = 4;
    
    public static int currentObstacles = 0;
    
    public static float lastObstacle = 0.0f;
    
    public static int velocityX = 100;
    
    private static long lastTime = System.nanoTime();
    
    public ArrayList<Sprite> sprites = new ArrayList<Sprite>();
    
    public static void update() {
        
        float deltaTime = (System.nanoTime() - lastTime) / 1000000000.0f;

        lastTime = System.nanoTime();
        
        lastObstacle += deltaTime;
        
        for(Sprite sprite : currentWorld.sprites) {
            sprite.update(deltaTime);
        }
    }
    
    public static void render(Graphics g) {
        
        for(Sprite sprite : currentWorld.sprites) {
            sprite.render(g);
        }
    }
}
