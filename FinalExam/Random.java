package FinalExam;

import java.lang.Math;

public class Random {

    public static void main(String[] args) {
        int num = 100;
        int[] i = new int[10];
        int j;
        for(j = 1; j <= 100; ++j) {
            ++i[(int)(Math.random() * 10.0)];
        }
        System.out.println("Here are the 10 random numbers and their counts");
        for(j = 0; j < i.length; ++j) {
            System.out.println(j + "-->" + i[j]);
        }
    }
}
