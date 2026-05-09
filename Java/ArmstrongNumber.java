import java.io.Console;

// Checks if the sum of each digits with an exponent of how many number is each. ex. 123 = 1^3 + 2^3 + 3^3 = n.
public class ArmstrongNumber{
    public static void main(String[] args){
        Console con = System.console();

        int num = Integer.parseInt(con.readLine("Enter a Number: "));
        int sum = 0;
        int digit = 0;
        int originalNum = num;

        int numLength = String.valueOf(num).length();

        while (num > 0){
            int power = 1; // must be 1 always so it resets

            digit = num % 10; // gets the last digit
            
            for(int i = 0; i < digit; i++){
                power = (int) Math.pow(digit, numLength); // Math.pow is a double so it need to be converted into int (int).


            }// FOR LOOP   
         
            num = num / 10; // removes the last digit
            sum = sum + power;

        } // END WHILE LOOP
            if(sum == originalNum){
                System.out.println("The number is an Armstrong Number!");
            }else{
                System.out.println("The number is NOT an Armstrong Number!");
            }
            

    }// END MAIN

}// END CLASS
