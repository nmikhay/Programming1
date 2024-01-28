import java.util.Scanner;

public class ColorString {


    public static void main(String[] args) {

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
