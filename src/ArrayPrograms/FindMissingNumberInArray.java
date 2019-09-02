package ArrayPrograms;

public class FindMissingNumberInArray
{
	//To Find Missing Number in Sorted and Unsorted Array
	//It Applies for both Sorted and Unsorted Array
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,7,8,9,10};
		
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1 = sum1 + arr[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int j=0;j<=10;j++)
		{
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		
		System.out.println("Missing Number is : " +(sum2-sum1));
	}
}
