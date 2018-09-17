import java.util.Scanner;

public class passwordH1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String rightpassword ="55059file";  // The correct password		
		
		System.out.print("Please enter your password: " );
		String userpassword= in.next();  // Prompt user to enter his password
		
		//If user entries the wrong password, Prompt user to try again
		//until correct. 
		while (userpassword.compareTo(rightpassword) != 0) {
			System.out.print("Wrong password. Please enter your password: " );
			userpassword= in.next();  // Prompt user to enter his password
		}	
			System.out.println("Enter success! ");
		
	}

}
