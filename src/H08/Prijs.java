package H08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Prijs extends Applet{

    Button knop;
    TextField vak;
    Label label;
    double getal;
    double cijfer;
    double uitkomst;


    public void init(){
        knop= new Button();
        knop.setLabel("ok");
        vak=new TextField("150 incl 21% btw =");
        label= new Label();

      getal=21;
      cijfer=121;
      uitkomst=cijfer*getal;


        add(knop);
        add(vak);
        add(label);


        vak.setSize(400,300);
        label.setSize(400,300);

        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );


    }

    public void  paint (Graphics g){


    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
         vak.setText("176");
         repaint();
        }
    }



}
