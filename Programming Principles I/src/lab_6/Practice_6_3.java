/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        6
 */
package lab_6;

public class Practice_6_3 
{
	public static void main(String[] args)
	{
		//Uses two vars, both are for loop, count is to end loop and num represents the odd or even numbers
		int count = 50;
		int num = 50;
		System.out.print("Even numbers between 50 and 100: ");
		//While loop that goes to 100
		while (count <= 100)
		{
			//if statement that sees if the number is even or odd
			if (num % 2 == 0) 
			{
				//This if statement is used to remove the extra comma at the end of the sequence
				if (count == 100)
				{
					num = count;
					System.out.print(num);
					break;
				}
				//Formulas to continue loop and give num the value of each even number
				num = count;
				System.out.print(num + ", ");
				count++;
			}
			count++;
		}
		count = 51;
		num = 51;
		System.out.println();
		System.out.print("Odd numbers between 50 and 100:  ");
		
		//Loop that does the same as above except for odds
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
		}
		
	}
}
