/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        9
 */
import java.util.Scanner;
public class Occurances 
{
	//Purpose: Must gather a string from the user and a character
	//Output the string and number of times the char is inside the string
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);//Requires scanner
		for (int z = 0; z < 1; z++)//Re-run enabling loop
		{
			//Input from user
			System.out.print("Enter a string!: ");
			String input = in.nextLine();
			String pass = input.toLowerCase();//To make checks work
			System.out.print("Enter a character to look for: ");
			String character = in.nextLine();
			String chLower = character.toLowerCase();//To make checks work
			char userChar = chLower.charAt(0);//Converts the string of the char to a char
			//Outputs string and occurrence of specified character
			System.out.println("The String you entered was: \t    " + input);
			System.out.println("The amount of times " + userChar + " was seen was: " + count(pass, userChar));
			if (!(reRun()))//checks to see if reRun method is false
			{
				System.exit(0);//If so, exits the program
			}
			z--;//Defaults to running again
		}
	}
	//This method counts the occurrence of a specific char in a string
	public static int count(String user, char specific)
	{
		int seen = 0;
		for (int i = 0; i < user.length(); i++)//Loops through string
		{
			//Any time the char at an index is the same as the specified char, add 1 to the seen counter
			if (user.charAt(i) == specific)
			{
				seen++;
			}
		}
		return seen;//Return the counter
	}
	//This method activates the re-run function by returning whether the user wants to re-run
	public static boolean reRun()
	{
		Scanner ans = new Scanner(System.in);//Need a new scanner
		for (int z = 0; z < 1; z++)//Loop until a proper answer is given
		{
			System.out.print("Would you like to re-run?(y or n): ");
			String maybe = ans.next();
			String test = maybe.toLowerCase();
			if (test.equals("n"))//if no
			{
				return false;
			}
			else if (!(test.equals("y")))//if not no or yes
			{
				System.out.println("Invalid answer! Enter y or n!");
				z--;
			}
		}
		return true;//Defaults to true if n or some improper char is entered
	}
}
