package H011;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int y = 50;
        int x = 50;
        int width = 20;
        int height= 20;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            }
            x += width;
        }

        x= 50;
        y += width ;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;

        }
    }
}
     





