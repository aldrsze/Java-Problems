import java.io.*;

public class Array2D{
  public static void main(String[] args) {
    int[][] arr2D = new int[10][10]; // [row][col]
    arr2D[5][3] = 7;

    for (int row = 0; row < arr2D.length; row++) {
      for (int col = 0; col < arr2D.length; col++) {
        System.out.printf("[%d][%d]=%3d, ", row, col, arr2D[row][col]);
      } // END COL
        System.out.println();

    } // END ROW

  }// END MAIN
  
} // END CLASS
