/* Class: 	   CS 1301/17
 * Term:  	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 7
 */
package assignment_7;
import java.util.Scanner;
public class ComputeCDValue 
{
	public static void main(String[] args)
	{
		//Acquires all the needed inputs from the user like # of months, current value, and annual %
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the CD's current value: ");
		int currentCDV = in.nextInt();
		System.out.print("Enter the annual percentage yield: ");
		double apy = in.nextDouble();
		System.out.print("Enter the number of months: ");
		int months = in.nextInt();
		int counter = 1;
		double newVal = currentCDV;
		//Creates a raw formula that is used every new run to output a proper final value at each month
		double rawForm = 0;
		double form = 0;
		//Only one for loop needed to make the formulas run only for how many months are entered
		for (int i = 1; i <= months; i++)
		{
			//Uses the equation given 
			rawForm = ((newVal + ((newVal * apy) / 1200)));
			//Sets the final formula to the raw one after it runs
			form = rawForm;
			//Creates proper rounding and formatting
			form = (int)Math.round((form * 100));
			form = form / 100;
			//Displays the outputs!
			System.out.println("After " + counter + " month(s), the CD is worth: ");
			System.out.println();
			System.out.println(" \t \t " + newVal + " + " + newVal + " * " + apy + " / " + " 1200 = " + form);
			newVal = form;
			//This counter makes sure the correct number of months is displayed for each run of the loop
			counter++;
		}
		
	}
}
