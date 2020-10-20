package H010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Cijfer extends Applet {
    TextField textvak;
    String text;

    public void init(){
        textvak= new TextField("",30);




        add(textvak);


        textvak.addActionListener( new EenListener() );


    }
    public void paint (Graphics g){

    }
    class EenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = textvak.getText();
            if (userInput.equals("1")) {
                text = "Dit Cijfer is onvoldoende ";
            } else if
            (userInput.equals("2")) {
                text = "Dit Cijfer is onvoldoende  ";
            }
            if
            (userInput.equals("3")) {
                text = "Dit Cijfer is onvoldoende ";
            } else if
            (userInput.equals("4")) {
                text = "Dit Cijfer is onvoldoende  ";
            }
            if
            (userInput.equals("5")) {
                text = "Dit Cijfer is onvoldoende ";
            }
            if
            (userInput.equals("6")) {
                text = "dit cijfer is voldoende";
            }
            if
            (userInput.equals("7")) {
                text = "Dit Cijfer is voldoende ";
            }
            if
            (userInput.equals("8")) {
                text = "dit cijfer is voldoende";
            }
            if
            (userInput.equals("9")) {
                text = "dit cijfer is voldoende";
            }
            if
            (userInput.equals("10")) {
                text = "dit cijfer is voldoende";

                repaint();
            }









        }
        }
}
