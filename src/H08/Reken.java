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


        JaListener kll = new JaListener();
        vak.addActionListener(kll);

        KnopListener kl = new KnopListener();
        textvak.addActionListener(kl);

        NeeListener klll = new NeeListener();
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





