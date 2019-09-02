package ArrayPrograms;

import java.util.Arrays;

public class FindSmallestNumberInArray
{
	public static void main(String[] args) 
	{
		int numbers[] = {-10, 24, -50, -98, 939432};
		
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
		}
		System.out.println("Given Array is ::: " +Arrays.toString(numbers));
		System.out.println("Smallest Number is ::: " +smallest);
	}
}
