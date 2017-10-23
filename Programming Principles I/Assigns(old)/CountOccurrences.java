/* Class:	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 10 
 */
import java.util.*;
public class CountOccurrences //Purpose: To count the occurrence of digits entered in by the user(1 to 100)
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);//Grabs input from user
		for (int z = 0; z < 1; z++)//Re-run loop
		{
			//Declares, creates, and initializes the array with the inputs
			int[] numbers = new int[10]; 
			System.out.print("Enter " + numbers.length + " integers between 1 and 100!: ");
			for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = in.nextInt();
			}
			int[] done = search(numbers);//Calls search method to check occurrence and puts it into an array
			results(done);//Calls results method to output 
			if (!(reRun()))//checks to see if reRun method is false
			{
				System.exit(0);//If so, exits the program
			}
			z--;//Defaults to running again
		}
		
	}
	//Method creates a new array with 100 indices
	//Then loops through the passed array and counts each character
	public static int[] search(int[] inNums)
	{
		int[] occurrence = new int[100];
		for(int i = 0; i < inNums.length; i++)
		{
			occurrence[inNums[i] - 1]++;//Adds one to index of corresponding value
		}
		
		return occurrence;
	}
	//Method displays the array from the search and only the numbers that occurred
	public static void results(int[] occurrence)
	{
		for (int i = 0; i < occurrence.length; i++)
		{
			if (occurrence[i] == 0)
			{
				continue;
			}
			if (occurrence[i] > 1)
				System.out.println((i + 1) + " occurs " + occurrence[i] + " times");
			else
				System.out.println((i + 1) + " occurs " + occurrence[i] + " time");

		}
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
