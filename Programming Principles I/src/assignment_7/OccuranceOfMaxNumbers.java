/* Class: 	   CS 1301/17
 * Term:  	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 7
 */
package assignment_7;
import java.util.Scanner;
public class OccuranceOfMaxNumbers 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Outermost loop that allows for the re-run feature
	for (int z = 0; z < 1; z++)
	{
		//Gathers the numbers till zero is entered
		System.out.print("Enter numbers!(ends once 0 is inputed): ");
		int inNum = in.nextInt();
		//max used to know the largest number
		//counter is used to count how many times its entered
		int max = 0;
		int counter = 0;
		//This is the sentinel value while loop 
		while (inNum != 0)
		{
			//If statement that checks if the new input is larger than the max
			//if so it resets the counter and makes this new input the new max
			//Then, it breaks out of the rest of the code and runs the loop again
			if (inNum > max)
			{
				counter = 0;
				max = inNum;
				counter++;
				inNum = in.nextInt();
				continue;
			}
			//This if statement checks to see if counter needs to count 
			//Depends on if the next number entered is equal to the established max
			if (max == inNum)
			{
				counter++;
			}
			//Takes in the next value for the program to examine
			inNum = in.nextInt();		
		}
		//Outputs what the max is and its occurance
		System.out.println("The largest number is: " + max + " !");
		System.out.println("The occurance of the largest number is: " + counter + " !");
		//This for loop is the bulk of the re-run feature
		for (int l = 0; l < 1; l++)
		{
			//Ask if they would like to re-run
			System.out.println("Would you like to run this progarm again?(enter y or n for yes or no): ");
			String maybe = in.next();
			maybe.toLowerCase();
			//If their answer is "y" or yes then reset the variables and then re-run
			//Else if they do not by entering "n" the program ends
			//Else, they entered something invalid and thus are prompted again to say yes or no
			if (maybe.equals("y"))
			{
				counter = 0;
				max = 0;
				z--;
			}
			else if (maybe.equals("n"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid input! Try again!");
				l--;
			}
		}
	}
}
}
