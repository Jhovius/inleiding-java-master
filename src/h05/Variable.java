package h05;

import java.awt.*;
import java.applet.*;




public class Variable extends Applet {

    public void init(){

    }

    public void paint (Graphics g) {
        int x = 10;
        int y = 10;
        int width = 50;
        int height=50;

        g.drawRect(x,y,width,height);


        Color magenta     = new Color(255,   0,   255);
        g.setColor(Color.magenta);
        g.fillRect(10*x,y,width,height);
        g.setColor(Color.black);
        g.drawOval(10*x,y,width,height);
        g.setColor(Color.magenta);
        g.fillArc(200,20,50,50,75,40);
        g.setColor(Color.black);
        g.drawOval(20*x,y,width,height);
    g.drawRect(20,100,50,50);


    g.setColor(Color.magenta);
    g.fillOval(110,100,20,40);
    g.drawOval(110,100,20,40);
    g.setColor(Color.cyan);
    g.drawOval(150,100,70,70);



/*
        g.fillOval(20,20,50,100);
        g.drawOval(40, 200, 50, 100);
        g.drawString("Gevulde ovaal",10,10);

*/

    }
}