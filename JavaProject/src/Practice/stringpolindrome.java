package Practice;

public class stringpolindrome 
{

	 public static void main(String[] args) {
	        String text = "Abrakadabra!";
	        
	        // Extracting "ABRA"
	        String word = text.substring(0,4);
	        System.out.println(word); // Output: "ABRA"
	        
	        // Extracting "KA!"
	        String funPart = text.substring(4,6);
	        System.out.println(funPart); // Output: "KA!"
	        
	        // Extracting "DABRA!"
	        String learningPart = text.substring(6,11);
	        System.out.println(learningPart); // Output: "DABRA"

}
}


