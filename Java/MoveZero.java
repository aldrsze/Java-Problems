import java.io.*;

public class MoveZero {
    public static void main(String[] args) {
        Console con = System.console();

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++){
            int values = Integer.parseInt(con.readLine("Enter Values: "));
            array[i] = values;
        }

        int zero = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0) {

                int temp = array[i];
                array[i] = array[zero];
                array[zero]  = temp;

                zero++;
            }
        }

        for (int i : array){
            System.out.println(i);
        }


    } // MAIN 
    
} // CLASS
