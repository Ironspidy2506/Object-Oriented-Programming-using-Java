package Interface;

// The 'ElectricEngine' class implements the 'Engine' interface.
public class ElectricEngine implements Engine {
    // Implementing the 'start' method from the 'Engine' interface.
    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    // Implementing the 'stop' method from the 'Engine' interface.
    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    // Implementing the 'acc' method from the 'Engine' interface.
    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}
