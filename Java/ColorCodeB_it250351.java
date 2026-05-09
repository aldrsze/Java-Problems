import java.io.*;
import java.util.Arrays;
public class ColorCodeB_it250351{
	public static void main(String[] args){
		Console con = System.console();

		int c1, c2, c3, c4, base;
		double resistance, plus, minus;
		double tolerance = 0;
		
		char Ohms = '\u2126';
		
		String[] colors = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Gray", "White", "Gold", "Silver", "No Color"};

		System.out.println("--------------------------");
		c1 = Integer.parseInt(con.readLine("Enter 1st Number: "));
		c2 = Integer.parseInt(con.readLine("Enter 2nd Number: "));
		c3 = Integer.parseInt(con.readLine("Enter 3rd Number: "));
		c4 = Integer.parseInt(con.readLine("Enter 4th Number: "));
		System.out.println("--------------------------");

		base = (c1 * 10) + c2;
		resistance = base * Math.pow(10, c3);

		System.out.println("--------------------------");
		System.out.println("COLORS: " + colors[c1] + ", " + colors[c2] + ", " + colors[c3] + ", " + colors[c4]);
		System.out.printf("Resistance: %,.2f %c%n", resistance, Ohms);

		if (c4 == 10){tolerance = 0.05;}
		if (c4 == 11){tolerance = 0.10;}
		if (c4 == 12){tolerance = 0.20;}

		plus = resistance + (resistance * tolerance);
		minus = resistance - (resistance * tolerance);

		System.out.printf("+%.0f%% : %.2f %c%n", tolerance * 100, plus, Ohms);
		System.out.printf("-%.0f%% : %.2f %c%n", tolerance * 100, minus, Ohms);	
		
		System.out.println("--------------------------");
	
	
	} // END MAIN METHOD
 } // END CLASS
