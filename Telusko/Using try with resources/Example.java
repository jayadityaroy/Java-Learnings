// try can be used with resources that implement the 
// AutoCloseable interface (which includes all objects that implement the Closeable interface). 
// The try-with-resources statement ensures that each resource is closed at the end of the statement.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Example{
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        // try with finally block to ensure that the BufferedReader is closed after use:
        // try{
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     System.out.println("Enter a string: ");
        //     String str = br.readLine();
        //     System.out.println("You entered: " + str);
        // } 
        // catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     // Closing the BufferedReader in the finally block to ensure it is closed 
        //     // even if an exception occurs
        //     try {
        //         if (br != null) {
        //             br.close();
        //         }
        //     } catch (Exception e) {
        //         e.printStackTrace();
        //     }
        // }

        // try-with-resources statement to automatically close the BufferedReader (auto-closeable resource)
        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter another string: ");
            String str2 = br2.readLine();
            System.out.println("You entered: " + str2);
        }
        
    }
}