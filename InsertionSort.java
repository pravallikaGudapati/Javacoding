import java.lang.reflect.Array;

//java program for implementation of Insertion sort
public class InsertionSort {
	
	//function to sort array using Insertion sort
	
	void sort(int array[])
	{
		int n= array.length;
		for (int i=0;i<n;i++)
		{
			int key=array[i];
			int j= i-1;
			
			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
				
			}
				
			array[j+1]=key;
		}
			
		
	}

	//A utility function to print the size of the array
	 static void printarray(int array[])
	 {
		 int n=array.length;
		 for(int i=0;i<n;i++)
		 
			 System.out.println(array[i] +" ");
		 
	 }
		 //main method
		 
		 public static void main(String args[])
		 {
			 int array[]= { 12, 14, 65, 2, 5, 8, 8, 9,5,76,32};
			 InsertionSort IS = new InsertionSort();
			 IS.sort(array);
			 printarray(array);
		 }
		 
			 
		 
	 }

