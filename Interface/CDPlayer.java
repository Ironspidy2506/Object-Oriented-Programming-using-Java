package Interface;

// The 'CDPlayer' class implements the 'Media' interface.
public class CDPlayer implements Media {
    // Implementing the 'start' method from the 'Media' interface.
    @Override
    public void start() {
        System.out.println("Music start");
    }

    // Implementing the 'stop' method from the 'Media' interface.
    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
