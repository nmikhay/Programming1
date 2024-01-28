package FinalExam;

import java.lang.Math;

import java.util.Scanner;

public class Grades {

        public static void main(String[] args){

            int highest=0;
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter the amount of students");
            int i = input.nextInt();

            int[] scores = new int[i] ;
            String[] grade = new String[i];
            System.out.println("Please enter their scores separated by space");

            for(int j =0; j<i;j++){
                scores[j] = input.nextInt();
                highest = Math.max(highest,scores[j]);
            }
            for(int j =0; j<i;j++){
                if(scores[j]>=highest-10){
                    grade[j] = "A";
                }
                else if(scores[j]>=highest-20){
                    grade[j] = "B";
                }
                else if(scores[j]>=highest-30){

                    grade[j] = "C";
                }
                else if(scores[j]>=highest-40){
                    grade[j] = "D";
                }
                else{
                    grade[j] = "F";
                }
            }
            for(int j =0; j<i;j++){
                System.out.println("Student "+j+" Score is "+scores[j]+" and Grade is "+grade[j]);
            }
        }
    }

