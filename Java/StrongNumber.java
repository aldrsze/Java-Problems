import java.io.Console;


// CHECKS IF THE SUM OF THE FACTORIAL OF ITS DIGITS EQUALS THE GIVEN NUMBER
public class StrongNumber {
    public static void main(String[] args) {
        Console con = System.console();        

        int num = Integer.parseInt(con.readLine("Enter a Number: "));
        int sum = 0;
        int originalNum = num;
        int Digit = 0;        

        while(num > 0){
            
            int factorial = 1;

            Digit = num % 10; // num value % 10 gets the last number
 
            for(int i = 1;i <= Digit; i++ ){
                factorial *= i;
            } // END FOR LOOP
                sum = sum + factorial;

                num = num / 10; // num / 10 to remove the last number

        }// END WHILE LOOP        

        if (sum == originalNum){
            System.out.println("The number is a STRONG number!");
        }else{
            System.out.println("The number is NOT a Strong number!");
        } // END IF-ELSE

    } // END MAIN
} // END CLASS
