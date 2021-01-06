package H13;

import java.applet.Applet;
import java.awt.*;

public class Boom extends Applet {

    public void init()
    {
        setBackground(Color.cyan);
        setSize(400, 300);

    }

    public void paint(Graphics g)
    {





        tekenLeaves(g,75,75,100,100);
        tekenTree(g, 115, 175,20,100);




    }

    public void tekenLeaves(Graphics g,int x, int y ,int width, int height){




        g.setColor(Color.green);
        g.fillOval(x,y,width,height);
        g.setColor(Color.black);
        g.drawOval(x,y,width,height);

    }

    public void tekenTree(Graphics g,int x, int y,int width,int height){

    ;

        g.setColor(new Color(60, 60, 0));
        g.fillRect(x,y,width,height);




    }
}





