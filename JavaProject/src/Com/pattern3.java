package Com;

public class pattern3 
{

    public static void printPattern()
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 5; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print("12");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
      
        printPattern();
    }
}


