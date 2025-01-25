// Superclass
class Person {
    String name;
    int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

// Main class to test the system
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Alice", 101);
        Waiter waiter = new Waiter("Bob", 102);

        System.out.println("--- Chef Details ---");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\n--- Waiter Details ---");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
