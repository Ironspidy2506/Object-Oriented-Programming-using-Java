package Polymorphism.Dynamic;

// This is the main class that executes the program.
public class Main {
    public static void main(String[] args) {
        // Creating an object of 'Dog' and assigning it to 'Animal' reference.
        Animal myAnimal = new Dog();
        // Calling the 'sound' method, which executes the 'Dog' class's implementation.
        myAnimal.sound();

        // Reassigning 'myAnimal' to a new 'Cat' object.
        myAnimal = new Cat();
        // Calling the 'sound' method, which now executes the 'Cat' class's
        // implementation.
        myAnimal.sound();
    }
}
