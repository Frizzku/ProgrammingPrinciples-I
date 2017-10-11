/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 6
 */
package assignment_6;

public class EvenOdd 
{
	public static void main(String[] args)
	{
		//Same program from lab6 however, it is all done in ONE loop!
		//Starts with a counter @ 50 as we are taking the numbers from 50 to 100
		//Displaying them as even and odds
		int count = 50;
		//These are strings that will store the full output of the even and odds but we have to fill them!
		String evens = "";
		String odds = "";
		//This loop takes the count up to 100
		while (count <= 100)
		{
			//I used if statements to break up the counts between evens and odds
			//This checks to see if the count number is even or odd
			if (count % 2 == 0) 
			{
				//This part accounts for the final digit WITHOUT the comma
				if (count == 100)
				{
					evens += "" + count;
					break;
				}
				//This adds the value of the even counts and stores them in our string with commas!
				evens += "" + count + ", ";
				count++;
			}
			else 
			{
				//This does the same for the final digit but for odds
				if (count == 99)
				{
					odds += "" + count;
					count++;
					
				}
				else 
				{
					//This does the same but for stores odd counts in our odd string
					odds += "" + count + ", ";
					count++;
				}
				
			}
			//count++;
		}
		//Then we take our stored strings and output the results!
		System.out.println("Even numbers between 50 and 100: " + evens);
		System.out.println("Odd numbers between 50 and 100:  " + odds);
		
		//This is the old code that used 2 loops
		
		/*count = 51;
		num = 51;
		System.out.println();
		System.out.print("Odd numbers between 50 and 100:  ");
		while (count <= 100)
		{
			if (count == 99)
			{
				num = count;
				System.out.print(num);
				break;
			}
			if (num % 2 != 0)
			{
				num = count;
				System.out.print(num + ", ");
				count++;
			}
			count++;
		
		}*/
	}
}