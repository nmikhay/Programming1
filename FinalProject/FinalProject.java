package FinalProject;

import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {

        int i, j, a, b, f, e, l, h, o, p, t, r, number, n = 4, c = 6, m = 5, k = 6, s = 4;
        int smallest,largest,sum;
        patternA(n);
        patternB(c);
        patternC(m);
        patternD(k);
        patternE(s);
        //myArray([]);

    }

    public static void patternA(int n) {
        System.out.println("This is pattern A: ");
        System.out.print("\n");
        for (int i = 0; i <= n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static void patternB(int c) {
        System.out.println("This is pattern B: ");
        System.out.print("\n");
        for (int a = c - 1; a >= 0; a--) {
            int number = 6;
            for (int b = 0; b <= a; b++) {
                System.out.print(number + " ");
                number--;
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static void patternC(int m) {
        System.out.println("This is pattern C: ");
        System.out.print("\n");
        for (int e = 0; e <= m; e++) {
            m = 5;
            int number = 1;
            for (int f = m; f > e; f--) {
                System.out.print(" ");
            }
            for (number = 1; number <= e; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
        System.out.print("\n");

    }

    public static void patternD(int k) {
        System.out.println("This is pattern D: ");
        System.out.print("\n");
        for (int h = k; h >= 1; h--) {
            int number = 0;
            for (int o = 1; o <= h; o++) {
                number++;
                System.out.print(number);
            }
            System.out.println();
        }
        System.out.print("\n");
    }

    public static void patternE(int s) {
        System.out.println("This is pattern E: ");
        System.out.print("\n");
        int t = 0;
        for (int i = 1; i <= s; ++i, t = 0) {
            for (int space = 1; space <= s - i; ++space) {
                System.out.print("  ");
            }
            while (t != 2 * i - 1) {
                System.out.print("* ");
                ++t;
            }
            System.out.println();
        }
        System.out.print("\n");
    }

/*
    public static void myArray(String[] args) {
        int myArray[] = {13, 22, 29, 17, 33, 222, 84, 68, 4, 396};
        int smallest = myArray[0];
        int largest = myArray[0];
        int sum = smallest + largest;

        for (int r = 1; r < myArray.length; r++) {
            if (myArray[r] > largest)
                largest = myArray[r];
            else if (myArray[r] < smallest)
                smallest = myArray[r];
        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
        System.out.println("The sum of the largest and the smallest numbers is: " + sum);
    }

          */

}


