package Abstraction;

// The 'Dog' class extends the abstract 'Animal' class.
class Dog extends Animal {
    // Implementing the abstract method 'makeSound'.
    @Override
    void makeSound() {
        System.out.println("The dog says: bark bark"); // Specific sound for the dog.
    }
}
