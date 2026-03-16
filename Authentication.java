import java.util.ArrayList;
import java.io.Console;


public class Authentication {
	
	private static ArrayList<User> userData= new ArrayList<>();
	public static Console con = System.console();
	public static void main(String[] args) {

		boolean c = true;

		do {
			System.out.println("\033[H\033[2J");
			System.out.println("|===============|");
			System.out.println("| 1. Login      |");
			System.out.println("| 2. SignUp     |");
			System.out.println("| 0. Exit       |");
			System.out.println("|===============|");

			int choice;
			try {
				choice = Integer.parseInt(con.readLine("Enter Choice: "));
			} catch (NumberFormatException e) {
				choice = -1;
			}

			switch (choice) {
				case 1:
					System.out.println();
					System.out.println("------------ Login ----------");
					System.out.println("==============================");
					String usernameInput = con.readLine("Enter Username: ");
					String passwordInput = con.readLine("Enter Password: ");
					System.out.println("==============================");
					
					if (auth(usernameInput, passwordInput)) {
						System.out.println("Login Successful!");
					}
					else {
						System.out.println("Incorrect Password or Username.");
					}

					break;
				
				case 2:
					System.out.println("----------- Signup ----------");
					System.out.println("==============================");
					String usernameSignup = con.readLine("Enter Username: ");
					String passwordSignup = con.readLine("Enter Password: ");
					System.out.println("==============================");
					userData.add(new User(usernameSignup, passwordSignup));
					System.out.println("Account Created Successfully!");
					break;
				case 0:
					c = false;
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid Choice Please Try Again.");
			}

			con.readLine("Press <ENTER> to continue...");


		}while(c);
		
		
	} // END MAIN

	public static boolean auth(String username, String password) {
		
		for(User u : userData) {

			if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	static class User {
		private String username;
		private String password;

		public User(String username, String password) {
		this.username = username;
		this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}
	}



} // END CLASS


