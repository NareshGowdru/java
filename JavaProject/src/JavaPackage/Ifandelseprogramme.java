 package JavaPackage;

public class Ifandelseprogramme  
{
  public static void main(String[] args)
  {
	  
	  long n1 =69;
	  long n2 =93;
	  long n3 =35;
	  System.out.println(n1>n2 && n2>=n1 && n2>=n3);
	  
	  if (n1>=n2 && n2>=n3) 
	  {
		  System.out.println(n1+"is the largest number.(n1)");
	   }
		  else if (n2>=n1 && n2>=n3)
	    {
		  System.out.println(n2+"is the largest number.(n2)");
	    }
		  else
		  {
			System.out.println(n3+"is the largest number.(n3)");
		  }
		 
			
		}
		
	 
	  
	  
	
  }


