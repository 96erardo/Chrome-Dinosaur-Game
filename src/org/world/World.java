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
    
    public static long lastTime = 0;
    
    public ArrayList<Sprite> sprites = new ArrayList<Sprite>();
    
    public static void update() {
        
        float deltaTime = (System.nanoTime() - lastTime) / 1000000000.0f;
        
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
