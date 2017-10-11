/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        9
 */

public class DisplayCharacters 
{
	//This is meant to display all characters between 1 and Z(capital)
	//Displays ten chars per row
	public static void main(String[] args)
	{
		//Simply call the void method that performs the action above
		printChars('1', 'Z', 10);
		
	}
	public static void printChars(char ch1, char ch2, int charsPerLine)
	{
		int counter = 0;//Keeps track of the rows
		for (int z = 0; z < 1; z++)//Runs a loop until we meet five rows
		{
			for (int i = 0; i < 10; i++)//Displays ten chars per line
			{
				//Starts at first char and increments to display the next char
				System.out.print(ch1++ + " ");
				//If statement to break the loop once the first char's original value is the same as char2
				if (ch1 == ch2 + 1)
				{
					break;
				}
			}
			System.out.println();
			counter++;//Counts the rows
			if (counter == 5)//Once 5 rows are printed; exit the loop
			{
				break;
			}
			z--;
		}
	}
}
