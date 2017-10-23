/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Lab: 		   10
 */
import java.util.*;//Need to import Scanner and Array class
public class IdenticalArrays //Purpose: Display whether the contents of each list is identical or not
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		for (int l = 0; l < 1; l++)//Re-run loop
		 {
			//Gather first list from user
			System.out.print("Enter list1(first entry is length of list): ");
			int[] firList = new int[in.nextInt()];//Sets each value to an array element
			for (int i = 0; i < firList.length; i++)
			{
				firList[i] = in.nextInt();
			}
			//Does the same as above except for the second list
			System.out.print("Enter list2(first entry is length of list): ");
			int[] secList = new int[in.nextInt()];
			for (int i = 0; i < secList.length; i++)
			{
				secList[i] = in.nextInt();
			}
			if (equals(firList, secList))//Test the method to see if true is returned
			{
				System.out.println("These lists are identical in contents!");
			}
			else//Else returned false
			{
				System.out.println("These list are not identical in contents!");
			}
			if (reRun())//if true was returned from re-run method
			{
				l--;
				continue;//Skip exit method
			}
			
			System.exit(0);//Exits program
		 }
	}
	//Method takes the arrays and examines them to see if they have the same stuff in them
	public static boolean equals(int[] list1, int[] list2)
	{
		if (list1.length != list2.length)//Test to see if they have the same length
		{
			return false;
		}
		//Sorts the arrays to look and see if they are equal
		Arrays.sort(list1);
		Arrays.sort(list2);
		int sumList1 = 0, sumList2 = 0;
		for (int i = 0; i < list1.length; i++)//Loop through each array 
		{
			sumList1 = list1[i];
			sumList2 = list2[i];
			if (!(sumList1 == sumList2))//Compares if the value at each index is equal
			{
				return false;//If they are not return false
			}
		}
		return true;//Returns true since every value is equivalent
	}
	//Method creates the re-run feature
		public static boolean reRun()
		{
			Scanner ans = new Scanner(System.in);
			for (int z = 0; z < 1; z++)//Loop to get a yes or no answer
			{
				//Returns true or false(y = true n = false) to determine whether to re-run
				System.out.print("Would you like to re-run?(y or n): ");
				String maybe = ans.next();
				String test = maybe.toLowerCase();
				if (test.equals("n"))
				{
					return false;
				}
				else if (!(test.equals("y")))
				{
					System.out.println("Invalid answer! Enter y or n!");
					z--;
				}
			}
			return true;
		}
}
