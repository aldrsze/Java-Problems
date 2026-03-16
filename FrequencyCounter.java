import java.io.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Console con = System.console();

        int count = 0;
        int largest = 0;
        
        int[] array = new int[5];
        int[] tempArray = new int[5];
        
        System.out.print("\033[H\033[2J");
        System.out.println("---- ENTER VALUES ----");
        for (int i = 0; i < array.length; i++) {
            int values = Integer.parseInt(con.readLine("Enter Values: ")); 
            array[i] = values;
            tempArray[i] = values;
        }
        System.out.println("----------------------");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                }
            }   
        }

        System.out.println("\n--- ORIGINAL ARRAY ---");
        for (int i = 0; i < tempArray.length; i++) {

            System.out.printf("Index[%d]: %3d\n", i, tempArray[i]);
        }
        System.out.println("----------------------\n");
        
        System.out.println("---- SORTED ARRAY ----");
        for (int i = 0; i < array.length; i++) {

            System.out.printf("Index[%d]: %3d\n", i, array[i]);
        }
        System.out.println("----------------------");

    } // MAIN


} // CLASS
