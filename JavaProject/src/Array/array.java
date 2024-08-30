package Array;

public class array 
{
	public static void main(String[] args) 
	{
		
	
	//int[] arr= {1,2,2,4,5};
	//String[] arri= {"Naresh","vishnu","hi"};
	
	int[] naresh =new int[4];
	String[] naresh1 =new String[7];
	naresh[0]=7;
	naresh[1]=6;
	naresh[2]=2;
	naresh[3]=4;
	 System.out.println(naresh.length);
	 for(int i=0;i<naresh.length;i++) 
	 {
		 if(naresh[i]%2==0) 
		 
		 System.out.print(naresh[i]+" ");
	 }
	}
}
