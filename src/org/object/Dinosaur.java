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
import org.graphics.Renderer;
import org.input.Input;
import org.world.World;

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
        height = 50;
        solid = true;
        
        image = Renderer.loadImage("/resources/image/yoshi.png");
    }
    
    @Override
    public void update(float deltaTime) {        
        float moveX = 0;
        
        if(Input.getKey(KeyEvent.VK_W)) {
            if(doesColide(posX, posY + 1)) {
                velocityY = -100;
            }                
        }
        if(Input.getKey(KeyEvent.VK_A)) {
            moveX -= velocityX;
        }
        if(Input.getKey(KeyEvent.VK_D)) {
            moveX += velocityX;
        }
        
        velocityY += Game.gravity * deltaTime;
        
        if(doesColide(posX + moveX * deltaTime, posY)) {
            moveX -=moveX;
        }
        if(doesColide(posX, posY + velocityY * deltaTime)) {
            velocityY -= velocityY;
        }
        
        posX += moveX * deltaTime;
        posY += velocityY * deltaTime;
        
        Renderer.camX = posX + width / 2;
        Renderer.camY = posY + height / 2;        
    }
    
    public boolean doesColide(float x, float y) {
        float myLeft   = x;
        float myRight  = x + width;
        float myTop    = y;
        float myBottom = y + height;
        
        for(Sprite sprite : World.currentWorld.sprites) {
            if(sprite == this)
                continue;
            
            float otherLeft   = sprite.posX;
            float otherRight  = sprite.posX + sprite.width;
            float otherTop    = sprite.posY;
            float otherBottom = sprite.posY + sprite.height;
            
            if(myLeft < otherRight && myRight > otherLeft && myBottom > otherTop && myTop < otherBottom) {
                return true;
            }            
        }        
        return false;
    }
}
