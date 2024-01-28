package Session7;

public class ArraysExample {

    public static void main(String[] args) {
        //elementType[] nameOftheArray
        double[] numbers = new double[10]; // the default value of array =0, double array = 0.0;
        numbers[0]=1;
        numbers[1]=11.8;
        numbers[2]=7.7;
        numbers[3]=4.10;
        numbers[4]=20.9;
        numbers[5]=17.3;
        numbers[6]=29.6;
        numbers[7]=1;
        numbers[8]=1;
        numbers[9]=1;
        // numbers[10]=1; don't forget!!! -> array starts form 0 index and ends finish length -1

        for(int i=0 ; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        int[] intArray = new int[2];
        boolean[]booleanArray = new boolean[4]; // default value for boolean = false, must be assigned;


        //INITIALIZING ARRAY ---> elementType[] arrRefVar = {Value0, Value1, Value 2...}

        double[]myList = {11.8,7.7,17.3,29.6};



    }
}
