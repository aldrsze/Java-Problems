import java.io.Console;

public class OhmsLaw {
    public static void main(String[] args) {
        Console con = System.console();

        int choice = 0;
        double v, i, r;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("+---------------------------------------+");
            System.out.println("|           OHM'S (\u2126) LAW	        |");
            System.out.println("+---------------------------------------+");
            System.out.println("| 1. Find Voltage (V)                   |");
            System.out.println("| 2. Find Current (I)                   |");
            System.out.println("| 3. Find Resistance (R)                |");
            System.out.println("| 0. EXIT                               |");
            System.out.println("+---------------------------------------+");

            try {
                // Get menu choice
                String input = con.readLine("Enter Choice: ");
                choice = Integer.parseInt(input);

                System.out.println("+---------------------------------------+");

                try {
                    switch (choice) {
                        case 1:
                            System.out.println("Compute for Voltage (V = I * R)");
                            i = Double.parseDouble(con.readLine("Enter Current (I): "));
                            r = Double.parseDouble(con.readLine("Enter Resistance (R): "));
                            v = i * r;
                            con.printf("Result -> Voltage: %7.2f Volts%n", v);
                            break;

                        case 2:
                            System.out.println("Compute for Current (I = V / R)");
                            v = Double.parseDouble(con.readLine("Enter Voltage (V): "));
                            r = Double.parseDouble(con.readLine("Enter Resistance (R): "));
                            if (r == 0) throw new ArithmeticException();
                            i = v / r;
                            con.printf("Result -> Current: %7.2f Amps%n", i);
                            break;

                        case 3:
                            System.out.println("Compute for Resistance (R = V / I)");
                            v = Double.parseDouble(con.readLine("Enter Voltage (V): "));
                            i = Double.parseDouble(con.readLine("Enter Current (I): "));
                            if (i == 0) throw new ArithmeticException();
                            r = v / i;
                            con.printf("Result -> Resistance: %7.2f \u2126%n", r);
                            break;

                        case 0:
                            System.out.println("Exiting Program...");
                            break;

                        default:
                            System.out.println("INVALID OPTION! Please select 0, 1, 2, or 3.");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid input. Please use numbers only (e.g., 12.5).");
                } catch (ArithmeticException e) {
                    System.out.println("Error: Cannot divide by zero.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Choice must be a number.");
                choice = -1; // Keep loop going
            }

            // Pause before clearing screen again
            if (choice != 0) {
                con.readLine("\nPress <ENTER> to return to menu...");
            }

        } while (choice != 0);
    }
}
