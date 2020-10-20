package H011;

import java.awt.*;
import java.applet.Applet;

public class Tafel extends Applet {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int uitkomst;
    int uitkomstt;
    int uitkomsttt;
    int uitkoms;
    int uitkom;
    int uitko;
    int uitk;
    int uit;
    int ui;
    int u;


    public void init(){
        a=1;
        b=2;
        c=3;
        d=4;
        e=5;
        f=6;
        g=7;
        h=8;
        i=9;
        j=10;

        uitkomst=a*c;
        uitkomstt=b*c;
        uitkomsttt=c*c;
        uitkoms=d*c;
        uitkom=e*c;
        uitko=f*c;
        uitk=g*c;
        uit=h*c;
        ui=i*c;
        u=j*c;

    }
    public void paint (Graphics g){
        g.drawString("" + uitkomst, 20, 20);
        g.drawString("" + uitkomstt, 35, 35);
        g.drawString("" + uitkomsttt, 50, 50);
        g.drawString("" + uitkoms, 70, 70);
        g.drawString("" + uitkom, 90, 90);
        g.drawString("" + uitkom, 110, 110);
        g.drawString("" + uitko, 130, 130);
        g.drawString("" + uitk, 150, 150);
        g.drawString("" + uit, 170, 170);
        g.drawString("" + ui, 190, 190);
        g.drawString("" + u, 210, 210);

    }
}
