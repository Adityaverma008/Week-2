// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging its battery.");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

// Main class to test the system
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180);

        System.out.println("--- Electric Vehicle Details ---");
        ev.displayDetails();
        ev.charge();

        System.out.println("\n--- Petrol Vehicle Details ---");
        pv.displayDetails();
        pv.refuel();
    }
}
