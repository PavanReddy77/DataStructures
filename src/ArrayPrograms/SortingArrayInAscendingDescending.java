package ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInAscendingDescending
{
	public static void main(String[] args) 
	{
		String string[] = {"One", "Two", "Three", "Four", "Five"};
		
		System.out.println("-----Arrays Values Before Sorting-----");
		for(String stringValues : string)
		{
			System.out.println(stringValues);
		}
		
		Arrays.sort(string);
		
		System.out.println("-----After Sorting in Ascending Order-----");
		for(String stringValues : string)
		{
			System.out.println(stringValues);
		}
		
		Arrays.sort(string, Collections.reverseOrder());
		
		System.out.println("-----After Sorting in Descending Order-----");
		for(String stringValues : string)
		{
			System.out.println(stringValues);
		}
	}
}
