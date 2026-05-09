import java.io.*;

public class InPlaceReversal {
    public static void main(String[] args) {
        Console con = System.console();

        int[] array = new int[5];
        int[] tempArray = new int[5];
        int start = 0;
        int end = array.length - 1; 
        
        System.out.print("\033[H\033[2J");
        System.out.println("---- ENTER VALUES ----");
        for (int i = 0; i < array.length; i++) {
            int values = Integer.parseInt(con.readLine("Enter Values: ")); 
            array[i] = values;
            tempArray[i] = values;
        }
        System.out.println("----------------------");

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        
        System.out.println("\n--- ORIGINAL ARRAY ---");
        for (int i = 0; i < tempArray.length; i++) {
            System.out.printf("Index[%d]: %3d\n", i, tempArray[i]);
        }
        System.out.println("----------------------\n");
        
        System.out.println("---- REVERSE ARRAY ---");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Index[%d]: %3d\n", i, array[i]);
        }
        System.out.println("----------------------");




    } // MAIN
} // CLASS
