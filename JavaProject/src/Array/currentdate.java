package Array;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentdate 
{
	public static void main(String[] args) {
		
	
	// Get the current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();

    // Define a date-time format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Format the current date and time
    String formattedDateTime = currentDateTime.format(formatter);

    // Print the current date and time stamp
    System.out.println("Current Date and Time: " + formattedDateTime);


}
}


