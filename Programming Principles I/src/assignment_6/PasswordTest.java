/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 6
 */
package assignment_6;
import java.util.Scanner;
public class PasswordTest
{
	//Wow did this program take some time but it was fun!
	public static void main(String[] args)
	{
		//Scanner with the prompt to input a password along with what the password should have
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a password!(Should have upper and lowercase letters, number, and symbol): ");
		String password = in.nextLine();
		//These boolean vars are used to later to check each char of the entered password
		boolean upper = false, lower = false, digit = false, nonDig = false;
		//Creating a character for the checking of the password
		char ch = (char) password.length(); 
		//String z is used for depicting whether the password is 'good' or 'bad'
		String z = "";
		String good = "Valid password!";
		String bad = "Invalid password...";
		//The outer most for loop that keeps the program running unless exited or user promotes to stop
		for (int i = 0; i < 1; i++)
		{
			//Checks to see if password meets recommendation of at least 8 chars
			if (password.length() < 8)
			{
				//Loop that runs to continue the prompt of new inputs until one is greater than or equal to 8
				while (password.length() < 8)
				{
					System.out.println(bad);
					System.out.print("Enter a password!(Should have upper and lowercase letters, number, and symbol): ");
					password = in.next();
				}
			}
		//This moves on to checking each char for uppercase, lowercase, digit, and symbol
		if (password.length() >= 8)
	
		{
			//For loop that runs throughout the entire length of the password string
			for (int x = 0; x <= password.length() - 1; x++)
			{
				//each checks if one of the chars in the password string has upper or lowercase, digit, and symbol
				ch = password.charAt(x);
				if (Character.isUpperCase(ch))
				{
					upper = true;
				}
				else if(Character.isLowerCase(ch))
				{
					lower = true;
				}
				else if(Character.isDigit(ch))
				{
					digit = true;
				}
				else if ((!Character.isLowerCase(ch)) && (!Character.isUpperCase(ch)) && (!Character.isDigit(ch)))
				{
					nonDig = true;
				}
			}
			
			//If statement that is determined by if all recommended elements of the password are present
			if (upper && lower && digit && nonDig)
			{
				z = good;
			}
			else
			{
				z = bad;
			}
	}		//Outputs the results and resets the outermost loop's counter to continue program
			System.out.println("Entered Password: " + password);
			System.out.println("Judgment:\t  " + z);
			i--;
			//Resets the values above to start anew and prompts if user would like to continue!
			upper = false; lower = false; digit = false; nonDig = false;
			//Loop and If statement to determine if the program re-runs
			for (int l = 0; l < 1; l++)
			{
				System.out.print("Would you like to try again? (y for yes/ n for no): ");
				String maybe = in.next();
				maybe.toLowerCase();
				if (maybe.equals("y"))
				{
					System.out.println("Enter a password!: ");
					password = in.next();
					i--;
				}
				else if (maybe.equals("n"))
				{
				System.exit(i);
				}
				else
				{
					System.out.println("Invalid answer! Try again!");
					l--;
				}
			}
			
			
	}
		
		
		
		
	}
}
