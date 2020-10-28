package H08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Reken extends Applet {
    int getal;




        TextField textvak;
        TextField vak;
        Button knop;
        Button knopje;
        Button eenknop;
        Button button;

        public void init() {


            textvak = new TextField("Typ een getal hier");
            vak = new TextField("typ een getal hier");

            knop = new Button();
            knopje = new Button();
            eenknop = new Button();
            button = new Button();

            knop.setLabel("*");
            knopje.setLabel("/");
            eenknop.setLabel("+");
            button.setLabel("-");

            add(textvak);
            add(vak);
            add(knop);
            add(knopje);
            add(eenknop);
            add(button);


            H08.Reken.JaListener kll = new H08.Reken.JaListener();
            vak.addActionListener(kll);

            H08.Reken.KnopListener kl = new H08.Reken.KnopListener();
            textvak.addActionListener(kl);

            H08.Reken.NeeListener klll = new H08.Reken.NeeListener();
            knop.addActionListener(klll);

            H08.Reken.JawelListener kllll = new H08.Reken.JawelListener();
            knopje.addActionListener(kllll);

            H08.Reken.DaaromListener kllllll = new H08.Reken.DaaromListener();
            eenknop.addActionListener(kllllll);

            H08.Reken.DusListener klllllll = new H08.Reken.DusListener();
            button.addActionListener(klllllll);




        }

        public void paint(Graphics g) {

        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("6");
                vak.setText("");
                repaint();

            }
        }

        class JaListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("6");
                vak.setText("");
                repaint();
            }
        }

        class NeeListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("36");
                vak.setText("");
                repaint();
            }
        }
        class JawelListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("1");
                vak.setText("");
                repaint();
            }
        }
        class DaaromListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("12");
                vak.setText("");
                repaint();
            }
        }
        class DusListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                textvak.setText("0");

                vak.setText("");
                repaint();
            }
        }
    }






