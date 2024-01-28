package Session7;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        int[] arr = createArray();
        displayReverse(arr);
    }
    static void displayReverse(int[] arr){
        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] createArray(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i=0;i< numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}