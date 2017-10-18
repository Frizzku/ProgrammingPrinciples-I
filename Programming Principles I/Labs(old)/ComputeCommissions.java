/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        8
 */

public class ComputeCommissions 
{
	public static void main(String[] args)
	{
		//Creates the layout for the table 
		System.out.println("Sales Amount  \t Commission \n ");
		System.out.println("----------------------------------");
		//For loop that cycles through the commission list in textbook
		for (double i = 10000; i <= 100000; i+= 5000 )
		{
		System.out.println(i + "  \t " + computeCommission(i));
		}
		
		
	}
	//Method that does the magic of computing the commission
	public static double computeCommission(double salesAmt)
	{
		//Take your commission tally and placeholder newTotal
		double commission = 0, newTotal = 0;
		//If statement to properly add each new commission amount depending on sales
		//Goes in descending order to make use of the newTotal variable
		//newTotal separates each level amount to only apply the commission rate to specific values of 5000
		if (salesAmt >= 10000.01)
		{
			commission += (newTotal = salesAmt - 10000) * .12;
		}
		if (salesAmt >= 5000.01)
		{
			commission += (newTotal = newTotal - (newTotal - 5000)) * .1;
		}
		if (salesAmt >= .01)
		{
			commission += (newTotal) * .08;
		}
		return commission;
		
	}
}
