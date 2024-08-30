package Scan;

import java.util.Scanner;

public class lefttriangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 
        //Taking rows value from the user
 
     System.out.println("6");
 
        int rows = sc.nextInt();
 
        System.out.println("12121212");
 
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 
        
 
        sc.close();
	}

}
