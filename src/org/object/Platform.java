/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.object;

import java.awt.Color;
import java.awt.Graphics;
import org.graphics.Renderer;

/**
 *
 * @author gerar
 */
public class Platform extends Sprite{    
    
    public Platform(float posX, float posY) {
        super(posX, posY);
        width = 200;
        height = 10;
        solid = true;
    }
    
    @Override
    public void render(Graphics g) {
        int realX = (int) posX;
        int realY = (int) posY;
        
        realX = realX - (int) Renderer.camX + Renderer.DEFAULT_GAME_WIDTH / 2;
        realY = realY - (int) Renderer.camY + Renderer.DEFAULT_GAME_HEIGHT / 2;
        
        g.setColor(Color.BLACK);
        g.drawRect(realX, realY, width, height);
    }
    
}
