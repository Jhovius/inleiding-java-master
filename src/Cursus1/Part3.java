package Cursus1;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class Part3 extends Applet {
    Scanner scan;


    public void init() {

        //opdracht 3.1
        System.out.println("Opdracht 3.1\n");
        scan = new Scanner(System.in);
        System.out.print("Hoeveel is 7+5: ");
        int cijfer = scan.nextInt();
        if (cijfer == 12) {
            System.out.print("Klopt: ");


        }
       else {
            scan = new Scanner(System.in);
            System.out.print("fout!: ");

        }
        scan = new Scanner(System.in);
        System.out.print("Hoeveel is 10+10: ");
        int number = scan.nextInt();
        if (number == 20) {
            System.out.print("Klopt");


        }
        else {

            System.out.print("fout!");


        }
        //opdracht 3.2
        scan = new Scanner(System.in);
        System.out.println("Opdracht 3.2\n");

        System.out.println("Hoeveel is 2 x 5 x 7 ?: ");
        int antwoord=scan.nextInt();
        if(antwoord==70);{
            System.out.print("helemaal goed!");
        }
        System.out.println("Hoeveel is 2 x 2 x 2 ?: ");
        int answer=scan.nextInt();
        if(answer==8);{
            System.out.print("helemaal goed!");
        }
        System.out.println("Hoeveel is 2 x 5 x 2 ?: ");
        int resultaat=scan.nextInt();
        if(resultaat==20);{
            System.out.print("helemaal goed!");
        }

        //opdracht 3.3
        scan = new Scanner(System.in);
        System.out.println("Opdracht 3.3\n");
        int maand=scan.nextInt();
        System.out.println("Welk nummer heeft de maand april");
        if(maand==4){
            System.out.println("Klopt,Dit is de maand april");
        }




    }


     public void paint(Graphics g){

        }


    }

