package h04;

import java.awt.*;
import java.applet.*;

public class OldJava extends Applet{
    public void init () {
        setBackground(Color.blue);
    }


        ;  public void paint(Graphics g) {
        g.setColor(Color.yellow);

        g.fillArc(50,5,100,33,240,360);

    }



}

