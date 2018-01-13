/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.object.obstacle;

import java.awt.Color;
import java.awt.Graphics;
import org.graphics.Renderer;
import org.object.Sprite;
import org.world.World;

/**
 *
 * @author gerar
 */
public class Medium extends Sprite{
    
    public boolean moving;
    
    public Medium(float posX, float posY) {
        super(posX, posY);
        width = 10;
        height = 15;
        solid = false;
        moving = false;
    }
    
    @Override
    public void update(float deltaTime) {
        
        if (World.lastObstacle >= 1) {
            if (posX > Renderer.DEFAULT_GAME_WIDTH) { // IF THE OBSTACLE IS AT THE RIGHT PART OF THE SCREEN           
                if (World.currentObstacles < World.obstacles) {
                    moving = shouldMove(Math.random());
                    if (moving) {
                        World.currentObstacles += 1;
                        World.lastObstacle = 0;
                    }
                }
            }else if ((posX + width) < 0) { // IF THE OBSTACLE IS AT THE LEFT PART OF THE SCREEN
                World.currentObstacles -= 1;
                posX = 510; // POSITIONING THE OBSTABLE AT THE RIGHT SIDE OF THE SCREEN
                moving = false;
            }

            if (moving) {            
                posX -= World.velocityX * deltaTime;
            }
        }
    }
    
    public void render(Graphics g) {
        
        int realX = (int) posX;
        int realY = (int) posY;
        
        g.setColor(Color.green);
        g.drawRect(realX, realY, width, height);
    }
   
    // METHOD THAT WILL DECIDE IF THE OBSTACLE SHOULD APPEAR OR NOT
    public boolean shouldMove(double number) {
        
        System.out.println(number);
        
        if(number <= 0.5) {
            return false;
        }else {
            return true;
        }
    }
}

