import java.io.*;

public class ReverseString {
    public static void main(String[] args) {
        Console con = System.console();
        String reversed = "";

        String word = con.readLine("ENTER A STRING: ");

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Reversed Word: " + reversed);


    } // END MAIN
    
} // END CLASS
