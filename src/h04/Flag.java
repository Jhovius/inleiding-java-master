package h04;

import java.awt.*;
import java.applet.*;
public class Flag extends Applet {
    public void paint(Graphics g) {


      g.drawRect(50,18,3,300);
              g.setColor(Color.RED);
      g.drawRect(55,20,118,28);
      g.setColor(Color.blue);
      g.drawRect(55,80,117,20);


    }
}
