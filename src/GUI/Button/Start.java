/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Button;

import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author GerardoAGL
 */
public class Start {
    private static final int WIDTH = 160;
    private static final int HEIGHT = 54;
    private static final int x = 165;
    private static final int y = 300; 
    private BufferedImage img;
    
    public Start(){
        try{
            img = ImageIO.read(new File("start.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void paint(Graphics2D g2d) {
        g2d.drawImage(img, x, y, WIDTH, HEIGHT, null);
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT);
    }
    
    public void mouseClicked(MouseEvent e){
        Rectangle button = getBounds();
        
        if(button.contains(e.getX(), e.getY())){
            System.out.println("START!!");
        }
    }
}
