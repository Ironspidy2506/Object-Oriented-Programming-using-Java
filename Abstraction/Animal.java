package Abstraction;

// Abstract class 'Animal' representing a generic animal.
abstract class Animal {
    // Abstract method that must be implemented by subclasses.
    abstract void makeSound();

    // Concrete method that provides a common behavior for all animals.
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
