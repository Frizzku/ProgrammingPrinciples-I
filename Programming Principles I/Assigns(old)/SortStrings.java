/* Class:	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 10 
 */
import java.util.*;
public class SortStrings //Purpose: Acquire a string from user to sort and output result
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for (int z = 0; z < 1; z++)//Re-run loop
		{
			System.out.print("Enter number of names in the list: ");
			//Declares, creates, and initializes the array with input from user
			int numOfNames = in.nextInt();
			String[] names = new String[numOfNames];
			System.out.print("Enter " + names.length + " names: ");
			for (int i = 0; i < names.length; i++)
			{
				names[i] = in.next();
			}
			//Displays loop without sorting
			System.out.print("List Before Sorting: ");
			for (String name: names)
			{
				System.out.print(name + " ");
			}
			System.out.println();
			sort(names);//Sorts array
			//Displays array once sorted
			System.out.print("List After Sorting:  ");
			for (String name: names)
			{
				System.out.print(name + " ");
			}
			System.out.println();
			if (!(reRun()))//checks to see if reRun method is false
			{
				System.exit(0);//If so, exits the program
			}
				
				z--;//Defaults to running again
		}
	}
	//Method uses Arrays class to sort string in alphabetical order
	public static void sort(String[] edit)
	{
		Arrays.sort(edit);
	}
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
