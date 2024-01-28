package Session7;

import java.util.Scanner;

public class Assignments3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive number: ");
        int n = input.nextInt();
        if (n < 0) ;
        System.out.println("Void number");
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) { //amount of rows=same as input number by user, numbers random 1 or 0
            for (int cols = 0; cols < n; cols++) { // -||-
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }
    }

}

