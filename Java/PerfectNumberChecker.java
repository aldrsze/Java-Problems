import java.io.*;

public class PerfectNumberChecker{
	public static void main(String[] args){
	
	Console con = System.console();


	int number = Integer.parseInt(con.readLine("Enter a Number: "));
	int sum = 0;
	
	for(int i = 1; i < number; i++){
		if(number % i == 0){ sum = sum + i;}

	}
		if(sum == number){
			System.out.printf("Number: %d is a Perfect Number!%n" + 
		"Sum: %d is equal to Number: %d", number, sum, number);		
		}else{
			System.out.printf("Number: %d is not a Perfect Number!%n" +
			"Sum: %d is NOT equal to Number: %d", number, sum, number);		
		}


	}// END MAIN
}// END CLASS
