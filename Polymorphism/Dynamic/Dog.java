package Polymorphism.Dynamic;

// 'Dog' class extends the 'Animal' class.
public class Dog extends Animal {
    // Overriding the 'sound' method to provide a specific implementation for 'Dog'.
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
