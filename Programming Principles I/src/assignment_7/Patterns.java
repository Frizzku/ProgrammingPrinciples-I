/* Class: 	   CS 1301/17
 * Term:  	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 7
 */
package assignment_7;

public class Patterns 
{
	public static void main(String[] args)
	{
		//Constants that are used for certain patterns (based on label)
		final int PAT_1C = 6;
		final int PAT_2 = 1;
		//This variable is used to print out the numbers as shown (except for Pattern C and D)
		int count = 0;
			System.out.println("Pattern A");
			//These for loops are similar to the star pattern ones but replaced with numbers
			//Also changes the spacing used
			//First, takes a loop for the total rows
			for (int i = 0; i <= PAT_1C; i++)
			{
				//Another loop to output the numbers
				//Displays depending on the row
				for (int nums = 1; nums <= i; nums++)
				{
					count = nums;
					System.out.print(count + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Pattern B" + "\n");
			//Same loops as above except the way the row is created is altered
			//Starts with large amount so that the numbers get printed fully
			//Then deletes one for every new row
			for (int i = 6; i >= PAT_2; i--)
			{
				//Same loop for numbers to be counted
				for (int nums = 1; nums <= i; nums++)
				{
					count = nums;
					System.out.print(count + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("Pattern C" + "\n");
			//This pattern was a bit more difficult
			//The way I did this is probably super lazy and bad but it works!
			//I take the loops above again changing the row structure to correctly count the numbers
			//Then, depending on the row/loop count, I output the pattern
			//Finally, once the outer loop as run once, I break out of the loop to just have one pattern
			int j = 1;
			for (j = 1;j <= PAT_1C; j++)
			{
				
				for (int stars = 1; stars <= j; stars++)
				{
					//These check the row number and print the correct piece of the pattern 
					if (j == 1)
					{
						System.out.print("          1");
						
					}
					if (j == 2)
					{
						
						System.out.print("        2 1");

					}
					if (j == 3)
					{
						System.out.print("      3 2 1");

					}
					if (j == 4)
					{
						System.out.print("    4 3 2 1");

					}
					if (j == 5)
					{
						System.out.print("  5 4 3 2 1");

					}
					if (j == 6)
					{
						System.out.print("6 5 4 3 2 1");

					}
					if (j > 1)
					{
						//Gets out of the loop so the pattern is printed only once
						//Also so the count does not decrease as the pattern is printed multiple times
						break;
					}
						
						
					}
				System.out.println();
			}
			System.out.println();
			System.out.println("Pattern D" + "\n");
			int k = 1;
			//This pattern was done the same as above
			//Just alters the patterns in the if statements
			for (k = 1;k <= PAT_1C; k++)
			{
				
				for (int stars = 1; stars <= k; stars++)
				{
					if (k == 1)
					{
						System.out.print("1 2 3 4 5 6");
						
					}
					if (k == 2)
					{
						
						System.out.print("  1 2 3 4 5");

					}
					if (k == 3)
					{
						System.out.print("    1 2 3 4");

					}
					if (k == 4)
					{
						System.out.print("      1 2 3");

					}
					if (k == 5)
					{
						System.out.print("        1 2");

					}
					if (k == 6)
					{
						System.out.print("          1");

					}
					if (j > 1)
					{
						break;
					}
						
					
					}
				System.out.println();
			}
	}
}
