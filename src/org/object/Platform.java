/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.object;

import java.awt.Graphics;

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
        
        g.drawRect(realX, realY, width, height);
    }
    
}
