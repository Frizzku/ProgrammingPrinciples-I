/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 6
 */
package assignment_6;

public class Diamonds 
{
	public static void main(String[] args)
	{
		//Constant that represents the longest row in the patterns(number of stars in row)
		final int LONGEST_ROWS = 5;
		//Nested loop (3 total) that take for every row create spaces and stars in a certain order
		//This also creates the upper triangle of the diamond
		for (int rows = 1;rows <= LONGEST_ROWS; rows++)
		{
			//This creates the spaces by taking the row its on and then outputting all the spaces till the loop is untrue
			for (int spaces = LONGEST_ROWS - rows; spaces >= 1; spaces--)
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
		//This loop takes the same 3 loops but inverses them
		//Also creates the last 4 rows
		for (int rows = LONGEST_ROWS - 1; rows >= 1; rows--)
		{
			//The only main difference between the two are the spaces being printed from smallest to greatest
			for (int spaces = 1; spaces <= LONGEST_ROWS - rows; spaces++)
			{
				System.out.print(" ");
			}
			//This loop stays the same since the number of stars printed needs to be the same
			for (int stars = 1; stars <= (rows * 2) - 1; stars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Creates spaces between each diamond
		System.out.println("\n");
		//This second diamond is made by taking the about one but reversing both triangles
		//However, you run into the problem of a double single star
		//Therefore, you must change how the rows are counted and edit how the stars and spaces are made
		
		//Keep this loop the same was the bottom loop of the first diamond
		for (int rows = LONGEST_ROWS; rows >= 1; rows--)
		{
			for (int spaces = 0; spaces <= LONGEST_ROWS - (rows); spaces++)
			{
				System.out.print(" ");
			}
			for (int stars = 1; stars <= (rows * 2) - 1; stars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Edit the values of stars and spaces
		//Removes the first star and moves the spacing around to create the hourglass diamond
		for (int rows = 2;rows <= LONGEST_ROWS; rows++)
		{
			
			for (int spaces = LONGEST_ROWS - (rows); spaces >= 0; spaces--)
			{
				System.out.print(" ");
			}
			for (int stars = 2; stars <= (rows * 2); stars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
}