package h012;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk12 extends Applet {
    TextField textvak;
    Button knop;
    String[] namen;
   int[] telefoonnummers;
    int indexNumber = 0;

    public void init() {


        knop = new Button();
        knop.setLabel("ok");

        textvak = new TextField("", 60);
        add(knop);
        add(textvak);

        knop.addActionListener(new randomListener());
        textvak.addActionListener(new randomListener());

        namen = new String[10];
        telefoonnummers = new int[10];
    }

    public void paint(Graphics g) {
            if (indexNumber == 10) {

                for (int teller = 0, x = 50, y = 50; teller < namen.length; teller++, y += 50) {
                    g.drawString("" + namen[teller] + telefoonnummers[teller], x, y);
                }


                }
                //zet alles op het scherm
                //fpor loopje
                //g.drawString
            }
        }





         class randomListener implements ActionListener {
          public void actionPerformed(ActionEvent e) {

            String naam = textvak.getText();
            namen[indexNumber] = naam;
            indexNumber++;
            System.out.println(indexNumber);





            int telefoonnummers = Integer.parseInt(textvak.getText());
        }

        //same for the phone numbers
           repaint() {

        }


    }






