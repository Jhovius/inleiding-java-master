package H011;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijk2 extends Applet {
    int getal;

    TextField textvak;
    TextField vak;
    Button knop;
    Button knopje;
    Button eenknop;
    Button button;
    Button a;
    Button b;
    Button c;
    Button d;
    Button dd;
    Button ddd;

    public void init() {


        textvak = new TextField("Typ een getal hier");
        vak = new TextField("typ een getal hier");

        knop = new Button();
        knopje = new Button();
        eenknop = new Button();
        button = new Button();
        a=new Button();
        b=new Button();
        c=new Button();
        d=new Button();
        dd=new Button();
        ddd=new Button();

        knop.setLabel("1");
        knopje.setLabel("2");
        eenknop.setLabel("3");
        button.setLabel("4");
        a.setLabel("5");
        b.setLabel("6");
        c.setLabel("7");
        d.setLabel("8");
        dd.setLabel("9");
        ddd.setLabel("10");

        add(textvak);
        add(vak);
        add(knop);
        add(knopje);
        add(eenknop);
        add(button);
        add(a);
        add(b);
        add(c);
        add(d);
        add(dd);
        add(ddd);


        JaListener kll = new JaListener();
        vak.addActionListener(kll);

   KnopListener kl = new KnopListener();
        textvak.addActionListener(kl);

   NeeListener klll = new  NeeListener();
        knop.addActionListener(klll);

        JawelListener kllll = new JawelListener();
        knopje.addActionListener(kllll);

      DaaromListener kllllll = new DaaromListener();
        eenknop.addActionListener(kllllll);

       DusListener klllllll = new DusListener();
        button.addActionListener(klllllll);




    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("1x1 2x1 3x1 4x1 5x1 6x1 7x1 8x1 9x1 10x1 ");
            vak.setText("");
            repaint();

        }
    }

    class JaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("1x1 2x2 3x2 4x2 5x2 6x2 7x2 8x2 9x2 10x2");
            vak.setText("");
            repaint();
        }
    }

    class NeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("3 x 1 = 3 3 x 2 = 6 3 x 3 = 9 3 x 4 = 12 3 x 5 = 15 3 x 6 = 18 3 x 7 = 21 3 x 8 = 24 3 x 9 = 27 3 x 10 = 30");
            vak.setText("");
            repaint();
        }
    }
    class JawelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("4 x 1 = 4 4 x 2 = 8 4 x 3 = 12 4 x 4 = 16 4 x 5 = 20 4 x 6 = 24 4 x 7 = 28 4 x 8 = 32 4 x 9 = 36 4 x 10 = 40");
            vak.setText("");
            repaint();
        }
    }
    class DaaromListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("5 x 1 = 5 5 x 2 = 10 5 x 3 = 15 5 x 4 = 20 5 x 5 = 25 5 x 6 = 30 5 x 7 = 35 5 x 8 = 40 5 x 9 = 45 5 x 10 = 50");
            vak.setText("");
            repaint();
        }
    }
    class DusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("6 x 1 = 6 6 x 2 = 12 6 x 3 = 18 6 x 4 = 24 6 x 5 = 30 6 x 6 = 36 6 x 7 = 42 6 x 8 = 48 6 x 9 = 54 6 x 10 = 60");

            vak.setText("");
            repaint();
        }
    }
}