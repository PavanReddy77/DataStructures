package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray
{
	public static void main(String[] args)
	{
		String names[] = {"Java", "Java", "C++", "CSharp", "Haskell", "Ruby", "Python", "C++"};
		
		//1st Approach - Worst Solution - Takes More Time
		//If there are 500 or More Elements Present in an Array
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("The Duplicate Element is ::: " +names[i]);
				}
			}
		}
		
		System.out.println("*******************************************");
		//2nd Approach - Takes Less time
		//Example of Time Complexity Where we can Reduce Time.
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("The Duplicate Element is ::: " +name);
			}
		}
	}
}
