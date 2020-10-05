package H010;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Newpraktijk extends Applet {
    TextField textvak;
String text;


    public void init() {
        textvak = new TextField("", 30);

        add(textvak);

      textvak.addActionListener(new AAListener());
    }

    public void paint(Graphics g) {

    }


    class AAListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String userInput = textvak.getText();
            if (userInput.equals("1")) {
                text = "Dit is een slecht cijfer ";
            } else if
            (userInput.equals("2")) {
                text = "Dit is een slecht cijfer";
            }
            if
            (userInput.equals("3")) {
                text = "Dit is een slecht cijfer";
            }  if
            (userInput.equals("4")) {
                text = "Dit is cijfer is onvoldoende";
            if
            (userInput.equals("5")) {
                text = "dit is een matig cijer";
            }
            if
            (userInput.equals("6")) {
                text = "dit is een voldoende";
            }
            if
            (userInput.equals("7")) {
                text = "dit is een voldoende";
            }
            if
            (userInput.equals("8")) {
                text = "dit is een goed ";
            }
            if
            (userInput.equals("9")) {
                text = "dit is een goed";
            }
            if
            (userInput.equals("10")) {
                text = "dit is een goed";
            }
            else{
                text="dit is een verkeerd cijfer";
            }


            }


            }

        }



        }







