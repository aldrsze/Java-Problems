import java.io.Console;
// FIND THE LEAST COMMON MULTIPLE (LCM) OF TWO VALUES
public class FindLCM{
	public static void main(String[] args){
		Console con = System.console();
			
		int a = Integer.parseInt(con.readLine("Enter First Number: "));
		int b = Integer.parseInt(con.readLine("Enter Second Number: "));
		int largestNum, smallestNum, remainder, LCM;
        // validation. sort the largest and smallest number
		if (a > b){
			largestNum = a;
			smallestNum = b;
		}else{			
			largestNum = b;
			smallestNum = a;
		}
		
		int GCD = 0;
			
			remainder = largestNum % smallestNum;

            if(remainder == 0){remainder = smallestNum; }; // Precaution if the there is no remainder
		while(remainder > 0){
			GCD = remainder;
			remainder = smallestNum % remainder; 
		}
		System.out.println("-------------------------------");
		System.out.println("The GCD/GCF is: \n" + GCD);
		System.out.println("-------------------------------");
		LCM = a * b / GCD; // Precedence application * first then /.
			
		System.out.printf("The LCM of %d and %d is : %d", a, b, LCM);
	} // END MAIN


} // END CLASS 
