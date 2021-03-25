package Cursus1;

import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;

public class main{


    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        String userInput;

        //opdracht 6.1
        printZinnetje();

        //opdracht 6.2
        System.out.print("Welk zinnentje wilt u printen");
        userInput=scanner.nextLine();
        printZinnetje(userInput);


        //opdracht 6.3

        int getal1=(int)(Math.random())*10+1;
        int getal2=(int)(Math.random())*10+1;
        int product=berekenproduct(getal1,getal2);
        System.out.println("Het product van"+getal1+"en"+getal2+"is"+product+".");



    }
    public static void printZinnetje(){
        System.out.println("Hello world");
    }
    public static void (String zinnetje){
        System.out.println(zinnetje);

    }
    public static int berekenproduct(int getal1,int getal2){

    }


}
