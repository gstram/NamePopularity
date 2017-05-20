// Giuseppe Stramandinoli
// HW V

public class Child 
{
	// Initialize variables 
	String name;
	int numberRegistered;

	Child(String babyName, int numRegistered) 
	{ 
		name = babyName;
		numberRegistered = numRegistered;	
	} 
 
	public String getName()
	{
		return name;
	}
	
	public int getRegistered()
	{
		return numberRegistered;
	}
	
	public String toString() 
	{ 
		return ("Name: " + name + "  NumberRegistered: " + numberRegistered); 
	} 
}
