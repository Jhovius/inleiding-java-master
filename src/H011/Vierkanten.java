package H011;

import java.applet.Applet;
import java.awt.*;

public class Vierkanten extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.drawRect(20,50,50,50);
        g.drawRect(70,100,50,50);
        g.drawRect(120,150,50,50);
        g.drawRect(170,200,50,50);
        g.drawRect(220,250,50,50);
    }
}
