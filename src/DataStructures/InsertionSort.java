package DataStructures;

public class InsertionSort
{  
	public static void insertionSort(int array[]) 
    {  
        int arrayLength= array.length;
        
        for(int i = 1; i < arrayLength; i++) 
        {  
        	int key = array[i];  
            int j = i-1;  
            while((j > -1) && ( array [j] > key )) 
            {  
                array [j+1] = array [j];  
                j--;  
            }  
            array[j+1] = key;  
        }  
    }  
       
    public static void main(String args[])
    {    
        int[] array1 = {9,14,3,2,43,11,58,22};
        
        System.out.println("Before Insertion Sort");    
        for(int i : array1)
        {    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(array1); //Sorting Array using Insertion Sort.   
           
        System.out.println("After Insertion Sort");    
        for(int i : array1)
        {    
            System.out.print(i+" ");    
        }    
    }    
}    
