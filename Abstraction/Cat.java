package Abstraction;

// The 'Cat' class extends the abstract 'Animal' class.
class Cat extends Animal {
    // Implementing the abstract method 'makeSound'.
    @Override
    void makeSound() {
        System.out.println("The cat says: meow meow"); // Specific sound for the cat.
    }
}
