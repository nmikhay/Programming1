package session4.Examples;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a number: Sunday = 0, Monday = 1, Tuesday =2, Wednesday =3, Thursday = 4, Friday = 5, Saturday = 6");
        int userDay = input.nextInt();
        if(userDay > 6 || userDay <0 ){
            System.out.println("Incorrect value");
        }
        else {
            System.out.println("Enter the number of days for your future date");
            int addDay = input.nextInt();

        int futureDay = (userDay +addDay) %7;

        switch (futureDay) {

            case 0:
                System.out.println("It will be Sunday");
            case 1:
                System.out.println("It will be Monday");
                break;
            case 2:
                System.out.println("It will be Tuesday");
                break;
            case 3:
                System.out.println("It will be Wednesday");
                break;
            case 4:
                System.out.println("It will be Thursday");
                break;
            case 5:
                System.out.println("It will be Friday");
                break;
            case 6:
                System.out.println("It will be Saturday");
              break;
        }

    }
        input.close();
    }
}

