package Inheritance;

// The 'Vehicle' class representing a generic vehicle.
class Vehicle {
    int maxSpeed; // Variable to store the maximum speed.

    // Constructor to initialize 'maxSpeed'.
    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Method to display the maximum speed of the vehicle.
    void display() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// The 'Car' class extends the 'Vehicle' class.
class Car extends Vehicle {
    String brand; // Variable to store the brand of the car.

    // Constructor to initialize 'brand' and 'maxSpeed' using the parent
    // constructor.
    Car(String brand, int maxSpeed) {
        super(maxSpeed); // Calling the constructor of 'Vehicle'.
        this.brand = brand;
    }

    // Overriding the 'display' method to show car details.
    void display() {
        super.display(); // Calling the display method of 'Vehicle'.
        System.out.println("Brand: " + brand); // Displaying the brand.
    }
}

// The main class to demonstrate the functionality of the 'Car' class.
public class Super {
    public static void main(String[] args) {
        // Creating an instance of 'Car' with brand and max speed.
        Car car = new Car("Toyota", 180);
        // Calling the 'display' method to show car details.
        car.display();
    }
}
