/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 9
 */

public class PalindromicPrime //Purpose: Display first 100 palindromicPrime numbers
{
	public static void main(String[] args)
	{
		final int DIGS_PER_LINE = 10;
		int counter = 0;//Counter for number of palindromicPrime numbers
		int currNum = 2;//Starting point for numbers
		while (counter < 100)//Ends when 100 palindromicPrime numbers are displayed
		{
			//if the invoked methods are true then count this as a palindromicPrime number
			//then print that number
			if (isPalindrome(currNum) && isPrime(currNum))
			{
				counter++;
				if (counter % DIGS_PER_LINE == 0)
				{
					System.out.print(currNum + " \n");
				}
				else
					System.out.print(currNum + " ");
			}
			currNum++;
		}
		
	}
	//Method that checks if the currentNumber is palindrome
	public static boolean isPalindrome(int currentNum)
	{
		//Converts number to string
		//Then grabs each character starting from the end and counting backwards
		int palNum = 0;
		String transfer = "" + currentNum;
		String mod = "";
		for (int i = transfer.length() - 1; i >= 0; i--)
		{
			mod += transfer.charAt(i);
		}
		palNum = Integer.parseInt(mod);//Changes the string back to an integer
		
		if (palNum == currentNum)//checks if edited number is same as currentNumber
		{
			return true;
		}
		return false;
	}
	//Method that checks if the currentNumber is prime
	public static boolean isPrime(int currentNum)
	{
		for (int divided = 2; divided <= (currentNum / 2); divided++)
		{
			if (currentNum % divided == 0)
				return false;
		}
		
		return true;
	}
}
