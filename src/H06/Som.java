package H06;



import java.awt.*;
import java.applet.*;




public class Som extends Applet {
    int jan;
    int ali;
    int jeannette;
    int johan;
    int a;
    int uitkomst;


    public void init() {
        jan = 113;
        ali = 113;
        jeannette = 113;
        johan = 113;
        a = 4;

       uitkomst= jan/a;
        uitkomst= ali/a;
        uitkomst= jeannette/a;
        uitkomst= johan/a;


    }
    public void paint(Graphics g) {
        g.drawString(" Jan krijgt: " + uitkomst, 40, 40);
        g.drawString(" ali krijgt: " + uitkomst, 60, 60);
        g.drawString(" Jeannette krijgt: " + uitkomst, 80, 80);
        g.drawString(" Johan krijgt: " + uitkomst, 100, 100);
    }
}

