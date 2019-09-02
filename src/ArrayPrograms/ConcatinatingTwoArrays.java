package ArrayPrograms;

import java.util.Arrays;

public class ConcatinatingTwoArrays 
{
	//Function to Merge Array in Sorted Order
	public static void sortedArray(int array1[], int array2[], int result[], int n, int m)
	{
		//Sorting Array1 and Array2
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//Merge 2 Sorted Arrays into Result[].
		int i=0, j=0, k=0;
		while(i<n && j<m)
		{
			if(array1[i] <= array2[j])
			{
				result[k] = array1[i];
				i += 1;
				k += 1;
			}
			else
			{
				result[k] = array2[j];
				j += 1;
				k += 1;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int array1[] = {40,10, 5, 15};
		int array2[] = {20, 3, 2, 12};
		
		int n = array1.length;
		int m =array2.length;
		
		//Final Merge List
		int result[] = new int[n + m];
		sortedArray(array1, array2, result, n, m);
		
		System.out.println("Sorted Merged List is :::");
		for(int i=0; i<n+m; i++)
		{
			System.out.println(result[i]);
		}
	}
}
