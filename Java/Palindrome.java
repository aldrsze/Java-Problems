import java.io.Console;
//PALINDROME NUMBER. reverse of its number must be the same with the original.
public class Palindrome{
    public static void main(String[] args){
        Console con = System.console();
        
        int n = Integer.parseInt(con.readLine("Enter a number: "));
        int reverse = 0;
        int lastDigit;
        int originalNum = n;

        while(n > 0){
            lastDigit = n % 10;

            reverse = reverse * 10 + lastDigit; // rev * 10 first, then, + lastDigit

            n /= 10;

        } // END WHILE LOOP
            
            if (originalNum == n){
                 System.out.println("The number is Palindrome!");

            }else {
                 System.out.println("The number is Palindrome!");
            } // END IF-ELSE
    }// END MAIN


} // END CLASS
