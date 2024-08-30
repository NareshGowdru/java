package Polindrom;

public class p1 
{
	package Polindrom;

	public class PalindromeCheck {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			 String inputString = "MALAYALAM";
		        
		        if (isPalindrome(inputString)) {
		            System.out.println("\"" + inputString + "\" is a palindrome.");
		        } else {
		            System.out.println("\"" + inputString + "\" is not a palindrome.");
		        }
		    }

		    public static boolean isPalindrome(String str) {
		        // Normalize the string by converting it to lowercase
		        String normalizedStr = str.toLowerCase();
		        // Create a StringBuilder to reverse the normalized string
		        StringBuilder reversedStr = new StringBuilder(normalizedStr).reverse();
		        // Check if the normalized string is equal to its reverse
		        return normalizedStr.equals(reversedStr.toString());


		}

	}

}
