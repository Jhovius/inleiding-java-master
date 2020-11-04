package h012;

import java.applet.Applet;
import java.awt.*;

public class Twaalf extends Applet {

    double getal[];


    public void init() {

        getal = new double[10];


        getal[0] = 1.3;
        getal[1] = 2.0;
        getal[2] = 4.2;
        getal[3] = 3.8;
        getal[4] = 5.0;
        getal[5] = 6.0;
        getal[6] = 7.2;
        getal[7] = 9.2;
        getal[8] = 8.3;
        getal[9] = 6.8;

        double sum = 0.0;

        for (int teller = 0; teller < getal.length; teller++) {
            sum = sum + getal[teller];

            double number = 53.8;


                number = number / getal[teller];


        }
        System.out.println(sum);
        System.out.println(58.3/10);


    }


    public void paint(Graphics g) {


        g.drawString("Dit is :" + getal[5], 50, 20);



    }

}


