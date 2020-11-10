package h012;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabel extends Applet {

    TextField tekstvak[];
    Button knop;
    String text;


    ////TextField textvak;

    public void init() {

        knop = new Button();
        knop.setLabel("ok");

        //textvak=new TextField();
        tekstvak = new TextField[5];
        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField(20);
            add(tekstvak[teller]);

            add(knop);

            knop.addActionListener(new RandomListener());

        }


    }

    public void paint(Graphics g) {

    }

    class RandomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String waarde1 = tekstvak[0].getText();
            String waarde2 = tekstvak[1].getText();
            String waarde3 = tekstvak[2].getText();
            String waarde4 = tekstvak[3].getText();
            String waarde5 = tekstvak[4].getText();

            tekstvak[0].setText("33");
            tekstvak[1].setText("23");
            tekstvak[2].setText("12");
            tekstvak[3].setText("7");
            tekstvak[4].setText("6");


            }
        }
    }

