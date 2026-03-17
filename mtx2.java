import java.io.*;

public class mtx2 {
    public static void main(String[] args) {
        Console con = System.console();

        int array[][] = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    System.out.print("[7] ");
                } else {
                    System.out.print(" .  ");
                }                   
            }
            System.out.println();
            
        }
    }
}
