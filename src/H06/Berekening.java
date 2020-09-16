package H06;
import java.awt.*;
import java.applet.*;

public class Berekening extends Applet {


    int minuut;
    int uur;
    int uitkomst;
    int uuur;
    int dag ;
    int uitkomst2;
    int dag2;
    int jaar;
    int hoeveel;

    public void init() {
        minuut =60 ;
        uur=60;

         uuur=3600;
         dag=24;

        uitkomst = minuut*uur;
        uitkomst2= uuur*dag;

        dag2=86400;
        jaar=365;

hoeveel= dag2*jaar;





    }
    public void paint(Graphics g) {
        g.drawString(" In een uur zit zoveel seconden: " + uitkomst, 40, 40);
g.drawString("in een dag zitten zoveel seconden:"+uitkomst2,60,60);
g.drawString("In een jaar zitten zoveel seconden:"+hoeveel , 80,80);

    }
}

