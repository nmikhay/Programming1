package session3.assignments;

import java.util.Scanner;

public class examples {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num > 5){
            System.out.println("it it greater than 5");
        }
        else if(num < 5 ) {
            System.out.println("it it smaller than 5");
        }
        else{
            System.out.println("it equal 5");
        }
    }

}
