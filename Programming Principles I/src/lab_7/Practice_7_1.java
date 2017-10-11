/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        7
 */
package lab_7;
import java.util.Scanner;
public class Practice_7_1 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Ask the user for an integer between 20 and 60 
		//Sets up vars needed to keep track of the even numbers and add them to a sum
		System.out.print("Enter a number between 20 and 60(may be either value): ");
		int inNum = in.nextInt();
		int counter = 0;
		int sum = 0;
		//Outermost for loop that keeps the program running until exited by the user
		for (int i = 0; i < 1; i++)
		{
			//This while loop is used to make sure a valid input is used
			while (inNum < 20 || inNum > 60)
			{
				System.out.println("Invalid output!");
				System.out.print("Enter a new number!");
				inNum = in.nextInt();
			}
			//This allows every even number up to the entered value
			while (counter <= inNum)
			{
			//If statements to only grab the even numbers	
			if (counter % 2 == 0)
				{
					sum += counter;
					counter += 2;
				}
			}
			//This takes into account if an odd is entered and thus adds one to counter
			//Then adds the new counter to sum
			if (!(counter % 2 ==0))
			{
				counter++;
				sum += counter;
			}
			
			
			//Outputs of the entered number and the sum
			System.out.println("Entered value = " + inNum);
			System.out.println("Sum of even numbers between 2 and " + inNum + " is: " + sum);
			inNum = 0;
			i--;
			//This for loop works as the prompt for the program to re-run
			for (int l = 0; l < 1; l++)
			{
				//Prompts if they would like to continue
				System.out.print("Would you like to run again?(Y for yes/ N for no): ");
				String maybe = in.next();
				maybe.toLowerCase();
				//If statement checks to see what value was entered and if it was valued
				//Then takes action depending on the answer
				if(maybe.equals("y"))
				{
					counter = 2;
					sum = 0;
					i--;
					System.out.print("Enter another number!: ");
					inNum = in.nextInt();
				}
				else if (maybe.equals("n"))
				{
					System.exit(i);
				}
				else 
				{
					System.out.println("Invalid response! Enter y or n!");
					l--;
				}
		}	
		
			
			
			
			
		}
		
	}
}
