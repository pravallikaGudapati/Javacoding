
public class SelectionSort 
{
	void sort(int a[])
	{
		int n= a.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			
		
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<a[min_index])
		
				min_index=j;
		
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
			
		}
		
		}
	}

	static void printarray(int a[])
	{
		int n= a.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i] +" ");
			System.out.println();
		}
	}
		
		//main method
		public static void main ( String args[])
		{
			int a[] = { 1,3,5,0,87,65,87,98,45,43,23,11};
			SelectionSort SS= new SelectionSort();
			SS.sort(a);
			System.out.println("sorted array is:");
			printarray(a);
			
		}
	
	
}


