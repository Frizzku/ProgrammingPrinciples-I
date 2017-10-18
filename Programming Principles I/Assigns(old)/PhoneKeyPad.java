/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 9
 */
import java.util.Scanner;
public class PhoneKeyPad //Purpose: To convert letters of a phone number to digits
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		char checkCh;
		int converted = 0;
		//Loop for re-run
		for (int z = 0; z < 1; z++)
		{
			//Obtain input from user
			System.out.print("Enter a phone number(may contain letters): ");
			//Convert all letters to upper case and add a var. to store result of translation
			String phoneS = in.nextLine();
			String editNum = phoneS.toUpperCase();
			String finNum = "";
			//Loops through string to search for letters
			//If it is a letter, call method to translate then add the converted number
			//else just keep adding the characters to the final string
			for (int i = 0; i < editNum.length(); i++)
			{
				checkCh = editNum.charAt(i);
				if (Character.isLetter(checkCh))
				{
					converted = getNumbers(checkCh);
					finNum += "" + converted;
				}
				else
					finNum += "" + checkCh;
			}
			//Print final string with translated letters to numbers
			System.out.println(finNum);
			//Invoke re-run method
			if (!(reRun()))
			{
				System.exit(0);
			}
			z--;
		}
	}
	//Method that translates decimal value of each specific char to its designated number
	public static int getNumbers(char uppercaseLetter)
	{
		int num = 0;
		if (uppercaseLetter >= 65 && uppercaseLetter <= 67)
		{
			num = 2;
		}
		else if (uppercaseLetter >= 68 && uppercaseLetter <= 70)
		{
			num = 3;
		}
		else if (uppercaseLetter >= 71 && uppercaseLetter <= 73)
		{
			num = 4;
		}
		else if (uppercaseLetter >= 74 && uppercaseLetter <= 76)
		{
			num = 5;
		}
		else if (uppercaseLetter >= 77 && uppercaseLetter <= 79)
		{
			num = 6;
		}
		else if (uppercaseLetter >= 80 && uppercaseLetter <= 83)
		{
			num = 7;
		}
		else if (uppercaseLetter >= 84 && uppercaseLetter <= 86)
		{
			num = 8;
		}
		else 
		{
			num = 9;
		}
		return num;
	}
	//Method to re-run program
	public static boolean reRun()
	{
		Scanner ans = new Scanner(System.in);
		for (int z = 0; z < 1; z++)
		{
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
