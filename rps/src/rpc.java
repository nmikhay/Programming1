/*
package rpc;

import java.util.Random;
import java.util.Scanner;

public class rpc {
    public static void main (String[] args) {
        int r = 0;
        int p = 1;
        int s = 2;
        int me; //my choice
        int comp; //comp choice

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please make your choice : 0 = Rock, 1 = Paper or 2 = Scissors");


        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        me = scanner.nextInt();
        comp = random.nextInt(3);//comp]s choice will be numbers below 3 which are 0,1,2

        System.out.println("My choice is = " me + "Computer's choice =" +comp);

        if (comp == me) {
            System.out.println("It's a tie");
        }
        else if ((comp == r && me == s) || (comp == s && me == p) || (comp == p && me == r)) {
            System.out.println("The Computer WINS");
        }
        else if ((me == r && comp == s) || (me == s && comp == p) || (me == p && comp == r)) {

            System.out.println("You WIN");
        }

    }
}*/
