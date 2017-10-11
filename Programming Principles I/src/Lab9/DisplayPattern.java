/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        9
 */
import java.util.Scanner;
public class DisplayPattern
{
	//Purpose: Display a pattern depending on the rows the user enters
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);//Requires scanner
		for (int i = 0; i < 1; i++)//Loop for re-run feature
		{
			System.out.print("Enter the amount of rows for your pattern: ");//User input
			int numRows = in.nextInt();
			assert (numRows > 0) : "Invalid integer";
			displayPattern(numRows);//Invokes the pattern to display 
			if (!(reRun()))//if statement that directs to re-run or not
			{
				System.exit(0);
			}
			i--;
		}
	}
	//This method displays the pattern based on numofRows
	public static void displayPattern(int n)
	{
		int whiteSpace = n + 1 ;//Tracks max number of white space
		
		for (int rows = 1; rows <= n; rows++)//Loop that goes through each row
		{
			if (n >= 10)
			{
				whiteSpace += 1;
				for (int s = rows - 1; s < whiteSpace - 2; s++)
				{
					System.out.print("   ");
				}
				/*for (int i = 0; i < 3; i++)
				{
					System.out.print(" ");
				}*/
				for (int i = rows; i > 0 ; i--)//Prints highest number based on row and decrements
				{
					System.out.print(i + " ");
				}
			}
			else
			{
				//Prints correct number of whitespace depending on row
				for (int s = rows - 1; s < whiteSpace; s++)
				{
					System.out.print("  ");
					
				}
				for (int i = rows; i > 0 ; i--)//Prints highest number based on row and decrements
				{
					System.out.print(i + " ");
				}
			}
			
			System.out.println();//Moves the program to the next line to continue pattern
		}
	}
	//This method enables the re-run function to work
	//Returns true if user wants to re-run or false if they do not
	//Runs until yes or no is given
	public static boolean reRun()
	{
		Scanner ans = new Scanner(System.in);
		for (int z = 0; z < 1; z++)
		{
			System.out.print("Would you like to create a new pattern?(y or n): ");
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
