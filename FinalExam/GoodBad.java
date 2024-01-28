package FinalExam;

import java.util.Scanner;

public class GoodBad {
        public static boolean goodBad(String str)
        {
            int count1=0;
            int count2=0;
            int myBad = str.indexOf("good");
            while(myBad!=-1)
            {
                count1++;
                myBad = str.indexOf("good",myBad+1);
            }
            myBad = str.indexOf("bad");
            while(myBad!=-1)
            {
                count2++;
                myBad = str.indexOf("bad",myBad+1);
            }
            return (count1==count2);
        }
        public static void main(String args[])
        {
            System.out.println(goodBad("goodbad"));
            System.out.println(goodBad("goodgood"));
            System.out.println(goodBad("1good1goobad"));
            //not sure if only examples matter or users answer as well
            Scanner input=new Scanner(System.in);
            System.out.println("Please write goodbad");
            String myAnswer = input.nextLine();
            System.out.println(goodBad(myAnswer));
        }
    }

