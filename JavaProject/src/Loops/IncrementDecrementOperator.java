package Loops;

public class IncrementDecrementOperator {

	public static void main(String[] args) 
	{
		int i=0;
	
		
	//	Pre - increment
		System.out.println(++i);
		
		// Post - Increment
	    System.out.println(i++);
		
		int a=15;
		int b=a++ + --a + a-- + ++a;
		System.out.println("Value of a : " + a + " Value of b : "+b);
		System.out.println("value of b :" + b +"value of a; " +a);

	}

}
