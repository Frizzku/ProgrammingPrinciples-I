/* Class:	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 10 
 */
import java.util.*;
public class StrictlyIdenticalArrays //Purpose: Test if two entered strings are identical at every element index
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for (int z = 0; z < 1; z++)//re-run loop
		{
			//Receives list 1 from user and sets them in an array
			System.out.print("Enter list one(first number reps how many elements in list): ");
			int n = in.nextInt();
			int[] list1 = new int[n];
			for (int i = 0; i < list1.length; i++)
			{
				list1[i] = in.nextInt();
			}
			//Receives list 2 from user and sets them in an array
			System.out.print("Enter list two(first number reps how many elements in list): ");
			int m = in.nextInt();
			int[] list2 = new int[m];
			for (int i = 0; i < list2.length; i++)
			{
				list2[i] = in.nextInt();
			}
			//Test to see if they are strictly equal then output result of the if statement
			if (equals(list1, list2))
			{
				System.out.println("The two list are strictly identical!");
			}
			else
				System.out.println("The two list are not strictly identical...");
			if (!(reRun()))//checks to see if reRun method is false
			{
				System.exit(0);//If so, exits the program
			}
				
				z--;//Defaults to running again
		}
	}
	//This method returns true if at every index the two lists are equal
	//Otherwise, returns false
	public static boolean equals(int[] l1, int[] l2)
	{
		int counter = 0;
		if (l1.length == l2.length)
		{
			for (int i = 0; i < l1.length; i++)
			{
				//check = (l1[i] + l2[i]) / 2;
				if (l1[i] == l2[i])
				{
					counter++;
				}
			}
		}
		if (counter == l1.length)
		{
			return true;
		}
		else
			return false;
	}
	//This method allows the program to be run multiple times
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
