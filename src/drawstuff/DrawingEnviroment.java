/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Alex Parks
 */
class DrawingEnviroment extends Environment {

    public DrawingEnviroment() {
//        logo = ResourceTools.loadImageFromResource("drawstuff/Apple Ad - Brighten Your Day.jpg");
//        this.setBackground(Color.white);
        logo = ResourceTools.loadImageFromResource("drawstuff/99bugs.jpg");
        this.setBackground(Color.black);

    }

    Image logo = null;

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

//        graphics.drawOval(10, 20, 50, 100);
//        graphics.setColor(Color.red);
//        graphics.drawOval(10, 40, 50, 100);
//        graphics.setColor(Color.BLACK);
//        graphics.drawOval(10, 50, 50, 100);
//        graphics.setColor(Color.YELLOW);
//        graphics.drawOval(10, 70, 50, 100);
//        graphics.setColor(Color.CYAN);
//        graphics.drawOval(10, 80, 50, 100);
//        graphics.setColor(Color.PINK);
//        
//        graphics.fillOval(130, 300, 90, 90);
//        graphics.setColor(new Color(150, 0, 150, 120));
//        graphics.fillOval(150, 300, 90, 90);
//        graphics.setColor(new Color(0, 30, 200, 120));
//        graphics.fillOval(170, 300, 90, 90);
//        graphics.setColor(new Color(255, 0, 0, 120));
//        
//        graphics.fillRect(400, 550, 60, 60);
//        graphics.setColor(new Color(255, 255, 255));\
        graphics.setColor(new Color(209, 100, 0));
        graphics.setFont(new Font ("SanSerif", Font.BOLD, 60 ));
        graphics.drawString("OMG The New Debugger", 60, 60);
        graphics.setColor(new Color(0, 100, 100));
        graphics.drawString("Download the Debugger Now ", 700, 1000);
        graphics.setColor(new Color(209, 0, 100));
        graphics.drawString("No More Bugs", 500, 1200);
//                
//                
//        for (int i = 0; i <= 2550; i= i + 50) {
//            graphics.fillOval(i, 60, 100, 30);
//            for (int j = 0; j <= 255 - (255 * i); j = j + 5) {
//
//                graphics.setColor(new Color(j, 50, 0));
//            }
//           
//        }
        if (logo != null) {
            graphics.drawImage(logo, 100, 100, 900, 700, this);

        }

    }

}

