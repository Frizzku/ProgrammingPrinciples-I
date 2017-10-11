/* Class: 	   CS 1301/17
 * Term:  	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Lab:        9
 */
import java.util.Scanner;
public class SumDigits 
{
	public static void main(String[] args)
	{
		//Must add the sum of all digits in an integer entered by a user
		Scanner in = new Scanner(System.in); //Requires Scanner
		//Outer loop for re-run functionality
		for (int z = 0; z < 1; z++)
		{
			//Acquires input from the user 
			System.out.print("Enter an integer!: ");
			int userNum = in.nextInt();
			//Displays output and invokes the sumofDigits method
			System.out.println("The sum of " + userNum + " is " + sumofDigits(userNum));
		
		for (int l = 0; l < 1; l++)
		{
			//Re-run function
			System.out.print("Would you like to re-run?(y for yes n for no): ");
			String maybe = in.next();
			String test = maybe.toLowerCase();
			if (test.equals("y"))
			{
				z--;
			}
			else if (test.equals("n"))
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
	//Method that takes the integer entered and adds its digits together
	//Converts the integer to a string and then loops through each char in the integer
	//Grabs each digit and then places each individual digit to another string
	//Convert each digit back to an integer
	//Finally keep a counting variable to add each integer as its extracted and converted
	public static int sumofDigits(int num)
	{
		String input = "" + num;
		String sum = "";
		int out = 0;
		int total = 0;
		char hold = ' ';		
		for (int i = 0; i < input.length(); i++)
		{
			hold = input.charAt(i);
			sum = "" + hold;
			out = Integer.parseInt(sum);
			total += out;
		}
		
		
		return total;
	}
}
