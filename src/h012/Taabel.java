package h012;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Taabel extends Applet {
    double getal[];
    int timesFound;
    Button knop;
    TextField textvak;
    String result = "";

    public void init() {
        getal = new double[8];

        getal[0] = 2;
        getal[1] = 3.4;
        getal[2] = 4.4;
        getal[3] = 4.8;
        getal[4] = 5.2;
        getal[5] = 7.4;
        getal[6] = 9;
        getal[7] = 11;

        knop = new Button();
        textvak = new TextField("", 20);
        knop.setLabel("ok");

        add(knop);
        add(textvak);

        textvak.addActionListener(new vakListener());
        knop.addActionListener(new vakListener());

    }

    public void paint(Graphics g) {
        g.drawString("Dit is :" + timesFound, 50, 20);
    }



    class vakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           String input = textvak.getText();
            double inputDouble = Double.parseDouble(input); //make it a double
            for (int teller = 0; teller < getal.length; teller++) {
                if (getal[teller] == inputDouble) {
                    result = "Match gevonden op index: " + teller + "!";
                    timesFound++;


                }
                result = "Geen match!";
            }
            repaint();
            // System.out.println(input);
        }
    }
}
