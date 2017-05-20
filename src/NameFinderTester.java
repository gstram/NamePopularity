// Giuseppe Stramandinoli
// HW V
import java.util.Scanner;

public class NameFinderTester
{
	public static void main(String[] args) 
	{
		// Initialize Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Ask user for a name
		System.out.println("Enter a Name: ");
		String babyName = keyboard.next();
		NameFinder babyName1 = new NameFinder(babyName);
		babyName1.getBoyRanking();
		babyName1.getGirlRanking();
	}
}
