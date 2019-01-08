
public class QuickSort 
{
	
	//funnction to partition the given array
	int partition (int a[], int low, int high)
	
	{
		int pivot=a[high];
		int i=(low-1);
		
		for(int j=low; j<high; j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
			int temp=a[i+1];
			a[i+1]=a[high];
			a[high]=temp;
		
				
		return i+1;
		
	}

	//function implementing quicksort
	void sort(int a[] ,int low ,int high)
	
	{
		if(low < high)
		{
			int pi = partition(a,low,high);
		
		sort(a,low,pi-1);
		sort(a,pi+1,high);
		}
	}


static void printarray(int a[])
{
	int n= a.length;
	for(int i=0; i<n; i++)
	{
		System.out.println(a[i] +"");
	}
}
	
//main method
	
	public static void main (String args[])
	{
	int a[] ={1, 4, 6, 70, 65, 87, 45, 67, 76, 34};
	int n = a.length;
	QuickSort QS= new QuickSort();
	QS.sort(a, 0, n-1);
	System.out.println("the sorted array is");
	printarray(a);
	
	}
}
