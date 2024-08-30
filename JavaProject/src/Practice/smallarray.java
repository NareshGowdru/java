package Practice;

import java.util.function.BiFunction;

public class smallarray
{
	public static void main(String[] args)
	{
	int arr[] = {12,30,45,78,97};
	int min =arr[0];//12
	int max =arr[0];//97
	for(int i = 0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{min=arr [i];
	}
		if(arr[i]>max)
		{max = arr [i];
			
		}
					
		}
	System.out.print("smallest "  +  min  +  " largest " + max);
	}
}

	
	
		  
	


