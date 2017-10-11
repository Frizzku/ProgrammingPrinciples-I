/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Assignment: 8
 */
import java.util.Scanner;
public class CrapsGame
{
	public static void main(String[] args)
	{
		//Need Scanner to allow re-run feature
		Scanner in = new Scanner(System.in);
		//Must acquire a dice roll from rollDice() method and set each roll to a variable
		//Check the results of the roll to the rules of the game
		int firDie = 0;
		int secDie = 0;
		String lose = "You lose...";
		String win = "You win!";
		int sum = 0;
		//Outer loop to apply re-run feature
		for (int z = 0; z < 1; z++)
		{
			//Sets the method rollDice to variables
			//Adds the values of the rolls together
			firDie = rollDice();
			secDie = rollDice();
			sum = firDie + secDie;
			//If the roll equals 2 3 or 12, the player loses
			//If the roll equals 7 or 11, the player wins
			System.out.println("You rolled " + firDie + " + " + secDie + " = " + sum);
			if (sum == 2 || sum == 3 || sum == 12)
			{
				System.out.println(lose);
			}
			else if (sum == 7 || sum == 11)
			{
				System.out.println(win);
			}
			//Else we set the first sum equal to the player's points and then roll until...
			else
			{
				int i = 0;
				int point = 0;
				point = sum;
				System.out.println("Your point is " + point);
				//while loop to roll until
				//The roll equals 7 and the player loses or 
				//till the roll equals the player's points and the player wins
				while (i < 1)
				{
					firDie = rollDice();
					secDie = rollDice();
					int newSum = firDie + secDie;
					System.out.println("You rolled " + firDie + " + " + secDie + " = " + newSum);
					if (newSum == 7)
					{
						System.out.println(lose);
						break;
					}
					else if (newSum == point)
					{
						System.out.println(win);
						break;
					}
				}
			}
			//Loop for the re-run feature if an invalid response is given
			for (int l = 0; l < 1; l++)
			{
				//Prompts for a re-run, then evaluates the response of the player 
				//Acts according to response of player
				System.out.print("\nWould you like to play again?(y for yes/n for no): ");
				String maybe = in.next();
				maybe.toLowerCase();
				if (maybe.equals("y"))
				{
					sum = firDie + secDie;
					z--;
				}
				else if (maybe.equals("n"))
				{
					System.exit(0);
				}
				else
				{
					System.out.println("Invalid answer! Enter y or n");
					l--;
				}
			}
		}
		
	}
	//Method that rolls the dice
	//Creates a random number generator between 1 and 7
	public static int rollDice()
	{
		int die = (int)(1 + Math.random() * 6);

		return die;
	}
}
