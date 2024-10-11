package Polymorphism.Static;

// This class demonstrates static polymorphism through method overloading.
public class Sum {

    // Method to sum two integers.
    public static int sum(int a, int b) {
        return a + b; // Returns the sum of 'a' and 'b'.
    }

    // Overloaded method to sum three integers.
    public static int sum(int a, int b, int c) {
        return a + b + c; // Returns the sum of 'a', 'b', and 'c'.
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        // Declaring and initializing variables.
        int a = 5;
        int b = 10;
        int c = 15;

        // Calling the method 'sum' with two arguments.
        System.out.println(sum(a, b)); // Output: 15

        // Calling the overloaded method 'sum' with three arguments.
        System.out.println(sum(a, b, c)); // Output: 30
    }
}
