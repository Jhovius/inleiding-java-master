package Cursus1;

import java.applet.Applet;
import java.awt.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class Opdracht2 extends Applet {

    Scanner scanner;
    Scanner scan;
    Scanner scann;
    Scanner scannn;

    public void init(){

        //opdracht 2.1
        System.out.println("Opdracht 2.1\n");
        scanner=new Scanner(System.in);
        System.out.print("Typ het aantal mijlen: ");
        Double mijlen = scanner.nextDouble();
        Double kilometers=mijlen*1.6;
        int afgerond=(int)(kilometers*10);
        kilometers=afgerond/10.0;

        System.out.println(mijlen +"mijlen is " +kilometers + "kilometer\n\n");

        //opdracht 2.2

        System.out.println("Opdracht 2.2\n");
        scan=new Scanner(System.in);
        System.out.print("Hoeveel jaar oud ben je: ");
        int jaren=scanner.nextInt();
        System.out.print("Hoeveel maanden komen daar nog bij: ");
        int maanden=scanner.nextInt();
        int minuten=jaren*365*24*60+maanden*30*24*60;
        System.out.print("Dan ben je nu ongeveer: "+minuten+ " minuten oud: ");

        //opdracht 2.3

        System.out.println("Opdracht 2.3\n");
        scann=new Scanner(System.in);
        System.out.print("typ het start bedrag: ");
        double startbedrag=scanner.nextDouble();
        System.out.print("typ het Rentepercentage: ");
        double rentepercentage= scan.nextDouble();
        double rentebedrag= rentepercentage/100*startbedrag;
        double resultaat=startbedrag+rentebedrag;
        System.out.println("de rente is: "+rentebedrag+"en het totaalbedrag: "+resultaat+"\n\n");


        //opdracht 2.4

        System.out.println("Opdracht 2.4\n");
        scannn=new Scanner(System.in);
        System.out.print("Typ een getal tussen 10 en 100: ");
        int input= scannn.nextInt();
        int ernaast= input-2;
        int ernaastt= input-1;
        int ernaasttt=input+1;
        int ernast=input+2;
        System.out.print("De vijf getallen zijn "+ernaast+ernaastt+input+ernaasttt+ernast);


        //opdracht 2.5

        System.out.println("Opdracht 2.5\n");
        System.out.println("Typ een getal tussen 0 en 1000: ");
        scannn=new Scanner(System.in);
            int Userinput=scannn.nextInt();
            int lastdegit=Userinput%10;
            Userinput=Userinput/10;

            int middleDegit=Userinput%10;
            Userinput=Userinput/10;

            int firstdegit= Userinput;

            int product=firstdegit*middleDegit*lastdegit;
            System.out.println("De vermenigvuldiging van de cijfers luidt:"+firstdegit+"x"+middleDegit+'x'+lastdegit+'x'+product);


        }









    public void paint(Graphics g){

    }
}
