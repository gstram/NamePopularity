// Giuseppe Stramandinoli
// HW V

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class NameFinder 
{	
	//Initialize Array 
	ArrayList<Child> boyNameDatabase = new ArrayList<Child>(1100); 
	ArrayList<Child> girlNameDatabase = new ArrayList<Child>(1100); 
	String babyName;
	
	NameFinder(String userbabyName)
	{ 
		babyName = userbabyName;
	} 
	
	public void getGirlRanking()
	{
		try 
		{ 			
			//Initialize scanner to read file 
			Scanner inputStream = new Scanner(new File("girlnames.txt"));
				
			// Add all girl names to array
			while(inputStream.hasNext())
			{
				girlNameDatabase.add(new Child(inputStream.next(), inputStream.nextInt()));
			}
				
			inputStream.close(); 
		} 
		catch(FileNotFoundException e) 
		{ 
			System.out.println("Error opening files"); 
			System.exit(0); 
		}
			
		// Search database for girl baby name entered and output rank
		for(int counter = 1; counter < girlNameDatabase.size(); counter++)
		{
			if(girlNameDatabase.get(counter-1).getName().equals(babyName))
			{
				System.out.println(girlNameDatabase.get(counter-1).getName() + " is ranked '" + (counter)
						+ "' in popularity among girls with " + girlNameDatabase.get(counter-1).getRegistered()
						+ " namings.");
				break;
			}
			else if(counter == (girlNameDatabase.size()-1))
			{
				if(girlNameDatabase.get(counter).getName().equals(babyName))
				{
						
				}
				else 
				{
					System.out.println(babyName + " is not ranked among the top 1000 girl names. ");
				}
			}
		}
	}
	
	public void getBoyRanking()
	{
		try 
		{ 
			//Initialize scanner to read file 
			Scanner inputStream = new Scanner(new File("boynames.txt")); 

			// Add all boy names to an array
			while(inputStream.hasNext())
			{
				boyNameDatabase.add(new Child(inputStream.next(), inputStream.nextInt()));
			}
			inputStream.close(); 
		} 
		catch(FileNotFoundException e) 
		{ 
			System.out.println("Error opening files"); 
			System.exit(0); 
		}
	
	
		// Search database for boy baby name entered and output rank
		for(int counter = 1; counter < boyNameDatabase.size(); counter++)
		{
			if(boyNameDatabase.get(counter-1).getName().equals(babyName))
			{
				System.out.println(boyNameDatabase.get(counter-1).getName() + " is ranked '" + (counter)
						+ "' in popularity among boys with " + boyNameDatabase.get(counter-1).getRegistered()
						+ " namings.");
				break;
			}	
			else if(counter == (boyNameDatabase.size()-1))
			{
				if(boyNameDatabase.get(counter).getName().equals(babyName))
				{
						
				}
				else 
				{
					System.out.println(babyName + " is not ranked among the top 1000 boy names. ");
				}
			}
		}
	}
}
