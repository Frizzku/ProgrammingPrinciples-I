/* Class: 	   CS 1301/17
 * Term:  	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 7
 */
package assignment_7;
import java.util.Scanner;
public class PostiveNegative 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Gathers the input from the user
		System.out.print("Enter an integer (ends when 0 is entered): ");
		int values = in.nextInt();
		//All the counters and variables for the equations used in the program
		double sum = 0, ave = 0;
		int posCount = 0, negCount = 0, counter = 0;
		//Outermost loop that allows the re-run feature
	for (int z = 0; z < 1; z++)
	{
		//This loop allows for the outputs to print
		//Only when the value input is becomes zero and ends the program 
		for (int i = 0; i < 1; i++)
		{
			//while loop that checks if the input is equal to zero
			while (values != 0)
			{
				//This counter is used to count the inputs of each run cycle to find average
				counter++;
				//Takes the inputs and adds them
				sum += values;
				//if statement that determines whether to count up
				//For negative or positive counter
				if (values < 0)
				{
					negCount++;
				}
				else if (values > 0)
				{
					posCount++;
				}
				values = in.nextInt();
				//Calculates average of inputs
				ave = sum / counter;
			}
			System.out.println("The number of positive integers entered: " + posCount);
			System.out.println("The number of negative integers entered: " + negCount);
			System.out.println("The total of integers entered: " + sum);
			System.out.println("The average of integers entered: " + ave);
			//Resets all the values for when the program runs again
			counter = 0; ave = 0; posCount = 0; negCount = 0; values = 0; sum = 0;
			
			
		}
		//This for loop controls the operation of the re-run prompt
		for(int l = 0; l < 1; l++)
		{
			//prompts if they would like to continue
			System.out.print("Would you like to continue?(y for yes / n for no): ");
			String maybe = in.next();
			//makes all entered letters lowercase
			maybe.toLowerCase();
			//If statement that checks the input for re-run
			//Validates their answer and acts accordingly to their entry
			if (maybe.equals("y"))
			{
				System.out.print("Enter an integer (ends when 0 is entered): ");
				values = in.nextInt();
				z--;
			}
			else if (maybe.equals("n"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid answer! Enter y or n" );
				maybe = in.nextLine();
				l--;
			}
		
		}
	}
		
		
	}

}