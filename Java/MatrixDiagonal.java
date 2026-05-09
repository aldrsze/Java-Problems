import java.io.*;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Console con = System.console();
        int[][] array = new int[3][3];
        int primarySum = 0;
        int secondarySum = 0;
        
        System.out.print("\033[H\033[2J");
        System.out.println("----------------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Integer.parseInt(con.readLine("Enter Value to Matrix[%d][%d]: ", i, j));
            }
        }
        System.out.println("----------------------------------\n");


        for (int i = 0; i < array.length; i++) {

            primarySum += array[i][i];
            
            secondarySum += array[i][array.length - 1 - i];
        }


        System.out.println("---------- MATRIX VALUES ---------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                con.printf("[%d][%d] = %d\n", i, j, array[i][j]);
            }
        }
        System.out.println("----------------------------------\n");

        System.out.printf("The primary sum of matrix is: [%d]\n", primarySum);
        System.out.printf("The secondary sum of matrix is: [%d]\n", secondarySum);
        System.out.println("----------------------------------\n");

    }

} // CLASS
