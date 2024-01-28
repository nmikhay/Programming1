package Homework;

import java.util.Scanner;


public class Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Minutes(System.in);
        System.out.println("Please enter the amount of minutes you wish to convert into days and years");
        long minutes = scanner.nextLong();

        long days = 1440/ minutes;
        long years = 365/(1440/minutes);



        System.out.println("The number of days " + days + "and the number of years is " + years);

    }


}