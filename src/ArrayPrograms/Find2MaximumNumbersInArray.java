package ArrayPrograms;

public class Find2MaximumNumbersInArray 
{
	public static void printTwoMaximumNumbers(int numbers[])
	{
		int maxOne = 0;
		int maxTwo = 0;
		
		for(int number : numbers)
		{
			if(maxOne < number)
			{
				maxTwo = maxOne;
				maxOne = number;
			}
			else if(maxTwo < number)
			{
				maxTwo =  number;
			}
		}
		System.out.println("First Maximum Number is ::: " +maxOne);
		System.out.println("Second Maximum Number is ::: " +maxTwo);
	}
	public static void main(String[] args) 
	{
		int numbers[] = {3, 9, 12, 99, 78, 45, 123};
		printTwoMaximumNumbers(numbers);
	}
}
