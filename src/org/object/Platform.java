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
        width = Renderer.DEFAULT_GAME_WIDTH;
        height = 1; // 1 pixel
        solid = true;
    }
    
    @Override
    public void render(Graphics g) {
        int realX = (int) posX;
        int realY = (int) posY;
        
        g.setColor(Color.RED);
        g.drawLine(realX, realY, Renderer.DEFAULT_GAME_WIDTH, realY);
    }
    
}
