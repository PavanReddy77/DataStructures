package ArrayPrograms;

import java.util.Arrays;

public class FindLargestNumberInArray
{
	public static void main(String[] args) 
	{
		int numbers[] = {-10, 24, -50, -88, 939432};
		
		int largest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
		}
		System.out.println("Given Array is ::: " +Arrays.toString(numbers));
		System.out.println("Largest Number is ::: " +largest);
	}
}
