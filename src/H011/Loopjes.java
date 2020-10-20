package H011;

import java.applet.Applet;
import java.awt.*;

public class Loopjes extends Applet {

    int  a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int uitkomst;
    int uitkomstt;
    int uitkomsttt;
    int r;
    int h;
    int j;
    int tt;




    public void init(){
        a=1;
        b=2;
        c=3;
        d=5;
        e=8;
        f=13;
        g=21;

        uitkomst=a+a;
        uitkomstt=b+a;
        uitkomsttt=c+b;
        r=d+c;
        h=e+d;
        j=f+e;
        tt=g+f;



    }
    public void paint (Graphics g){
        g.drawString("1,1," + uitkomst, 20, 20);
        g.drawString("" + uitkomstt, 40, 40);
        g.drawString("" + uitkomsttt, 60, 60);
        g.drawString("" + r, 80, 80);
        g.drawString("" + h, 100, 100);
        g.drawString("" + j, 120, 120);
        g.drawString("" + tt, 140, 140);


        }
    }
