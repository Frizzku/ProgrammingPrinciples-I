/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 8
 */

public class MyTriangle //Creates two methods to use in a different class
{
	//This method checks that the sides given by the user are valid
	//No one side may be bigger than two of the other sides combined
	public static boolean isValid(double s1, double s2, double s3)
	{
		//If statement that checks the requirement of a valid triangle
		if (s1 + s2 > s3)
		{
			if (s1 + s3 > s2)
			{
				if (s2 + s3 > s1)
				{
					return true;
				}
			}
		}
		//Returns false if the program fails to make it through the nested if statements
		return false;
		
	}
	//This method computes the area of a triangle using heron's formula
	public static double area(double s1, double s2, double s3)
	{
		//Applies Heron's formula
		double sides = (s1 + s2 + s3) / 2;
		double areaofTri = Math.sqrt(sides * (sides - s1) * (sides - s2) * (sides - s3) );
		//Returns the area
		return areaofTri;
	}
}
