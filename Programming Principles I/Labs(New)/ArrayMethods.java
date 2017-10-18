/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Lab: 		   10
 */
import java.util.*;
public class ArrayMethods //Purpose: To display the array, the max and min in the array, 
//squared elements in the array, and the array reversed by invoking methods
{
	public static void main(String[] args)
	{
		//Create two arrays, one is array that is edited while the other is used for the reverse method
		int[] ourArray = new int[5];
		int[] OGArray = new int[5];
		//Sets the first array to random integers between 1 and 1000
		System.out.print("Original Array = \t\t        ");
		for (int i = 0; i < ourArray.length; i++)
		{
			int values = (int)(1 + Math.random() * 1000);
			ourArray[i] = values;
			System.out.print(values + " ");
		}
		System.arraycopy(ourArray, 0, OGArray, 0, 5);//Makes a copy for reverse method
		//Outputs and invoking of each method
		System.out.println();
		System.out.println("The smallest number in the array is:    " + arrayMin(ourArray));
		System.out.println("The largest number in the array is:     " + arrayMax(ourArray));
		System.out.print("The square of all elements is the are:  ");
		arraySquared(ourArray);
		System.out.println();
		System.out.print("The elements reversed are:\t\t");
		arrayReverse(OGArray);
	}
	public static int arrayMax(int[] arr)//Method finds the max element in the array
	{
		int max;
		Arrays.sort(arr);
		max = arr[arr.length - 1];
		return max;
	}
	public static int arrayMin(int[] arr)//Method finds the min element in the array
	{ 
		Arrays.sort(arr);
		return arr[0];
	}
	public static void arraySquared(int[] arr)//Method squares all elemnts in the array
	{
		int squared = 0;
		for (int i = 0; i < arr.length; i++)
		{
			squared = (int)Math.pow(arr[i], 2);
			System.out.print(squared + " ");
		}
	}
	public static void arrayReverse(int[] arr)//Method reverses the elements using the copy 
	{
		int[] reversedArray = new int[5];//New Array is made to store the reversed array
		//Goes through the original array backwards to grab each element from the end to the front
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++)
		{
			reversedArray[j] = arr[i];
			System.out.print(reversedArray[j] + " ");
		}
	}
}
