package Homework;

import java.util.Scanner;


public class celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value in Celsius ");
        double cels = scanner.nextLong();

        double fahr = cels * 1.8 + 32;
        System.out.println("The value in Farenheit is " + fahr);


    }

}

