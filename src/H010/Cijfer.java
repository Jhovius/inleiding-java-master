package H010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Cijfer extends Applet {

    TextField textvak;
    Button knop;
    String text;

    public void init() {
        textvak= new TextField("",30);
        knop= new Button();
        knop.setLabel("ok");

        add(textvak);
        add(knop);

       knop.addActionListener(new RandomListener());


    }

    public void paint (Graphics g){
        setBackground(Color.gray);

        textvak.setLocation(50, 70);
        knop.setLocation(50,40);


    }
    class RandomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

       text="dit is je cijfer + gemiddelde";
       textvak.setText("4.4 en 6.8, gemiddelde=5.6");

        }
    }
}