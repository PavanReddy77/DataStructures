package SearchPrograms;

public class BinarySearch 
{ 
	//Time Complexity : O(Log n).
	
	//Returns Index of X, if it is Present in array[l..r], else return -1.
	public static int binarySearch(int array[], int left, int right, int x) 
	{ 
		if (right >= left) 
		{ 
			int middle = (left + right) / 2;
			
			//If the Element is Present at the Middle Itself.
			if (array[middle] == x) 
				return middle; 

			//If Element is Smaller than Middle, then It can only be Present in Left Sub Array.
			if (array[middle] > x) 
				return binarySearch(array, left, middle - 1, x); 

			//Else the Element can only be Present in Right Sub Array. 
			return binarySearch(array, middle + 1, right, x); 
		} 
		//We reach here when Element is not Present in Array. 
		return -1; 
	} 
 
	public static void main(String args[]) 
	{ 
		int array[] = {2, 3, 4, 10, 40}; 
		int n = array.length; 
		int x = 10; 
		int result = binarySearch(array, 0, n, x); 
		if (result == -1)
		{
			System.out.println("Element is not Present in Array : " +result);
		}
		else
		{
			System.out.println("Element is Present at Index : " +result);
		}
	} 
} 
