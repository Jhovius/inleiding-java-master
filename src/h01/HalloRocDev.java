package h01;


import java.awt.*;
import java.applet.*;

/**
 * Created by piet on 31-08-16.
 */

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek





//een klasse met de naam Show van het type Applet
public class HalloRocDev extends Applet {

    //een (lege) methode die de Applet initialiseert

    //een methode die de inhoud van het scherm tekent
    public void init() {
        setBackground(Color.magenta);
    }


    public void paint(Graphics g) {



        g.drawString("Welcome to Java!!", 50, 60);
    }
}






