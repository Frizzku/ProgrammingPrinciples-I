/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        7
 */
package lab_7;

public class Practice_7_3
{
	public static void main(String[] args)
	{
		//Constant for the total rows of the triangle
		final int ROW = 9;
		
		for (int rows = 1;rows <= ROW; rows++)
		{
			//This creates the spaces by taking the row its on and then outputting all the spaces till the loop is untrue
			for (int spaces = ROW - rows; spaces >= 1; spaces--)
			{
				System.out.print(" ");
			}
			//This does the same as spaces loops except grows until the outer loop becomes untrue
			for (int stars = 1; stars <= (rows * 2) - 1; stars++)
			{
				System.out.print("*");
			}
			//Moves to the next row in the loop
			System.out.println();
		}
		
	}
}
