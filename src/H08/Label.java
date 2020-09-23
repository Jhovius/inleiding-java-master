package H08;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Label extends Applet {
    TextField textvak;
    Label label;
    Button knop;
    Button knopje;
    String inputUser;
    String testt;

    public void init() {
        inputUser = "[[de gebruiker heeft nog niets ingevuld]]";
        setBackground(Color.cyan);
        textvak = new TextField("Type iets hier", 20);
        label = new Label();
        knop = new Button();
        knop.setLabel("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        textvak.setLocation(50, 60);
        add(textvak);
        add(label);
        knop.setLocation(20, 20);
        add(knop);

        knopje = new Button();
        knopje.setLabel("reset");
        EenListener kll = new EenListener();
        knopje.addActionListener(kll);
        knopje.setLocation(100, 20);
        add(knopje);
    }

    public void paint(Graphics g) {

        g.drawString("Type iets hier", 50, 100);
        g.drawString("De input van de gebruiker is  " + inputUser, 50, 200);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //gebruiker drukt op ok-knop
            //gebruiker komt in deze methode terecht
            //---
            //wij willen weten wat de gebruiker in het tekstvak heeft getypt
            inputUser = textvak.getText();
            //wij willen wat de gebruiker heeft getypt op de applet / het scherm tonen
            repaint();
        }

    }

    class EenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(textvak.getText() + "123");
            textvak.setText("");
            repaint();
        }
    }
}



