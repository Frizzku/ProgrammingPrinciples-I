/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Lab: 		   10
 */
import java.util.Scanner;
public class AverageArray //Purpose: Take input from the user to find the average by using an array
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double[] numSet = new double[10];//Insert those values into an array
		for (int l = 0; l < 1; l++)//Re-run feature loop
		{
			//Gather input from the user(10 doubles)
			System.out.print("Enter ten double or int values: ");
			for (int i = 0; i < numSet.length; i++)
			{
				numSet[i] = in.nextDouble();//Set each element value equal to each corresponding input
			}
			System.out.println("The average of the ten values is: " + average(numSet));//Invoke average method
			
			if (reRun())//if true was returned from re-run method
			{
				l--;
				continue;//Skip exit method
			}
			
			System.exit(0);//Exits program
		}
	}
	//Method finds the average by adding all elements of the array
	//Then dividing by the length of the array
	public static int average(int[] array)
	{
		int sum = 0, average = 0;
		for (int i: array)
		{
			sum += i;
			
		}
		average = sum / array.length;
		return average;
	}
	//This is an identical method except it is done with doubles
	//This way the method is overloaded and maybe be used with ints and doubles
	public static double average(double[] array)
	{
		double sum = 0, average = 0;
		for (double i: array)
		{
			sum += i;
			
		}
		average = sum / array.length;
		return average;
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
