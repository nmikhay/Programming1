package Session7;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        if (checkPassword(password)) //if password is valid
            System.out.println("Your password is valid!");
        else    //otherwise password is not valid
            System.out.println("Your password in not valid");
    }

    public static boolean checkPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be minimum 8 characters long");
            return false;   //false because condition isn't respected
        }

        int digits = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                digits++;
            else if (Character.isLetter(ch))
                continue;
            else {
                System.out.println("Password can only contain letters and digits");
                return false;   //false bc condition is not respected here
            }

        }
        if (digits >= 2)
            return true;
        System.out.println("Password must contain at least 2 digits");
        return false;   //return false bc condition is respected here
    }
}
