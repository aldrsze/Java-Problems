import java.io.Console;
//FIND GCD (Greatest Common Divisor of 2 number)
public class findGCD{
	public static void main(String[] args){
		Console con = System.console();
			
			int a = Integer.parseInt(con.readLine("Enter First Number: "));
			int b = Integer.parseInt(con.readLine("Enter Second Number: "));			
			int largestNum, smallestNum, remainder;			
            int GCD = 0; // Initialize GCD
            
            // if-else to store a,b to largest and smallest number
			if (a > b){
					largestNum = a;
					smallestNum = b;
				}else{
					largestNum = b;
					smallestNum = a;
				}
			System.out.println("----------------------------------------------");
			System.out.println("Largest Number = " + largestNum + "\nSmallest Number = " + smallestNum);
			System.out.println("----------------------------------------------");
                remainder = largestNum % smallestNum; // Gets the remainder of largest and smallest number
            
            while(remainder > 0){
                GCD = remainder; // stores the last remainder to GCD
                remainder = smallestNum % remainder; // Gets the remainder of smallest and last remainder if remainder is greater than 0
            }
                System.out.printf("%nThe Greatest Common Divisor (DCD) of %d and %d is %d", largestNum, smallestNum, GCD);


	} // END MAIN


} // END CLASS
