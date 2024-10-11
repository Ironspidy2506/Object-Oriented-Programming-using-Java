package Polymorphism.Dynamic;

// 'Cat' class extends the 'Animal' class.
public class Cat extends Animal {
    // Overriding the 'sound' method to provide a specific implementation for 'Cat'.
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
