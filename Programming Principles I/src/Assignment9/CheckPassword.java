/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 9
 */
import java.util.Scanner;
public class CheckPassword //Purpose: Check if user entered password is valid based on certain req.
{
	public static void main(String[] args)
	{
		//Grab an input from the user
		Scanner in = new Scanner(System.in);
		//variables that store each req. and say whether the input meets them
		String valid = "Valid password!";
		String invalid = "INVALID PASSWORD!";
		boolean check1, check2, check3;
		//Loop for re-run feature
		for (int l = 0; l < 1; l++)
		{
			System.out.print("Enter your password!: ");
			String userPhrase = in.nextLine();
			//Invokes all three req. checks
			check1 = phraseLength(userPhrase);
			check2 = phraseNoSym(userPhrase);
			check3 = phraseTwoDigs(userPhrase);
			//If statement to see results of check
			if (check1 && check2 && check3)
			{
				System.out.println(valid);
			}
			else
			{
				System.out.println(invalid);
			}
			//Activates the re-run feature through a method
			if (reRun())//if true was returned from re-run method
			{
				l--;
				continue;//Skip exit method
			}
			
			System.exit(0);//Exits program
		}
		
	}
	//Method checks length of 8 or more chars for user password
	public static boolean phraseLength(String password)
	{
		if (password.length() < 8)
		{
			return false;
		}
		
		return true;
	}
	//Method checks that NO char in the input has a symbol
	public static boolean phraseNoSym(String password)
	{
		String check = password.toLowerCase();
		char ch;
		for (int i = 0; i < password.length(); i++)
		{
			ch = check.charAt(i);
			if (!(Character.isLetterOrDigit(ch)))//If it is not a letter or digit, must be a symbol
			{
				return false;
			}
		}
		return true;
	}
	//Method checks that the input has at least TWO digits
	public static boolean phraseTwoDigs(String password)
	{
		//uses counter to count number of digits
		//if two or more then return true, else return false
		int counter = 0;
		String check = password.toLowerCase();
		for(int i = 0; i < password.length(); i++)
		{
			char ch = check.charAt(i);
			if (Character.isDigit(ch))
			{
				counter++;
			}
			
		}
		if (counter < 2)
		{
			return false;
		}
		
		return true;
	}
	//Method creates the re-run feature
	public static boolean reRun()
	{
		Scanner ans = new Scanner(System.in);
		for (int z = 0; z < 1; z++)//Loop to get a yes or no answer
		{
			//Returns true or false(y = true n = false) to determine whether to re-run
			System.out.print("Would you like to re-run?(y or n): ");
			String maybe = ans.next();
			String test = maybe.toLowerCase();
			if (test.equals("n"))
			{
				return false;
			}
			else if (!(test.equals("y")))
			{
				System.out.println("Invalid answer! Enter y or n!");
				z--;
			}
		}
		return true;
	}

}
