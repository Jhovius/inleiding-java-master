import java.awt.*;
import java.applet.*;



public class main extends Applet {



    public void init() {
    }

    public void paint(Graphics g) {

        int x[]={100,70,130};
        int y[]={50,100,100};

        g.drawPolygon(x,y,3);

    }
}