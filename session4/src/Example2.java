package session4.Examples;

import java.util.Scanner;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Welcome to random generator");

        Random random = new Random(1);
        int chosenMonth = random.nextInt(12 - 1 + 1) ;

        switch (chosenMonth){
            case 1:
                System.out.println("Computer chose 1 so it will be January");
                break;
            case 2:
                System.out.println("Computer chose 2 so it will be February");
                break;
            case 3:
                System.out.println("Computer chose 3 so it will be March");
                break;
            case 4:
                System.out.println("Computer chose 4 so it will be April");
                break;
            case 5:
                System.out.println("Computer chose 5 so it will be May");
                break;
            case 6:
                System.out.println("Computer chose 6 so it will be June");
                break;
            case 7:
                System.out.println("Computer chose 7 so it will be July");
                break;
            case 8:
                System.out.println("Computer chose 8 so it will be August");
                break;
            case 9:
                System.out.println("Computer chose 9 so it will be September");
                break;
            case 10:
                System.out.println("Computer chose 10 so it will be October");
                break;
            case 11:
                System.out.println("Computer chose 11 so it will be November");
                break;
            case 12:
                System.out.println("Computer chose 12 so it will be December");
                break;



        }


    }
}
