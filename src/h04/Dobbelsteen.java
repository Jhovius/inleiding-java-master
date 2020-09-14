package h04;

import java.awt.*;
import java.applet.*;



public class Dobbelsteen extends Applet {


    public void paint(Graphics g) {


        g.drawRect(40, 40, 30, 40);
        g.drawOval(40,40,10,10);
        g.drawOval(60,40,10,10);
        g.drawOval(60,67,10,10);
        g.drawOval(40,67,10,10);
    }


}