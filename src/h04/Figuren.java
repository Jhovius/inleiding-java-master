package h04;

import java.awt.*;
import java.applet.*;



public class Figuren extends Applet {

    public void paint (Graphics g){
g.setColor(Color.magenta);
g.fillOval(20,20,50,100);
        g.drawOval(20, 20, 50, 100);
        g.drawString("Gevulde ovaal",10,10);
    }







}
