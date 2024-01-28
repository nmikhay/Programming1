package Homework;

import java.util.Scanner;



public class circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the circle radius");
        double radius = scanner.nextLong();
        double pi = 3.14;
        double perimeter = 2*radius*pi;
        double area = radius*radius*pi;

        System.out.println("The perimeter " + perimeter + " and the area is " + area);



    }




}
