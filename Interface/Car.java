package Interface;

// The 'Car' class implements multiple interfaces: 'Engine', 'Media', and 'Brake'.
public class Car implements Engine, Media, Brake {
    // Implementing the 'brake' method from the 'Brake' interface.
    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    // Implementing the 'start' method from the 'Engine' interface.
    @Override
    public void start() {
        System.out.println("I start engine like a normal Car");
    }

    // Implementing the 'stop' method from the 'Engine' interface.
    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car");
    }

    // Implementing the 'acc' method from the 'Engine' interface.
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }
}
