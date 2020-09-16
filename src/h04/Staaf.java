package h04;

import java.awt.*;
import java.applet.*;

public class Staaf extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(145,230,8,100);
        g.drawRect(145,230,8,100);
        g.setColor(Color.RED);
        g.drawString("Valerie,40 KG",160,300);

        g.setColor(Color.blue);
        g.fillRect(115,170,8,140);
        g.drawRect(165,260,8,140);
g.setColor(Color.blue);
        g.drawString("Hans,80 KG",110,325);

       g.setColor(Color.green);
        g.fillRect(85,140,8,180);
        g.drawRect(195,300,8,180);

        g.drawString("Jeroen, 100 KG",30,335);

    }

    }

