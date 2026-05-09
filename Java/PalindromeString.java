import java.io.*;

public class PalindromeString {
    public static void main(String[] args) {
        Console con = System.console();
        
        String word = con.readLine("Enter a String: ");

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char cLeft = word.charAt(left);
            char cRight = word.charAt(right);

            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                System.out.println("THE STRING IS NOT A PALINDROME! ");
            }else {
                System.out.println("THE STRING IS A PALINDROME");
            }
            left++;
            right--;
        }
        

    } // END MAIN
     
} // END CLASS
