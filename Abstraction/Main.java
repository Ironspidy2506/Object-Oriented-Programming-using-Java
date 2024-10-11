package Abstraction;

// Main class to demonstrate abstraction.
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating an instance of Dog
        myDog.makeSound(); // Calling the implemented method
        myDog.sleep(); // Calling the inherited method

        Animal myCat = new Cat(); // Creating an instance of Cat
        myCat.makeSound(); // Calling the implemented method for Cat
        myCat.sleep(); // Calling the inherited method
    }
}
