package ArrayPrograms;

import java.util.Arrays;

public class SecondLargestNumberInArray 
{
	//Logic >> Sort an Given Array and then Find Second Largest Number using Array Length.
	public static void main(String[] args) 
	{
		int array[] = {45, 56, 12, 5, 2, 78};
		
		Arrays.sort(array);
		
		System.out.println("The First Largest Number in Given Array ::: " +array[array.length-1]);
		System.out.println("The Second Largest Number in Given Array ::: " +array[array.length-2]);
	}
}
