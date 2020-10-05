package H010;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Uitgebreide extends Applet {

    TextField textvak;
    TextField vak;
    Label label;
    String text;
    String s, tekst;
    int jaartal;


    public void init() {
        textvak = new TextField("", 30);
        vak = new TextField("", 60);

        vak.addActionListener(new IfListener());
        ;
        textvak.addActionListener(new DusListener());
        text = "";


        label = new Label("Toets het maand nummer in en zie welke maand het is + aantal dagen ");

        add(textvak);
        add(label);


    }

    public void paint(Graphics g) {
        setBackground(Color.pink);

        textvak.setLocation(50, 70);
        g.drawString(text, 50, 150);

    }

    class DusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String userInput = textvak.getText();
            if (userInput.equals("01")) {
                text = "Dit is de maand januari en heeft 31 dagen ";
            } else if
            (userInput.equals("02")) {
                text = "dit is de maand februari en heeft 28 dagen ";
            }
            if
            (userInput.equals("03")) {
                text = "Dit is de maand maart , en heeft 31 dagen";
            } else if
            (userInput.equals("04")) {
                text = "Dit is de maand april en heeft 30 dagen ";
            }
            if
            (userInput.equals("05")) {
                text = "dit is de maand mei en heeft 31 dagen";
            }
            if
            (userInput.equals("06")) {
                text = "dit is de maand juni en heeft 30 dagen";
            }
            if
            (userInput.equals("07")) {
                text = "dit is de maand juli en heeft 31 dagen";
            }
            if
            (userInput.equals("08")) {
                text = "dit is de maand augustus en heeft 31 dagen";
            }
            if
            (userInput.equals("09")) {
                text = "dit is de maand september en heeft 30 dagen";
            }
            if
            (userInput.equals("010")) {
                text = "dit is de maand oktober en heeft 31 dagen";
            }
            if
            (userInput.equals("011")) {
                text = "dit is de maand november en heeft 30 dagen";
            }
            if
            (userInput.equals("012")) {
                text = "dit is de maand december en heeft 31 dagen";
            }
            if
            (userInput.equals("2008")) {
                text = "dit is 2008 en eenSchrikkelJaar!";
            }
            if
            (userInput.equals("2012")) {
                text = "Dit is 2012 en dus eenSchrikkelJaar!!";
            }

            if
            (userInput.equals("2016")) {
                text = "dit is 2016 en eenSchrikkelJaar!!!";
            }

            if
            (userInput.equals("2020")) {
                text = "dit is 2020 en eenSchrikkelJaar!!!!";
            }


            textvak.setText("");
            repaint();


        }
    }

    class IfListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = vak.getText();
            jaartal = Integer.parseInt(s);

            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar";
            }
            repaint();

        }
    }
}
