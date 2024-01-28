package Homework;

import java.util.Scanner;

public class Feet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value in feet ");
        double feet = scanner.nextLong();

        double meters = feet*0.305;
        System.out.println("The value in meters is " +meters);


        Scanner lbs = new Scanner(System.in);
        System.out.println("Please enter the value in pounds ");
        double pounds = lbs.nextLong();

        double kilos = pounds*0.454;

        System.out.println("The value in KGs is " +kilos);


    }





}
