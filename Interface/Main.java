package Interface;

// The main class to execute the program.
public class Main {
    public static void main(String[] args) {
        // Creating an instance of 'Car'.
        Car car = new Car();
        // Calling methods to demonstrate functionality.
        car.start(); // Start the car's engine.
        car.acc(); // Accelerate the car.
        car.stop(); // Stop the car's engine.
        car.brake(); // Apply brakes.

        // Additional code is commented out for potential future use.
        // car.starteng();

        // NiceCar car = new NiceCar();

        // car.start();
        // car.startMusic();
        // car.upgradeEngine();
        // car.start();
    }
}
