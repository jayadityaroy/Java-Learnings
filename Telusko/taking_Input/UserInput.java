package Telusko.taking_Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
    public static void main(String args[]){
        System.out.println("Enter your name: ");
        // Using System.in.read() to read input from the user
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
            int input = Integer.parseInt(br.readLine()); // input: 123
            System.out.println("You entered: " + input); // output: 123
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}