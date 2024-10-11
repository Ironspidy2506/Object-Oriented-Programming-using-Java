package Interface;

// The 'NiceCar' class that uses an 'Engine' and a 'Media' player.
public class NiceCar {
    private Engine engine; // Engine type for the car.
    private Media player = new CDPlayer(); // Media player initialized as a CDPlayer.

    // Default constructor initializing with a PowerEngine.
    public NiceCar() {
        engine = new PowerEngine();
    }

    // Constructor that allows setting a custom engine.
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    // Method to start the engine.
    public void start() {
        engine.start();
    }

    // Method to stop the engine.
    public void stop() {
        engine.stop();
    }

    // Method to start the media player.
    public void startMusic() {
        player.start();
    }

    // Method to stop the media player.
    public void stopMusic() {
        player.stop();
    }

    // Method to upgrade the engine to an ElectricEngine.
    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
