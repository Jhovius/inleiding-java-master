package H011;

import java.applet.Applet;
import java.awt.*;

public class Line  extends Applet {
    public void init(){

    }
    public void paint (Graphics g){

        setBackground(Color.lightGray);

        g.drawLine(20,0,20,40);
        g.drawLine(50,0,50,70);
        g.drawLine(100,0,100,90);
        g.drawLine(200,0,200,130);
        g.drawLine(300,0,300,150);
        g.drawLine(400,0,400,170);
        g.drawLine(500,0,500,190);
        g.drawLine(600,0,600,210);
        g.drawLine(700,0,700,230);
        g.drawLine(800,0,800,250);
    }


}
