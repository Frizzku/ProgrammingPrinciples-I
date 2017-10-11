/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        6
 */
package lab_6;
import java.util.Scanner;
public class Practice_6_4 
{
	public static void main(String[] args)
	{
		//Acquires the input of a string from the user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string! ");
		String user = in.nextLine();
		//Prints out the string of the user
		System.out.println("Entered String: " + user);
		int count = 0;
		//While loop that goes through each character of string in the loop
		while (user.length() >= count) 
		{
			if (user.length() == count)
			{
				break;
			}
			//Outputs the character number and each character
			//Also allows the loop to continue and end
			System.out.println("Character # " + (count + 1) + ": \t " + user.charAt(count));
			count++;
		}
		
		
	}
}
