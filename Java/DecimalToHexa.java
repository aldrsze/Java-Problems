import java.io.Console;

public class DecimalToHexa{
    public static void main(String[] args){
        Console con = System.console();

        double decimal = Double.parseDouble(con.readLine("Enter a Decimal: "));
        String hex = "0123456789ABCDEF";
        String FinalHexa = "";

        while (decimal > 0){
            int remainder = (int) decimal % 16; // the remainder of decimal divided by 16 is the first Hexadecimal.
            FinalHexa = hex.charAt(remainder) + FinalHexa;     // Put the remainder in the first 
            decimal = (int) decimal / 16; // resets the decimal. technically makes the decimal quotient of the remainder.
        }
            System.out.println(FinalHexa); 
    } // END MAIN

} // END CLASS
