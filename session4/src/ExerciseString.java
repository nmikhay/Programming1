package session4.Examples;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseString {
    public static void main(String[] args) {
        System.out.println("PLease type out a word");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str.endsWith("ly")){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println("PLease type out anything");
        Scanner color = new Scanner(System.in);
        String line = color.nextLine();
        if (line.startsWith("red"))
        {
            System.out.println("true");
        }
        else if(line.startsWith("blue")){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }


    }


    }

