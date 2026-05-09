import java.io.Console;

public class Harshad {
    public static void main(String[] args){
        Console con = System.console();
        
        int sum = 0;
        int num = Integer.parseInt(con.readLine("Enter A Number: "));
        int originalNum = num;

        while(num > 0){

            double digit = num % 10; // Gets the last digit of number 
            
            sum += digit;
            
            num = num / 10; // removes the last digit of number
            
        }// END WHILE

       
        // Checks if the division of num and sum does have a decimal or not. if it does
        // have a decimal then its not a Harshad Number!.
         if (originalNum % sum == 0){
            System.out.println("The number is a Harshad Number!");
        }else {
            System.out.println("The number is a NOT Harshad Number!");
        }
    }// END MAIN   


}// END CLASS
