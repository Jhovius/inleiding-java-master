package H010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Laagtse {

    public class If extends Applet {
        TextField textvak;
        Label label;
        String text;



        public void init() {
            textvak= new TextField("",30);
            textvak.addActionListener( new RandomListener() );
            text="";




            label=new Label("toets een cijfer en hou bij wat het laagst is " );

            add(textvak);
            add (label);
        }









        public void paint (Graphics g){
            setBackground(Color.yellow);

            textvak.setLocation(50,70);
            g.drawString(text, 50, 150 );

        }
        class RandomListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                String userInput = textvak.getText();
                if (userInput.equals("1")) {
                    text = "Dit is het laagste getal tot nu toe ";
                } else if
                (userInput.equals("50")) {
                    text = "dit is het laagste getal tot nu toe! ";
                }
                if
                (userInput.equals("49")) {
                    text = "dit is het laagste getal tot nu toe!!";
                }
                else if
                (userInput.equals("48")) {
                    text = "dit is het laagste getal tot nu toe!!! ";
                }
                if
                (userInput.equals("47")) {
                    text = "dit is het laagste getal tot nu toe!!!!";
                }
                if
                (userInput.equals("46")) {
                    text = "dit is het laagste getal tot nu toe!!!!!";
                }
                if
                (userInput.equals("45")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!";
                }
                if
                (userInput.equals("44")) {
                    text = "dit is het Laagste getal tot nu toe!!!!!!!";
                }
                if
                (userInput.equals("43")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!";
                }
                if
                (userInput.equals("42")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!!";
                }
                if
                (userInput.equals("41")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!!!";
                }
                if
                (userInput.equals("40")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!!!!";
                }
                if
                (userInput.equals("39")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!!!!!";
                }
                if
                (userInput.equals("38")) {
                    text = "dit is het laagste getal tot nu toe!!!!!!!!!!!!";
                }


                textvak.setText("");
                repaint();


            }
        }
    }


}

