/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 6
 */
package assignment_6;
import java.util.Scanner;
public class InputSum 
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		//This program uses sentinel values for our loop!
		System.out.print("Enter positive integers to add!(quit by entering a negative integer)");
		//There are the vars used to keep track of numbers entered, control loop, and sum
		int posInt = in.nextInt();
		int counter = 0;
		int sum = 0;
		//The string allows me to store the numbers entered for later output
		String values = "" ;
		//Nested loops to control the re-run feature
		while (counter == 0)
		{
			//This loop is the heart
			//Controls the inputs values and prompts for more inputs until a negative is inputed
			while (posInt >= 0)
			{
				if (posInt < 0)
				{
					break;
				}
				values += posInt;
				values = values + ", ";
				sum += posInt;
				System.out.print("Enter positive integers to add!(quit by entering a negative integer)");
				posInt = in.nextInt();
			}
				
			//This obtains the last value entered without the comma
			values = values.substring(0, (values.length() - 2));
			//Outputs the integers entered and the sum
			System.out.println("Entered Integers:\t    " + values);
			System.out.println("The sum of these values is: " + sum);
			//Prompts for the program to continue running
			System.out.print("Would you like to continue?(enter y for yes or n for no): ");
			String answer = in.next();
			answer.toLowerCase();
			//If statement to determine if user wants to continue
				if (answer.charAt(0) == 'y')
				{
					//resets variable to original values and then continues the loop
					posInt = 0;
					values = "";
					counter = 0;
					continue;
				}
				else if (answer.charAt(0) == 'n')
				{
					System.exit(0);
				}
		}
		
	}
		
	
}