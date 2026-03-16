
import java.io.*;

public class SecondLargest{
    public static void main(String[] args) {
        Console con = System.console();

        int LargestNum = Integer.MIN_VALUE;
        int SecondNum = Integer.MIN_VALUE;

        int[] values = new int[5];
        
        for (int i = 0; i < values.length; i++){
            int val = Integer.parseInt(con.readLine("Enter Values: "));
            values[i] = val;
        }

        for (int num : values) {
            if (num > LargestNum) {
                LargestNum = num;
            }
        }

        for (int num : values) {
            if (num < LargestNum && num > SecondNum) {
                SecondNum = num;
            }
        }

        System.out.printf("\nThe Largest Number of the Array is: [%d]", LargestNum);
        System.out.printf("\nThe Second Largest Number of the Array is: [%d]\n", SecondNum);



    } // END MAIN

} // END CLASS
