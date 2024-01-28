package Homework;

import java.util.Scanner;

public class Homework {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of minutes you wish to convert into days and years");
        long minutes = scanner.nextLong();

        long days = minutes/1440;
        long years = (minutes/1440)/365;

        System.out.println("The number of days is " + days + " and the number of years is " + years);
    }

}
