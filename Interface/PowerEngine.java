package Interface;

// The 'PowerEngine' class implements the 'Engine' interface.
public class PowerEngine implements Engine {
    // Implementing the 'start' method from the 'Engine' interface.
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    // Implementing the 'stop' method from the 'Engine' interface.
    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    // Implementing the 'acc' method from the 'Engine' interface.
    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
