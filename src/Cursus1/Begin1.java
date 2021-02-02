package Cursus1;

import java.applet.Applet;
import java.awt.*;

public class Begin1 extends Applet {
    public void init() {


        //opdracht 1.1
        System.out.println("Java is Object Georiënteerd\n");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n\n");


        //opdracht 1.3
        System.out.println("opdracht1.3\n");
        System.out.println("a\ta^2\ta^3\ta^4");
        System.out.println("1\t1\t1\t1");
        System.out.println("2\t4\t8\t16");
        System.out.println("3\t9\t27\t81");
        System.out.println("4\t16\t64\t256\n\n");


        //opdracht 1.4
        System.out.println("opdracht1.4\n");
        Double teller=7.5 * 6.5 -4.5 *3;
        Double noemer=47.5*5.5;
        Double breuk=teller/noemer;
        System.out.println(breuk+ "\n\n");

        //opdracht 1.5
        System.out.println("opdracht1.5\n");

       int optelsom=1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
       System.out.println(optelsom);


       //opdracht 1.6
        System.out.println("opdracht1.6\n");
        Double pi = 4*(1 - 1.0/3 + 1.0/5 -1.0/7 +1.0/9- 1.0/11 + 1.0/13);
        System.out.println(pi);

        //opdracht 1.7
        System.out.println("opdracht1.7\n");
        Double DitIsPi=3.14159;
        Double straal=6.5;
        Double opervlakte=straal*straal*DitIsPi;
        Double omtrek=2*straal*DitIsPi;
        System.out.println("oppervlakkte="+opervlakte);
        System.out.println("omtrek=" +omtrek);


        //opdracht 1.8
        System.out.println("opdracht1.8\n");

        Double lengte=5.3;
        Double breedte=8.6;
        opervlakte=lengte*breedte;
        omtrek=2*(lengte+breedte);
        System.out.println("oppervlakte is="+opervlakte);
        System.out.println("omtrek is+"+omtrek);

    }




    public void paint(Graphics g) {
        //opdracht 1.2
        int teller;
        int y = 0;
        for (teller = 0; teller < 5; teller++) {

            y += 15;
            g.drawString("java is geweldig", 10, y + teller);


        }
    }
}

