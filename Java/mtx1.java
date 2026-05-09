import java.io.*;

public class mtx1 {
    public static void main(String[] args) {
        Console con = System.console();

        int[] array = new int[5];
        int[] temp = new int[5];           
        
        System.out.print("\033[H\033[2J");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(con.readLine("[%d]: ", i));
        }

        for (int i = 0; i < array.length; i++){
            temp[i] = array[array.length -1 -i];
        }

        System.out.println();
        for (int i = 0; i < array.length; i++){
            con.printf("%d", temp[i]);
        }
        System.out.println();
    }
}
