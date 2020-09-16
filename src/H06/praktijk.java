package H06;

import java.awt.*;
import java.applet.*;

public class praktijk extends Applet {

    double a;
    int gedeelt;
    double uitkomst;

    double b;
    int c;
    double resultaat;

    double d;
    int e;
    double result;


    public void init(){
         a= 5.9;
         gedeelt=2;
         uitkomst= a/gedeelt;

    b=6.3;
    c=2;
    resultaat= b/c;

    d=6.9;
    e=2;
    result=d/e;


    }

    public void paint(Graphics g) {

        g.drawString(" het gemiddelde van 5.9 =: " + uitkomst, 40, 40);
        g.drawString(" het gemiddelde van 6.3 =: " + resultaat, 60, 60);
        g.drawString(" het gemiddelde van 6.9 =: " + result , 80, 80);

    }
}