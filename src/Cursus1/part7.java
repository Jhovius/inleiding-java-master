package Cursus1;

import java.util.Scanner;

public class Main{


    public static void main(String[]args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Hier komen 100 worpen met een dobbelsteen");

        int[]dobbelsteenworpen=new int[100];

        for (int i = 0; 1 <100; i++) {

            int random=(int)(Math.random())*6+1;
            dobbelsteenworpen[i]=random;

            for(int worp:dobbelsteenworpen){


                int counter=1;
                System.out.println(worp+"");
                if(counter%10==0){
                    System.out.println();
                }
                counter++;
            }
        }
        //opdr 7.2
        System.out.print("Geef me 9 ingtegers");
        int[]getalen=new int [9];
        for (int i = 0; i <9 ; i++) {
            getalen[i]=scanner.nextInt();

            System.out.print("Daar komen ze in verkeerde volgorde");
            for (int j = 0; j <0 ; j--) {
                System.out.println(getalen[i],"");
                
            }
                
            }

        }
    }
    }
