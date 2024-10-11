package Inheritance;

// The 'Child' class extends the 'Parent' class.
public class Child extends Parent {
    public static void main(String[] args) {
        // Creating an instance of 'Child'.
        Child child = new Child();
        // Calling the 'message' method from the 'Parent' class.
        child.message();

        // Accessing and printing the 'ageParent' variable from the 'Parent' class.
        System.out.print(child.ageParent);
    }
}
