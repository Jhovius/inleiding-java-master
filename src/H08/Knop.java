package H08;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Knop extends Applet {
    Button knop;
    Button knopje;
    Button button;
    Button click;
    TextField vak;
    String zoveel;

    public void init() {


knop= new Button();
knop.setLabel("1");
knopje= new Button();
knopje.setLabel("ok");
KnopListener kl = new KnopListener();
knopje.addActionListener(kl);

button = new Button();
button.setLabel("2");
click = new Button();
click.setLabel("3");
vak= new TextField("Circa zoveel bezoekers");

add(knop);
add(knopje);
add(button);
add(click);
add(vak);



    }
    public void paint (Graphics g){
        vak.setSize(770,300);
        vak.setLocation(20,20);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            zoveel = "Circa zoveel mannen komen er ";
            vak.setText("Mannen:30 vrouwen;20  mannenlijke: 70 vrouwelijke 80;");
            repaint();
        }
    }


}