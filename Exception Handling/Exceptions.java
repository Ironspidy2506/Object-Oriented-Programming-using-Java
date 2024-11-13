import java.util.*;

// Main class to demonstrate exception handling
public class Exceptions {
    public static void main(String[] args) {
        try {
            // Declare an integer variable 'a' and set its value to 10
            int a = 10;
            
            // Attempt to divide 'a' by 0, which will throw an ArithmeticException
            int b = a / 0;
            
        } catch (ArithmeticException ae) {
            // This block catches ArithmeticException (e.g., division by zero)
            // Prints the exception message to the console
            System.out.println(ae);
            
        } catch (Exception e) {
            // This block catches any other general exceptions not caught above
            // In this code, it won’t be executed because ArithmeticException is already caught
            System.out.println(e);
            
        } finally {
            // The 'finally' block always executes, regardless of whether an exception was thrown
            System.out.println("Always get Executed");
        }
    }
}
