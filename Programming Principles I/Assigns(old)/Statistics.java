/* Class:	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 10 
 */
import java.util.*;
public class Statistics //Purpose: Take mean of 10 numbers and find the standard deviation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for (int z = 0; z < 1; z++)//Re-Run Loop
		{
			//Declares, creates, and initializes array of ten numbers
			double[] stats = new double[10];
			System.out.print("Enter ten numbers!: ");
			for (int i = 0; i < stats.length; i++)
			{
				stats[i] = in.nextDouble();
			}
			//Outputs result of each method
			double means = mean(stats);//Computes mean
			double devi = deviation(stats);//Computes standard deviation
			System.out.printf("The mean is: \t \t   " + "%3.2f\n", means);
			System.out.printf("The standard deviation is: " + "%3.5f\n", devi);
			
			if (!(reRun()))//checks to see if reRun method is false
			{
				System.exit(0);//If so, exits the program
			}
				z--;//Defaults to running again
				for (int i = 0; i < stats.length; i++)
				{
					stats[i] = 0;
				}
		}
	}
	//This method takes the formula in the book to return standard deviation
	public static double deviation(double[] x)
	{
		double dev1 = 0;
		double devFin = 0;
		//Loops through array and subtracts each from the mean, then squares them
		//Adds each result together at each interval
		for (double item: x)
		{
			dev1 += Math.pow((item - mean(x)), 2);
			
		}
		//Takes sum above and sqrts the sum divided by the amount of numbers minus 1
		devFin = Math.sqrt(dev1 / (x.length - 1));
		
		return devFin;
	}
	//This method calculates mean
	public static double mean(double[] x)
	{
		double add = 0;
		double sum = 0;
		for (double i: x)
		{
			add += i;//Adds all elements
		}
		sum = add / x.length;//Divides by the amount of elements
		return sum;
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
