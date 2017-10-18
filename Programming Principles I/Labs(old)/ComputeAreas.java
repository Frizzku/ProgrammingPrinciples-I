/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        8
 */
import java.util.Scanner;
public class ComputeAreas 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Outer for loop to enable re-runs
		for (int i = 0; i < 1; i++)
		{
			//Gather input from the user
			//Takes the inputs and utilizes them in the called methods
			//Prints out the results from the calculations in the methods
			System.out.print("Side for a square: ");
			double sqSide = in.nextDouble();
			System.out.println("Square Area: \t   " + squareArea(sqSide));
			System.out.print("Width and Height of rectangle: ");
			double wRect = in.nextDouble();
			double hRect = in.nextDouble();
			System.out.println("Rectangle Area: \t   " + rectangleArea(wRect, hRect));
			System.out.print("Radius of a circle: ");
			double cRad = in.nextDouble();
			System.out.println("Circle Area:\t    " + circleArea(cRad));
			System.out.print("Base and Height of triangle: ");
			double bSide = in.nextDouble();
			double hSide = in.nextDouble();
			System.out.println("Triangle Area: \t    " + triangleArea(bSide, hSide));
			
			//For loop to initiate the re-run feature
			for (int l = 0; l < 1; l++)
			{
				//Prompts user to re-run
				System.out.print("Would you like to run again?(y for yes/ n for no): ");
				//Store it in a string 
				String maybe = in.next();
				maybe.toLowerCase();
				//Uses if statements to verify the inputs and then act according to the user input
				//If y then re-run and grab 3 new integers while resetting the outer loop
				//If n then terminate program
				//If any other char then ask again for either y or n
				if (maybe.equals("y"))
				{
					i--;
				}
				else if (maybe.equals("n"))
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid answer! Enter y or n!");
					l--;
				}

		}
		}
		
	}
	//Method finds the area of a square
	public static double squareArea(double side)
	{
		//uses square area formula and formatting
		double sArea = Math.pow(side, 2);
		sArea = (int)Math.round((sArea * 100));
		sArea /= 100;
		
		return sArea;
	}
	//Method finds the area of a rectangle
	public static double rectangleArea(double width, double height)
	{
		//Uses rectangle area formula and formatting
		double rArea = width * height;
		rArea = (int)Math.round((rArea * 100));
		rArea /= 100;
		
		return rArea;
	}
	//Method finds the area of a circle
	public static double circleArea(double radius)
	{
		//Uses circle area formula and formatting
		double cArea = Math.PI * Math.pow(radius, 2);
		cArea = (int)Math.round((cArea * 1000));
		cArea /= 1000;
		return cArea;
	}
	//Method finds the area of a triangle
	public static double triangleArea(double base, double height)
	{
		//Takes the triangle formula and returns it in a formatted structure
		double tArea = 0.5 * base * height;
		tArea = (int)Math.round((tArea * 100));
		tArea /= 100;
		return tArea;
	}
}
