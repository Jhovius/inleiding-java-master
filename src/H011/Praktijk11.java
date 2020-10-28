package H011;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk11 extends Applet {

    Button button;
    Button buttonn;
    Button buttonnn;
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;


    TextField textvak;
    Label brr;
    String text;


    public void init() {
        button = new Button();


        button.setLabel(" ok ");


        textvak = new TextField("", 100);
        brr = new Label("Typ een getal en zie de tafel van dat getal verschijnen");





        add(textvak);
        add(brr);
        add(button);


        button.addActionListener(new EenListener());



    }

    public void paint(Graphics g) {

        button.setLocation(20, 20);
        textvak.setLocation(50, 50);


    }

    class EenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("1x1=1  1x2=2 1x3=3 1x4=4 1x5=5 1x6=6 1x7=7 1x8=8 1x9=9 1x10=10 ");
            repaint();


        }

    }
}
