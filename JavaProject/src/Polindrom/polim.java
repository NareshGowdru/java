package Polindrom;

import java.util.Scanner;

public class polim
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i<str.length()/2;i++);
		{
			int i;
			if(str.charAt(i) !=
					str.charAt(str.length()-1-
							))
			{
				System.out.println("Not palindrome");
				return;
			}
		
		
		}
		System.out.println("palindrome");
		
	}
		
	

}
