/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        8
 */
import java.util.Scanner;
public class PalindromeInteger 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input = 0;
		//Outer for loop for re-run feature
		for (int i = 0; i < 1; i++)
		{
			//Acquires input of a 3 digit integer from the user
			System.out.print("Enter a three digit number: ");
			input = in.nextInt();
			//Displays their number, the reverse, and if it is palindrome
			System.out.println("You entered: " + input);
			System.out.println("The reverse of your number is: " + reverse(input));
			System.out.println("True of False: Is your number palindrome? " + check(input));
			
			//For loop to initiate the re-run feature
			for (int l = 0; l < 1; l++)
			{
				//Prompts user to re-run
				System.out.print("Would you like to run again?(y for yes/ n for no): ");
				//Store it in a string 
				String maybe = in.next();
				maybe.toLowerCase();
				//Uses if statements to verify the inputs and then act according to the user input
				//If y then re-run and grab 3 new integers while resetting the outer loop
				//If n then terminate program
				//If any other char then ask again for either y or n
				if (maybe.equals("y"))
				{
					i--;
				}
				else if (maybe.equals("n"))
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid answer! Enter y or n!");
					l--;
				}

		}
			
		}
		
	}
	//Method reverses the input to check if it is palindrome
	public static int reverse(int num)
	{
		//Takes the input and transfers it to a string
		String digit = num + "";
		String mod = "";
		//Creates an integer for the loop condition
		int z = digit.length();
		while (z >= 1)
		{
			//Creates the string backwards
			z--;
			mod += (digit.charAt(z));
		}
		
		return Integer.parseInt(mod);
	}
	//Checks if the reverse is palindrome
	public static boolean check(int num)
	{
		
		boolean palindrome = false;
		//Checks if the method returns a number equal to the input after reversing
		if (reverse(num) == num)
		{
			palindrome = true;
		}
		//returns true or false depending on outcome of if statement
		return palindrome;
	}
}
