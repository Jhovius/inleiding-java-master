package H13;

import java.applet.Applet;
import java.awt.*;

public class Driehoek extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        tekenDriehoek(g,100,50,70,100,130,100);
        tekenDriehoek(g,80,40,45,60,80,100);
        g.drawString("Dit is een diehoek",20,20);
        g.drawString(add(4, 5) + "", 40, 40);
        g.drawString(add(6,7) + "", 40, 60);


    }


    public void  tekenDriehoek  (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {


        int x[]={x1,x2,x3};
        int y[]={y1,y2,y3};

        g.drawPolygon(x,y,3);
        //tekenDriehoek(g,20,10,20,20,30,40);


    }

    public int add(int x, int y){
        return x + y;
    }




}

