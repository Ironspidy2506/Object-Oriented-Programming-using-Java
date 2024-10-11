package Encapsulation;

// The 'Person' class that encapsulates the properties of a person.
class Person {
    private String name; // Private field for the person's name.
    private int age; // Private field for the person's age.

    // Constructor to initialize the 'name' and 'age' fields.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'.
    public String getName() {
        return name; // Returns the person's name.
    }

    // Setter method for 'name'.
    public void setName(String name) {
        this.name = name; // Sets the person's name.
    }

    // Getter method for 'age'.
    public int getAge() {
        return age; // Returns the person's age.
    }

    // Setter method for 'age' with validation.
    public void setAge(int age) {
        if (age > 0) {
            this.age = age; // Sets the age if it's positive.
        } else {
            System.out.println("Age cannot be zero or negative"); // Error message for invalid age.
        }
    }
}

// Main class to demonstrate the encapsulation of the 'Person' class.
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of 'Person' with name and age.
        Person per = new Person("Priyanshu", 20);
        // Accessing and printing the age using the getter method.
        System.out.println(per.getAge()); // Output: 20
    }
}
