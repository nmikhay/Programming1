package FinalExam;

import java.util.Scanner;

public class AllFactors {

    public static void main(String[] args) {

        int a;
        System.out.println("Enter any number");
        Scanner userNumber = new Scanner(System.in);
        a = userNumber.nextInt();

        for(int i =1; i<=a; i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
