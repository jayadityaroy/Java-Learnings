
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class InputFromUser{
    public static void main(String args[]){
        
        // Using System.in.read() to read input from the user
        // System.out.println("Enter your name: ");
        // int intput;
        // try {
        //     // Read a single byte from the input stream and store it's ascii value in intput variable
        //     intput = System.in.read(); // input: a 
        //     System.out.println("You entered: " + intput); // output: 97 (ascii value of 'a')
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // Using BufferedReader to read input from the user
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            // readLine() method reads a line of text from the input stream and returns it as a String. We then parse it to an integer using Integer.parseInt() method.
            System.out.println("Enter a number: ");
            int input = Integer.parseInt(br.readLine()); // input: 123
            System.out.println("You entered: " + input); // output: 123
        } catch (IOException e) {
            e.printStackTrace();
            try {
                isr.close(); // closing the InputStreamReader
                br.close(); // closing the BufferedReader
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        // Using Scanner class to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // input: 25
        System.out.println("Your age is: " + age); // output: 25
        sc.close(); // closing the Scanner
    }
}