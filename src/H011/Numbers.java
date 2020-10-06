package H011;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Numbers extends Applet {
    TextField textvak;
    Button knop;
    Button knopje;
    Button knopper;
    Button knopp;
    Button eenknop;
    Button ditknop;
    Button knoler;
    Button click;
    Button toets;
    Button ja;
    Button nee;



    public void init(){
        textvak= new TextField("",30);
        knop=new Button();
        knopje= new Button();
        knopper=new Button();
        knopp=new Button();
        eenknop=new Button();
        ditknop=new Button();
        knoler=new Button();
        click=new Button();
        toets=new Button();
        ja = new Button();
        nee=new Button();

        knop.setLabel("tien");
        knopje.setLabel("elf");
        knopper.setLabel("twaalf");
        knopp.setLabel("dertien");
        eenknop.setLabel("veertien");
        ditknop.setLabel("vijftien");
        knoler.setLabel("zestien");
        click.setLabel("zeventien");
        toets.setLabel("achtien");
        ja.setLabel("negentien");
        nee.setLabel("twintig");


        add(textvak);
        add(knop);
        add(knopje);
        add(knopper);
        add(knopp);
        add(eenknop);
        add(ditknop);
        add(knoler);
        add(click);
        add(toets);
        add(ja);
        add(nee);

        knop.addActionListener(new KnopListener());
        knopje.addActionListener(new WatListener());
        knopper.addActionListener(new UhmListener());
        knopp.addActionListener(new CijferListener());
        eenknop.addActionListener(new JaaListener());
        ditknop.addActionListener(new NeeListener());
        knoler.addActionListener(new RandomListener());
        click.addActionListener(new DusListener());
        toets.addActionListener(new NaamListener());
        ja.addActionListener(new PietListener());
        nee.addActionListener(new JavaListener());




    }
    public void paint (Graphics g ){
        setBackground(Color.orange);


    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("10");
            repaint();

        }
    }
    class WatListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("11");
            repaint();

        }
    }
    class UhmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("12");
            repaint();

        }
    }
    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("13");
            repaint();

        }
    }
    class JaaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("14");
            repaint();

        }
    }
    class NeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("15");
            repaint();

        }
    }
    class RandomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("16");
            repaint();

        }
    }
    class DusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("17");
            repaint();

        }
    }
    class NaamListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("18");
            repaint();

        }
    }
    class PietListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("19");
            repaint();

        }
    }
    class JavaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textvak.setText("20");
            repaint();

        }
    }


        }

