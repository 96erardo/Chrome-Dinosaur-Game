/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.object;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.game.Game;
import org.input.Input;

/**
 *
 * @author gerar
 */
public class Dinosaur extends Sprite{
    
    private float velocityY = 0.0f;
    private float velocityX = 50.0f;
    
    private Rectangle myRect = null;
    
    public Dinosaur(float posX, float posY) {
        super(posX, posY);
        width = 50;
        height = 25;
    }
    
    @Override
    public void update(float deltaTime) {
        
        if(Input.getKey(KeyEvent.VK_W)) {
            velocityY = -100;
        }        
        if(Input.getKey(KeyEvent.VK_A)) {
            posX -= velocityX * deltaTime;
        }
        if(Input.getKey(KeyEvent.VK_D)) {
            posX += velocityX * deltaTime;
        }
        
        velocityY += Game.gravity * deltaTime;
        posY += velocityY * deltaTime;
    }
    
    /**
     * Metodo sobreescrito temporalmente mientras se 
     * crea la imagen para este sprite
     * @param g 
     */    
    @Override
    public void render(Graphics g) {
        
        int x = (int)posX;
        int y = (int)posY;
        
        g.setColor(Color.GREEN);        
        g.drawRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawString("dinosaur", x, y+20);
    }
    
}
