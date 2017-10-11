/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        6
 */
package lab_6;

public class Practice_6_2 
{
	public static void main(String[] args)
	{
		//Creates a var to represent the final row of the pattern
		final int FIN_ROW = 1;
		//First for loop that starts with 10 as the rows and counts down (to show the build down)
		for (int rows = 10; rows>= FIN_ROW; rows--)
		{
			//Second for loop that runs the number that the row var equals
			for (int num = 1; num <= rows; num++ )
				System.out.print("*");
			//This output is in order for the stars to be created on the next line
			System.out.println();
		}
		
	}
}
