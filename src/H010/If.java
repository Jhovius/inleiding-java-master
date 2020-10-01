package H010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class If extends Applet {
    TextField textvak;
    Label label;
    String text;



    public void init() {
        textvak= new TextField("",30);
        textvak.addActionListener( new DusListener() );
        text="";




        label=new Label("toets een cijfer en hou bij wat het hoogst is " );

        add(textvak);
        add (label);


    }
    public void paint (Graphics g){
       setBackground(Color.yellow);

        textvak.setLocation(50,70);
        g.drawString(text, 50, 150 );

    }
    class DusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String userInput = textvak.getText();
            if (userInput.equals("1")) {
                text = "Dit is het hoogste getal tot nu toe ";
            } else if
            (userInput.equals("2")) {
                text = "dit is het hoogste getal tot nu toe! ";
            }
            if
            (userInput.equals("3")) {
                text = "dit is het hoogste getal tot nu toe!!";
            }
            else if
            (userInput.equals("4")) {
                text = "dit is het hoogste getal tot nu toe!!! ";
            }
            if
            (userInput.equals("5")) {
                text = "dit is het hoogste getal tot nu toe!!!!";
            }
            if
            (userInput.equals("6")) {
                text = "dit is het hoogste getal tot nu toe!!!!!";
            }
            if
            (userInput.equals("7")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!";
            }
            if
            (userInput.equals("8")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!";
            }
            if
            (userInput.equals("9")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!";
            }
            if
            (userInput.equals("10")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!!";
            }
            if
            (userInput.equals("11")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!!!";
            }
            if
            (userInput.equals("12")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!!!!";
            }
            if
            (userInput.equals("13")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!!!!!";
            }
            if
            (userInput.equals("14")) {
                text = "dit is het hoogste getal tot nu toe!!!!!!!!!!!!";
            }

            textvak.setText("");
            repaint();


            }
        }
    }
