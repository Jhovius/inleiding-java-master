package H13;

import java.applet.Applet;
import java.awt.*;

public class Baksteen extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        setBackground(Color.red);

        tekenMuur(g, 20, 10);

    }

    public void tekenBaksteen(Graphics g, int x, int y, int width, int height) {
        g.drawRect(x,y,width,height);
    }

    public void tekenMuur (Graphics g,int width, int height) {
        int x = 0;
        int y = 0;
        for (int row = 0; row < 500 / height; row++){
            for(int column = 0;  column < 500 / width; column++){
                tekenBaksteen(g, x, y, width, height);
                x += width;
            }
            y += height;
            x = 0;
        }

    }
}


