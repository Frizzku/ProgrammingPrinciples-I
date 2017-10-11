/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 8
 */
import java.util.Scanner;
public class InvestmentValue 
{
	public static void main(String[] args)
	{
		//Gather input from the user (investment amount and the interest rate)
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your investment: ");
		double invest = in.nextDouble();
		System.out.print("Enter the annual interest rate in percentage: ");
		double interest = in.nextDouble();
		//Converts the percentage into a decimal for formula
		interest /= 100;
		System.out.println("Years \t " + "Future Value");
		//Loop to use the formula for all 30 years
		for (int i = 1; i <= 30; i++)
		{
			//Outputs the year and the future worth
			//Calls the futureInvestmentValue method
			//Uses input from the user and the loop integer to count the years
			System.out.println(i + "   \t  " + futureInvestmentValue(invest, interest, i));
			
		}		
		
		
	}
	//The method used for computing the future value of an investment
	public static double futureInvestmentValue(double investmentAmt, double monIntrestRate, int years)
	{
		//Uses the formula from the previous tax program
		double futureValue = investmentAmt * Math.pow((1 + (monIntrestRate / 12)), (years * 12));
		//Formats to be in dollars and cents
		futureValue = (int)(futureValue * 100);
		futureValue /= 100;
		//Returns the computed value when the method is invoked
		return futureValue;
	}
}
