package ArrayPrograms;

import java.util.Arrays;

public class SortingOneArrayElements 
{
	public static void main(String[] args) 
	{
		int array[] = {65, 23, 67, 12, 90};
		
		System.out.println("Given an Array Elements are :::" +Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("Sorted Array Elements in Ascending Order :::" +Arrays.toString(array));
		
		//Print Array Elements in Ascending Order One by One.
		for(int i=0; i<array.length; i++)
		{
			
			System.out.println("Sorted Array Elements in Ascending Order :::" +array[i]);
		}
	}
}
