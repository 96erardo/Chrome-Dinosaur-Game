/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Custom.ResponsiveImage;
import GUI.Button.Start;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author GerardoAGL
 */
public class Menu extends JFrame{
    
    private BufferedImage chromeLogo;
    private Start start = new Start();
    private ResponsiveImage cl = null;
    private Font font;
    private Container canvas;
    
    public Menu(String title){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(500, 500);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        canvas = getContentPane();
        canvas.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                start.mouseClicked(e);
            }
        });
        
        try{
            chromeLogo = ImageIO.read(new File("chrome_logo.png"));
            font = Font.createFont(Font.TRUETYPE_FONT, new File("PressStart2P-Regular.ttf")).deriveFont(20f);
        }catch(IOException e){
            System.out.println("No se pudo cargar la foto");
        }catch(FontFormatException e){
            System.out.println("No se pudo cargar la fuente");
        }
        
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setFont(font);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.drawImage(chromeLogo, 55, 50, 100, 101, null);
        start.paint(g2d);
        g2d.drawString("Dinosaur Game", 140, 108);
    }
}
