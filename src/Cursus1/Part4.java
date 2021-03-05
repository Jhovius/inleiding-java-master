package Cursus1;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Part4 extends Applet {
    Scanner scaan = new Scanner(System.in);

    public void init() {

        //Opdracht 4.1
        System.out.print("\n Van welk karakter wil je de ASCII waarde weten?: ");
        char userInput = scaan.nextLine().charAt(0);
        int asciiValue = (int) userInput;
        System.out.print("De ASCII waarde van het karakter" + userInput + "is" + asciiValue + ".");


        //Opdracht 4.2

        System.out.print("\n Van welk karakter wil je weten of het een getal of letter is?: ");
        userInput = scaan.nextLine().charAt(0);
        if (Character.isLetter(userInput)) {
            System.out.print("De" + userInput + "is een letter.");
        } else if (Character.isDigit(userInput)) {
            System.out.print("De" + userInput + "is een getal.");
        } else {
            System.out.print("De" + userInput + "is geen letter en ook geen getal.");
        }
        //Opdracht 4.3
        System.out.print("\n Van welke letter wil je weten of het een klinker is?:");

        if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') ;
        {

            System.out.println("De" + userInput + "is een klinker.");
        } else{
            System.out.println("De" + userInput + "is een klinker.");

        }

        //Opdracht 4.4
        System.out.print("\n Van welke letter wil je het nummer in International standard letter/number mapping weten?");
        userInput=scaan.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c'){
            System.out.println("De letter"+userInput+"staat op de 2-toets");
        }else if(userInput == 'd' || userInput == 'e' || userInput == 'f') {
            System.out.println("De letter" + userInput + "staat op de 3-toets");
        }
        //Opdracht 4.5
        int randomNumber=(int)(Math.random()*26+97);
        char asciiChar=(char)randomNumber;
        System.out.println("Uw willekeurige letter is de "+asciiChar+"n");

        //Opdracht 4.6
        System.out.print("\n Typ een String");
        String userString=scaan.nextLine();
        int length=userString.length();
        System.out.println("de lengte van de string is "+length+".");
        char firstChar=userString.charAt(0);
        System.out.println("Het eerste karakter is"+firstChar+".");
        char lastChar=userString.charAt(length-1);
        System.out.println("Het laatste karakter is"+lastChar+"n");



        //Opdracht 4.7
        System.out.print("Land1");
        String country1=scaan.nextLine();
        System.out.print("Land2");
        String country2=scaan.nextLine();
        System.out.print("Land3");
        String country3=scaan.nextLine();
        String[] countries={country1,country2,country3};
        Arrays.sort(countries);
        System.out.println(countries[0]+"-"+countries[1]+"-"+countries[2]);



    }
}
