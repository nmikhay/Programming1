package Session7;

import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string consistent of minimum one word: ");
        String str = input.nextLine();
        System.out.print("Enter a letter found in your string: ");
        char a = input.nextLine().charAt(0);
        int letterCheck = Occurrence.count(str, a);
        System.out.println("The word was: " + str);
        System.out.println("The letter " + a + " repeated this many times: " + letterCheck);

    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }


}

