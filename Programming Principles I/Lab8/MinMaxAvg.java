/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        8
 */
import java.util.Scanner;
public class MinMaxAvg 
{
	public static void main(String[] args)
	{
		//Request 3 integers from the user
		//Requires Scanner object and variables to hold the values of the inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three integers!: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		//Outer for loop that allows for re-run feature
		for (int i = 0; i < 1; i++)
		{
			//Outputs by invoking or calling the methods
			//Includes formatting
			System.out.println("You entered: \t  " + num1 + ' ' + num2 + ' ' + num3);
			System.out.println("The Max value is: " + max(num1, num2, num3));
			System.out.println("The Min value is: " + min(num1, num2, num3));
			System.out.println("Average value is: " + ave(num1, num2, num3));
			//For loop to initiate the re-run feature
			for (int l = 0; l < 1; l++)
			{
				//Prompts user to re-run
				System.out.print("Would you like to run again?(y for yes/ n for no): ");
				//Store it in a string 
				String maybe = in.next();
				maybe.toLowerCase();
				//Uses if statements to verify the inputs and then act according to the user input
				//If y then re-run and grab 3 new integers while resetting the outer loop
				//If n then terminate program
				//If any other char then ask again for either y or n
				if (maybe.equals("y"))
				{
					System.out.print("Enter three integers!: ");
					num1 = in.nextInt();
					num2 = in.nextInt();
					num3 = in.nextInt();
					i--;
				}
				else if (maybe.equals("n"))
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
	//First method that controls the max value
	public static int max(int x, int y, int z)
	{
		//Creates a variable to return
		//Then takes if statements to pick the largest from the 3 integers
		int big = 0;
		if (x > y && x > z)
		{
			big = x;
		}
		else if (y > x && y > z)
		{
			big = y;
		}
		else if (z > x && z > y)
		{
			big = z;
		}
		return big;
		
		
	}
	public static int min(int x, int y, int z)
	{
		//Variable to return
		//If statements to grab the smallest value of the 3 integers
		int small = 0;
		if (x < y && x < z)
		{
			small = x;
		}
		else if (y < x && y < z)
		{
			small = y;
		}
		else if (z < x && z < y)
		{
			small = z;
		}
		return small;
	}
	public static int ave(int x, int y, int z)
	{
		//Simply creates a variable for average and gives it the formula
		//Then, returns that variable (mean)
		int mean = (x + y + z) / 3;
		
		return mean;
		
	}
	
}
