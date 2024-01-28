package session6.src;

public class Exercise3 {

    public static void main(String[] args) {
        int counter = 0;

        for (int num = 100; num < 1000; num++) {
            if ((num % 5 == 0) && (num % 6 == 0)) {
                System.out.print(num + " ");
                counter++;

                if (counter == 10) {
                    System.out.println();
                    counter = 0;
                }
            }
        }

        //start pattern
        //relation bw line number and count of stars
        //and repeating this behavior for n line of numbers


        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

        for (int n = 7; n >= 0; n--) {
            for (int m=n; m>0; m--) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }

}