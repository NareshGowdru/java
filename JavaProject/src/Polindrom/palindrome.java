package Polindrom;

public class palindrome
{
	public static void main(String[] args) {
		
	}
	int m,sum=0,temp;
	int n=767;
	temp=n;
	while(n>0) {
		m=n%10;
		sum=(sum*10)+m;
		n=n/10;
	}
	if(temp==sum)
		system.out.println("palindrome number");
	else
		system.out.println("not polindrome");
	}

}
