/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        7
 */
package lab_7;
import java.util.Scanner;
public class Practice_7_2 
{
	public static void main(String[] args)
	{
		//Program wants to print out all words inputed by the user
		Scanner in = new Scanner(System.in);
		//Prompts user for the input and sets it to a string
		System.out.print("Enter a string!: ");
		String input = in.nextLine();
		//The sub string is used for the place holder of each word or substring
		String sub = "";
		//This char will allows us to look at each char in the user string 
		char ch;
		//All counters and int values vars needed for equation
		int subCounter = 0, counter = 0, absolute = 0, end = 0; 
		//giant for loop that allows the program to be re-run in a single compile
	for (int z = 0; z < 1; z++)
	{
		System.out.println("String entered: " + input);
		System.out.println();
		//This for loop goes through each index of the string array
		for (int i = 0; i <= input.length() - 1; i++)
		{
			//This counter allows me to use an equation to figure out the starting index for a substring
			counter++;
			//This end counter allows me to use the if statement below to grab the last word
			end++;
			ch = input.charAt(i);
				if (ch == ' ')
				{
					//Absolute represents a piece of the formula I used to get the beginIndex
					absolute = Math.abs((1 - counter));
					//This is the formula I used by taking the absolute value to get length of the word
					//Then, taking the index in the string and subtracting it by length of the word
					sub = input.substring((i - absolute), i);
					//Resets the counter to finish my formula off
					counter = 0;
					//Another counter to keep track of number of words in the string
					subCounter++;
					System.out.println("Word #" + subCounter + ": \t" + sub);
				}
				//This if statement grabs the final word of the string 
				if (end == input.length())
				{
					//Slightly different formula used to obtain length of the word compared to index in string
					//Also you must add 1 to the i in order to retrieve the final character in the string
					sub = input.substring((i - (counter - 1)), i + 1);
					subCounter++;
					System.out.println("Word #" + subCounter + ": \t" + sub);
				}
			
			
			
			}
			//This for is the main re-run part that includes the prompt and validation of the answer given
			for (int l = 0; l < 1; l++)
			{
				System.out.print("Would you like to re-run? (y for yes/ n for no): ");
				String maybe = in.nextLine();
				maybe.toLowerCase();
				if (maybe.equals("y"))
				{
					//Resets all the variables if they say yes
					z--;
					end = 0;
					subCounter = 0;
					counter = 0;
					System.out.print("Enter a string!: ");
					input = in.nextLine();
				}
				else if (maybe.equals("n"))
				{
					//Exits if they say no
					System.exit(z);
				}
				else
				{
					//Re-runs this for loop if they do not enter y or n
					System.out.println("Invalid answer! Enter y or n!");
					l--;
				}
		
			}
		}
	}
}
