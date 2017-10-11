/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        6
 */
package lab_6;

public class Practice_6_1 
{
	public static void main(String[] args)
	{
		//Programs must take the sum of all the integers between 1 and 100
		System.out.println("What is the sum of the integers from 1 to 100?");
		//Need two vars, one as a counter to end the loop and one to store the added values
		int i = 0;
		int t = 0;
		//As long as the counter is less than OR equal to 100, perform the loop
		while (i <= 100)
		{
			//t is my store var for the addition and simply adds the value of i to t every loop cycle
			t +=i;
			//Add i to itself to eventually break out of the loop
			i++;
			
		}
		//Outputs value of t
		System.out.println("The sum of values between 1 and 100 equals: " + t);
	}
}
