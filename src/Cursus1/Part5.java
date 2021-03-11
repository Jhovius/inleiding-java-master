package Cursus1;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class Part5 extends Applet {
    Scanner scaaann=new Scanner(System.in);

    public void init(){

        //Opdracht 5.1
        boolean proceed=true;
        while(proceed){
            System.out.print("\n Wat is je toetscijfer;?");
            double grade =scaaann.nextDouble();
            if (grade== -1) {
                System.out.println("Tot ziens.");
                proceed = false;
                continue;
            }else if(grade>=5.5) {
                System.out.println("Je hebt een voldoende");
            }else {
                System.out.println("Helaas je hebt een onvoldoende");
            }
        }
        //Opdracht 5.2
        int score=0;
        for (int i = 0; i <10 ; i++) {
            int getal1=(int)(Math.random()*10+1);
            int getal2=(int)(Math.random()*10+1);
            int optelsom=getal1+getal2;
            System.out.println("\n hoeveel is "+getal1+"+"+getal2+"?");
            int userInput=scaaann.nextInt();
            if(userInput== optelsom) {
                System.out.println("Dat klopt!");
            }else{
                System.out.println("Helaas, het goede antwoord is"+optelsom+".");
        }
        }
        System.out.println("de toets is klaar.Je score is"+score+".");

        //opdracht 5.3
        for (int i = 1; i < 10; i++) {
            int product=i*7;
            System.out.println(i+"x7="+product);
        }
        //opdracht 5.4
        int lowestnumber=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Typ een getal:");
            int number=scaaann.nextInt();
            if(i==0) {
                lowestnumber = number;
            }else{
                if(number<lowestnumber){
                    lowestnumber=number;
                }
            }
        }
        System.out.println("Het laagste getal wat je hebt getypt was"+lowestnumber+".");

        //opdracht 5.5
        double highestGrade=0;
        String student="unknown";
        for (int i = 1; i <=5 ; i++) {
            System.out.print("hoe heet de " + i + "e student?");
            String name = scaaann.nextLine();
            System.out.println("Wat was zijn of haar cijfer");
            double grade = scaaann.nextDouble();
            scaaann.nextLine();
            if (i == 0) {
                highestGrade = grade;
                student = name;
            } else {
                if (grade > highestGrade) {
                    highestGrade = grade;
                    student = name;
                }
            }
        }
        System.out.println("Het hoogste cijfer is behaald door"+student+".");
        System.out.println("Hij of zei had een"+highestGrade+".");

        //opdracht 5.6
        for (int i = 0; i < 100; i++) {
            if(i % 5==0){
                System.out.println(i+"is deelbaar door 5.");

            }
        }
        //opdracht 5.7

        proceed=true;
        int counter=0;
        while(proceed){
            int square=counter*counter;
            if(square<1000) {
                System.out.println("het getal is " + counter);
                System.out.println("het kwadraat daarvan is" + square);
                counter++;
            }else{
                proceed=false;
            }
        }
    }
    public void paint (Graphics g){

    }
}
