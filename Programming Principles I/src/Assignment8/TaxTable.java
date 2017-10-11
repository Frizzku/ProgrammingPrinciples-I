/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 8
 */

public class TaxTable
{
	public static void main(String[] args)
	{
		//Formatting a table to display the output
		System.out.println("Taxable  \t Single  \t Married Joint    \t Married  \t Head of ");
		System.out.println("Income   \t         \t or Qualifying    \t Separate  \t a House");
		System.out.println("-----------------------------------------------------------------------------------------");
		//Loop that goes from 50k to 60k, increments every 50 dollars
		for(double i = 50000; i <= 60000; i += 50)
		{
			//Formatting for display of values plus invoking the computeTax method
			//Uses the variable in the loop to give the computeTax method taxableIncome
			//The numbers 0,1,2,3 are used to tell which tax rate to use based on status
			System.out.print(i + "   \t ");
			System.out.print(Math.round(computeTax(0 , i)) + "          \t ");
			System.out.print(Math.round(computeTax(1 , i)) + "               \t ");
			System.out.print(Math.round(computeTax(2 , i)) + "         \t ");
			System.out.print(Math.round(computeTax(3 , i)) + "     \t ");
			System.out.println();
		}
		
	}
	//Method that computes the tax
	public static double computeTax(int status, double taxableIncome)
	{
		double totTax = 0;
		
		//Must check what status to evaluate based on the passed variable for status
		//Then taxes the income at each tax bracket threshold
		//Done with every status group
		if (status == 0)
		{
			if (taxableIncome <= 8350)
			{
				totTax = taxableIncome * 0.10;
			}
			else if (taxableIncome <= 33950)
			{
				totTax = 8350 * 0.10 + ((taxableIncome - 8350) * 0.15);
			}
			else if (taxableIncome <= 82250)
			{
				totTax = 8350 * 0.10 + ((33950 - 8350) * 0.15) + 
						((taxableIncome - 33950) * 0.25);
			}
			else if (taxableIncome <= 171550)
			{
				totTax = 8350 * 0.10 + ((33950 - 8350) * 0.15) + 
					((82250 - 33950) * 0.25) + ((taxableIncome - 82250) * 0.28);
			}
			else if (taxableIncome <= 372950)
			{
				totTax = 8350 * 0.10 + ((33950 - 8350) * 0.15) + 
					((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((taxableIncome - 171550) * 0.33);
			}
			else
			{
				totTax = 8350 * 0.10 + ((33950 - 8350) * 0.15) + 
						((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((taxableIncome - 372950) * 0.35);
			}
		}
		if (status == 1)
		{
			if (taxableIncome <= 8350)
			{
				totTax = taxableIncome * 0.11;
			}
			else if (taxableIncome <= 33950)
			{
				totTax = 8350 * 0.11 + ((taxableIncome - 8350) * 0.16);
			}
			else if (taxableIncome <= 82250)
			{
				totTax = 8350 * 0.11 + ((33950 - 8350) * 0.16) + 
						((taxableIncome - 33950) * 0.26);
			}
			else if (taxableIncome <= 171550)
			{
				totTax = 8350 * 0.11 + ((33950 - 8350) * 0.16) + 
					((82250 - 33950) * 0.26) + ((taxableIncome - 82250) * 0.29);
			}
			else if (taxableIncome <= 372950)
			{
				totTax = 8350 * 0.11 + ((33950 - 8350) * 0.16) + 
					((82250 - 33950) * 0.26) + ((171550 - 82250) * 0.29) 
					+ ((taxableIncome - 171550) * 0.34);
			}
			else
			{
				totTax = 8350 * 0.11 + ((33950 - 8350) * 0.16) + 
						((82250 - 33950) * 0.26) + ((171550 - 82250) * 0.29) 
						+ ((372950 - 171550) * 0.34) + ((taxableIncome - 372950) * 0.36);
			}
		}
		if (status == 2)
		{
			if (taxableIncome <= 8350)
			{
				totTax = taxableIncome * 0.12;
			}
			else if (taxableIncome <= 33950)
			{
				totTax = 8350 * 0.12 + ((taxableIncome - 8350) * 0.17);
			}
			else if (taxableIncome <= 82250)
			{
				totTax = 8350 * 0.12 + ((33950 - 8350) * 0.17) + 
						((taxableIncome - 33950) * 0.27);
			}
			else if (taxableIncome <= 171550)
			{
				totTax = 8350 * 0.12 + ((33950 - 8350) * 0.17) + 
					((82250 - 33950) * 0.27) + ((taxableIncome - 82250) * 0.30);
			}
			else if (taxableIncome <= 372950)
			{
				totTax = 8350 * 0.10 + ((33950 - 8350) * 0.15) + 
					((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.30) + 
					((taxableIncome - 171550) * 0.35);
			}
			else
			{
				totTax = 8350 * 0.12 + ((33950 - 8350) * 0.17) + 
						((82250 - 33950) * 0.27) + ((171550 - 82250) * 0.30) + 
						((372950 - 171550) * 0.35) + ((taxableIncome - 372950) * 0.37);
			}
		}
		if (status == 3)
		{
			if (taxableIncome <= 8350)
			{
				totTax = taxableIncome * 0.13;
			}
			else if (taxableIncome <= 33950)
			{
				totTax = 8350 * 0.13 + ((taxableIncome - 8350) * 0.18);
			}
			else if (taxableIncome <= 82250)
			{
				totTax = 8350 * 0.13 + ((33950 - 8350) * 0.18) + 
						((taxableIncome - 33950) * 0.28);
			}
			else if (taxableIncome <= 171550)
			{
				totTax = 8350 * 0.13 + ((33950 - 8350) * 0.18) + 
					((82250 - 33950) * 0.28) + ((taxableIncome - 82250) * 0.31);
			}
			else if (taxableIncome <= 372950)
			{
				totTax = 8350 * 0.13 + ((33950 - 8350) * 0.18) + 
					((82250 - 33950) * 0.28) + ((171550 - 82250) * 0.31) + 
					((taxableIncome - 171550) * 0.36);
			}
			else
			{
				totTax = 8350 * 0.13 + ((33950 - 8350) * 0.18) + 
						((82250 - 33950) * 0.28) + ((171550 - 82250) * 0.31) + 
						((372950 - 171550) * 0.36) + ((taxableIncome - 372950) * 0.38);
			}
		}
						
		
		//Returns the total tax
		return totTax;
		}
}

