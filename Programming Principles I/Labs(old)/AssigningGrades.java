/* Class: 	   CS 1301/17
 * Term: 	   Fall 2017
 * Instructor: Prof. Perry
 * Name: 	   Brandon Tedeschi
 * Lab: 		   10
 */
import java.util.*;
public class AssigningGrades //Purpose: To assign entered number of students a letter grade based on their score
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numStudents;
		//Loop re-run program
		for (int l = 0; l < 1; l++)
		{
			//Obtain number of students
			System.out.print("Enter the number of students: ");
			numStudents = in.nextInt();
			//Create an array based on number of students
			int[] studentGrades = new int[numStudents];
			//Set each element in the area equal to the corresponding student
			System.out.print("Enter " + studentGrades.length + " scores: ");
			int best = 0;
			//Loops through array to pick the best score in the array
			for (int i = 0; i < studentGrades.length; i++)
			{
				studentGrades[i] = in.nextInt();
				if (studentGrades[i] > best)
				{
					best = studentGrades[i];
				}
			}
			char letter = ' ';
			//Loops again to assign each grade a letter using the best score as a comparison
			for (int i = 0; i < studentGrades.length; i++)
			{
				if (studentGrades[i] >= best - 10)
				{
					letter = 'A';
				}
				else if (studentGrades[i] >= best - 20)
				{
					letter = 'B';
				}
				else if (studentGrades[i] >= best - 30)
				{
					letter = 'C';
				}
				else if (studentGrades[i] >= best - 40)
				{
					letter = 'D';
				}
				else
				{
					letter = 'F';
				}
				//Outputs the data
				System.out.println("Student " + i + " score is " + studentGrades[i] + 
						" gets a grade of: \t" + letter);
				
			}
			if (reRun())//if true was returned from re-run method
			{
				l--;
				continue;//Skip exit method
			}
			
			System.exit(0);//Exits program
		}
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
