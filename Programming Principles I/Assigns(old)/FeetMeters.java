/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof Perry
 * Name: 	   Brandon Tedeschi
 * Assignment: 9
 */

public class FeetMeters //Converts feet to meters and vice versa 
{
	public static void main(String[] args)
	{
		//Displays the conversions in a table with formatting 
		System.out.printf("%-10s%-10s%-1c%10s%10s\n" , "Feet", "Meters", '|', "Meters", "Feet");
		System.out.println("---------------------------------------------");
		//Variables to call methods to output and specific starting point for the table
		double feet = 0;
		double meters = 20;
		double convertToMeters = 0;
		double convertToFeet = 0;
		//Loop to output table
			for (int i = 1; i <= 10; i++)
			{
				feet = i;
				convertToMeters = feetToMeters(i);//invokes feet to meters conversion
				meters += 5;
				convertToFeet = metersToFeet(meters);//invokes meters to feet conversion
				System.out.printf("%4.1f%11.3f%6s%8.1f%13.3f\n", feet, convertToMeters,'|', meters, convertToFeet);
			}
						
	}
	//Method that converts feet to meters
	public static double feetToMeters(double foot)
	{
		double meters = 0;
		//uses conversion formula
		meters = 0.305 * foot;
		
		return meters;
	}
	//Method that converts meters to feet
	public static double metersToFeet(double meter)
	{
		double feet = 0;
		//uses formula for conversion
		feet = 3.279 * meter;
		
		return feet;
	}
}
