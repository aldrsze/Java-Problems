import java.io.*;

public class MatrixAddition{
  public static void main(String[] args) {
    Console con = System.console();

    int[][] MatrixA = new int[2][3];
    int[][] MatrixB = new int[2][3];
    int[][] MatrixC = new int[2][3];

    System.out.println("\n--- ADD VALUE TO MATRIX A ---\n");
    for (int row = 0; row < MatrixA.length; row++) {
      for (int col = 0; col < MatrixA.length; col++) {
        MatrixA[row][col] = Integer.parseInt(con.readLine("[" + row + "][" + col + "]: "));
      } // END COL
    } // END ROW
 
    System.out.println("\n--- ADD VALUE TO MATRIX B ---\n");
    for (int row = 0; row < MatrixB.length; row++) {
      for (int col = 0; col < MatrixB.length; col++) {
        MatrixB[row][col] = Integer.parseInt(con.readLine("["+row+"]["+col+"]: "));
      } // END COL
    } // END ROW

    System.out.println("\n--- ADDING VALUES ---\n");
    for (int row = 0; row < MatrixA.length; row++) {
      for (int col = 0; col < MatrixA.length; col++) {
        MatrixC[row][col] = MatrixA[row][col] + MatrixB[row][col]; 
      } // END COL
    } // END ROW
    
    System.out.println("\n--- SHOW RESULTS OF MATRIX A ---\n");
    for (int row = 0; row < MatrixA.length; row++) {
      for (int col = 0; col < MatrixA.length; col++) {
        con.printf("[%d][%d] = %7d, ", row, col, MatrixA[row][col]);
      } // END COL
      System.out.println();
    } // END ROW
    
    System.out.println("\n--- SHOW RESULTS OF MATRIX b ---\n");
    for (int row = 0; row < MatrixB.length; row++) {
      for (int col = 0; col < MatrixB.length; col++) {
        con.printf("[%d][%d] = %7d, ", row, col, MatrixB[row][col]);
      } // END COL
      System.out.println();
    } // END ROW
    
    System.out.println("\n--- SHOW RESULTS OF MATRIX C ---\n");
    for (int row = 0; row < MatrixC.length; row++) {
      for (int col = 0; col < MatrixC.length; col++) {
        con.printf("[%d][%d] = %7d, ", row, col, MatrixC[row][col]);
      } // END COL
      System.out.println();
    } // END ROW




  } // END MAIN
} // END CLASS
