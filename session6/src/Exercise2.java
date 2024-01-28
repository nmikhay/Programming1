package session6.src;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        int pos =0;
        int neg =0;
        double total =0;


        Scanner input = new Scanner(System.in);
        System.out.print("PLease type out several numbers");

        int number = input.nextInt();
        if(number ==0){
            System.out.println("No number entered");
            System.exit(1);

        }
        int counter =0;
        while (number !=0){
            total += number; //same as total=total+number;
            counter++;
            if(number>0){
                pos++;
            }
            if(number<0){
                neg++;
            }
            number=input.nextInt();
        }
        double average = total / counter;

        System.out.println("Pos number "+ pos);
        System.out.println("Neg number "+ neg);
        System.out.println("Total "+ total);
        System.out.println("Average number "+ average);


    }
}
