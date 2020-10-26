package H011;

import java.applet.Applet;
import java.awt.*;

public class V50 extends Applet {
    public void init(){

    }

    public void paint (Graphics g){
        int x = 300, y = 300;
        int width = 10, height = 10;

        for (int teller = 0; teller < 50; teller++){ //teller = teller + 1
            g.drawOval(x,y,width,height);
            width += 10;
            height += 10;
            x -= 5;
            y -= 5;
        }

        // g.drawOval(10,20,50,40);
    }
}