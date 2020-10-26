package H011;

import java.applet.Applet;
import java.awt.*;

public class Groter extends Applet {
    public void init() {

    }


    public void paint(Graphics g) {

        int x = 30, y = 30;
        int width = 10, height = 10;

        for (int teller = 0; teller < 100; teller++) {//teller = teller + 1
            g.drawOval(x, y, width, height);
            width += 25;
            height += 25;


        }
    }
}

