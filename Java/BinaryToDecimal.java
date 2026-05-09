import java.io.Console;
//
public class BinaryToDecimal{
    public static void main(String[] args){
        Console con = System.console();
                
        int binary = Integer.parseInt(con.readLine("Enter a Binary: "));
        int digit, position;
        double power = 0, decimal = 0;
        int binaryOriginal = binary;
        position = 0;

        while(binary > 0){
            digit = binary % 10; // GET LAST DIGIT

            power = digit * (int) Math.pow(2, position); // Power of 2 method, power is the position. digit * 2^position.
            binary /= 10; // REMOVE LAST DIGIT
            
            decimal += power;
                
            position++;

        }        

            System.out.printf("The Decimal of Binary : %d is : %7.2f", binaryOriginal, decimal);

    } // END MAIN


} // END CLASS
