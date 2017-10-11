/* Class:      CS 1301/17
 * Term:       Fall 2017
 * Instructor: Prof. Perry
 * Name:       Brandon Tedeschi
 * Lab:        7
 */
package lab_7;
import java.util.Scanner;
public class Practice_7_4 
{
	public static void main(String[] args)
	{
		//This program feels like a mess but this was the only way I came up with 
		//Create a counter for each letter
		int aCounter = 0, bCounter = 0,  cCounter = 0, dCounter = 0, eCounter = 0, fCounter = 0, gCounter = 0, hCounter = 0, iCounter = 0;
		int jCounter = 0, kCounter = 0, lCounter = 0, mCounter = 0, nCounter = 0, oCounter = 0, pCounter = 0, qCounter = 0, rCounter = 0;
		int sCounter = 0, tCounter = 0, uCounter = 0, vCounter = 0, wCounter = 0, xCounter = 0, yCounter = 0, zCounter = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string!: ");
		//Get input of a string and make another var to use the lowercase of the entered string
		String input = in.nextLine();
		String test = input.toLowerCase();
		//Char to use later when examining every char in the string
		char ch;
		System.out.println();
		System.out.println("Entered String: " + input);
		
		//For loop to go through every char in the string
		//Counts the number of each letter and stores them in the above counters
		for (int i = 0; i < input.length(); i++)
		{
			ch = test.charAt(i);
			if (ch == 'a')
			{
				aCounter++;
			}
			if (ch == 'b')
			{
				bCounter++;
			}
			if (ch == 'c')
			{
				cCounter++;
			}
			if (ch == 'd')
			{
				dCounter++;
			}
			if (ch == 'e')
			{
				eCounter++;
			}
			if (ch == 'f')
			{
				fCounter++;
			}
			if (ch == 'g')
			{
				gCounter++;
			}
			if (ch == 'h')
			{
				hCounter++;
			}
			if (ch == 'i')
			{
				iCounter++;
			}
			if (ch == 'j')
			{
				jCounter++;
			}
			if (ch == 'k')
			{
				kCounter++;
			}
			if (ch == 'l')
			{
				lCounter++;
			}
			if (ch == 'm')
			{
				mCounter++;
			}
			if (ch == 'n')
			{
				nCounter++;
			}
			if (ch == 'o')
			{
				oCounter++;
			}
			if (ch == 'p')
			{
				pCounter++;
			}
			if (ch == 'q')
			{
				qCounter++;
			}
			if (ch == 'r')
			{
				rCounter++;
			}
			if (ch == 's')
			{
				sCounter++;
			}
			if (ch == 't')
			{
				tCounter++;
			}
			if (ch == 'u')
			{
				uCounter++;
			}
			if (ch == 'v')
			{
				vCounter++;
			}
			if (ch == 'w')
			{
				wCounter++;
			}
			if (ch == 'x')
			{
				xCounter++;
			}
			if (ch == 'y')
			{
				yCounter++;
			}
			if (ch == 'z')
			{
				zCounter++;
			}
		}
		System.out.println();
		//These if statements pick which letters to output if they are contained in the string
		if(aCounter >= 1)
		{
			System.out.println("Letter A: " + aCounter);
		}
		if(bCounter >= 1)
		{
			System.out.println("Letter B: " + bCounter);
		}if(cCounter >= 1)
		{
			System.out.println("Letter C: " + aCounter);
		}if(dCounter >= 1)
		{
			System.out.println("Letter D: " + dCounter);
		}if(eCounter >= 1)
		{
			System.out.println("Letter E: " + eCounter);
		}if(fCounter >= 1)
		{
			System.out.println("Letter F: " + fCounter);
		}if(gCounter >= 1)
		{
			System.out.println("Letter G: " + gCounter);
		}if(hCounter >= 1)
		{
			System.out.println("Letter H: " + hCounter);
		}if(iCounter >= 1)
		{
			System.out.println("Letter I: " + iCounter);
		}if(jCounter >= 1)
		{
			System.out.println("Letter J: " + jCounter);
		}if(kCounter >= 1)
		{
			System.out.println("Letter K: " + kCounter);
		}if(lCounter >= 1)
		{
			System.out.println("Letter L: " + lCounter);
		}if(mCounter >= 1)
		{
			System.out.println("Letter M: " + mCounter);
		}if(nCounter >= 1)
		{
			System.out.println("Letter N: " + nCounter);
		}if(oCounter >= 1)
		{
			System.out.println("Letter O: " + oCounter);
		}if(pCounter >= 1)
		{
			System.out.println("Letter P: " + pCounter);
		}if(qCounter >= 1)
		{
			System.out.println("Letter Q: " + qCounter);
		}if(rCounter >= 1)
		{
			System.out.println("Letter R: " + rCounter);
		}if(sCounter >= 1)
		{
			System.out.println("Letter S: " + sCounter);
		}if(tCounter >= 1)
		{
			System.out.println("Letter T: " + tCounter);
		}if(uCounter >= 1)
		{
			System.out.println("Letter U: " + uCounter);
		}if(vCounter >= 1)
		{
			System.out.println("Letter V: " + vCounter);
		}if(wCounter >= 1)
		{
			System.out.println("Letter W: " + wCounter);
		}if(xCounter >= 1)
		{
			System.out.println("Letter X: " + xCounter);
		}if(yCounter >= 1)
		{
			System.out.println("Letter Y: " + yCounter);
		}if(zCounter >= 1)
		{
			System.out.println("Letter Z: " + zCounter);
		}
	}
}
