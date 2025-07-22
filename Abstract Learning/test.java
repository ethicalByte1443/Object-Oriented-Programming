abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class test {
    public static void main(String[] args) {
        // Animal a = new Animal(); // ❌ Error: Cannot instantiate abstract class
        Dog d = new Dog();
        d.sound();  // Output: Dog barks
        d.sleep();  // Output: Sleeping...
    }
}
