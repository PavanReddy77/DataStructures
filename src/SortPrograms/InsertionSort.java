package SortPrograms;

public class InsertionSort
{  
	//Logic:
	//Take One By One Value from Unsorted Array.
	//Insert into Sorted Array in Ascending Order.
	
	public static void insertionSort(int array[]) 
    {  
        int arrayLength= array.length;
        
        for(int i=1; i<arrayLength; i++) 
        {  
        	int key = array[i];  
            int j = i-1;  
            while((j>-1) && (array[j]>key)) 
            {  
                array[j+1] = array[j];  
                j--;  
            }  
            array[j+1] = key;  
        }  
    }  
       
    public static void main(String args[])
    {    
        int array[] = {9,14,3,2,43,11,58,22};
        
        System.out.println("Before Sorting Array");    
        for(int arrayValues : array)
        {    
            System.out.print(arrayValues + " ");    
        }    
        System.out.println();    
            
        //Sorting Array using Insertion Sort.
        insertionSort(array);    
           
        System.out.println("After Sorting Array");    
        for(int arrayValues : array)
        {    
            System.out.print(arrayValues + " ");    
        }    
    }    
}    
