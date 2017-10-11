/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 8
 */
import java.util.Scanner;
public class TestMyTriangle 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double triArea = 0;
		//Outer loop to allow for re-runs
		for (int z = 0; z < 1; z++)
		{
			//Acquire the sides of a triangle from the user
			System.out.print("Enter the length of each side of a triangle: ");
			double side1 = in.nextDouble();
			double side2 = in.nextDouble();
			double side3 = in.nextDouble();
			//Calls the MyTriangle class and .isValid method to verify the triangle entered
			System.out.println("Is this a valid triangle?     " + MyTriangle.isValid(side1, side2, side3));
			//if it is valid it computes the area bhy calling MyTriangle class and .area method
			if (MyTriangle.isValid(side1, side2, side3))
			{
				triArea = MyTriangle.area(side1, side2, side3);
				System.out.println("The area of this triangle is: " + triArea);
			}
			//Else its an invalid triangle
			else
			{
				System.out.println("INVALID TRIANGLE!");
			}
			//Loop to cycle through the re-run feature if an invalid input is entered in response
			for (int l = 0; l < 1; l++)
			{
				//Prompt user for their choice
				System.out.print("Would you like to try again?(y for yes/ n for no): ");
				String maybe = in.next();
				maybe.toLowerCase();
				//Evaluates their response and either re-runs, exits, or prompts user for another response
				if (maybe.equals("y"))
				{
					side1 = 0; side2 = 0; side3 = 0;
					z--;
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
}
