import java.io.Console;
//Shows all the prime factors of n
public class PrimeFactorization{
	public static void main(String[] args){
		Console con = System.console();
        
        int n = Integer.parseInt(con.readLine("Enter a Number: "));
		
                System.out.println("---------------------");
                System.out.println("|   Prime Factors:  |");
                System.out.println("---------------------");

        // for loop, n must be divided by the smallest prime number to have the prime factor 
        // i represents the prime factor. 
		for(int i = 2; i < n; i++){
			
            // Condition is if the remainder of n / i(2) is equal to 0 then the loops continue
            // if its not equal, the loop stops.
			while(n % i == 0){
				n = n / i;
                System.out.print(i + " \u2715 "); // then it prints all the prime number repeatedly.
			}

		}

        // if n is not equal to 1, then there is still a prime number remaining
        // this will print the remainining number.
        if (n != 1){                      
            System.out.print(n);
        }

                System.out.println("");
                System.out.println("---------------------");

	} // END MAIN


} // END CLASS
