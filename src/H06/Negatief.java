package H06;
import java.awt.*;
import java.applet.*;

public class Negatief extends Applet {

    double a;
    double b;
 double uitkomst;




    public void init(){
     a =1273741823.5;
     b  =1273741823.5;

     uitkomst=a+b;





    }

    public void paint(Graphics g) {
        g.drawString("Dit is een negatief getal:"+uitkomst,60,60);
    }
}