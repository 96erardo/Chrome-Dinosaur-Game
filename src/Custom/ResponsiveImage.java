/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author GerardoAGL
 */
public class ResponsiveImage {
    
    private Dimension d_window; //Default screen dimension
    private int d_width; //Default image width
    private int d_height; //Default image heidht;
    private int d_x; //Default image width
    private int d_y; //Default image heidht;
    public int width; //New image width
    public int height; //New image heidht;
    public int x;
    public int y;
    
    
    public ResponsiveImage(Dimension pane, int x, int y, int width, int height) {
        this.d_window = pane;
        this.d_width = width;
        this.d_height = height;
        this.width = width;
        this.height = height;
        this.d_x = x;
        this.d_y = y;
        this.x = x;
        this.y = y;
    } 
    
    public void resize(Dimension pane){
        double wchange = ((pane.getWidth() * 100)/d_window.getWidth());
        double hchange = ((pane.getHeight()* 100)/d_window.getHeight());
        width = (int)((d_width * wchange)/100); 
        height = (int)((d_height * hchange)/100);
        x = (int) ((d_x * wchange)/100);
        y = (int) ((d_y * hchange)/100);
    }
}
