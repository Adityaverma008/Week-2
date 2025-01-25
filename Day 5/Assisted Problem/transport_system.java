class Vechile{
    int maxSpeed;
    String fuelType;

//     public Vechile(int maxSpeed, String fuelType) {
//             this.maxSpeed = maxSpeed;
//             this.fuelType = fuelType;
// }

    void displayDetail(int maxSpeed, String fuelType){              //it hold the every attribute of all vechile
        System.out.println("highest speed of vechile is:- " + maxSpeed + " " + "and it's fueltype is:- " + " " + fuelType);
    }
}

class Car extends Vechile{
    int seatCapacity = 4;
    void display(){
        System.out.println("The seatcapacity of car is:- " + seatCapacity);
    }
}

class Truck extends  Vechile{
    int seatCapacity = 2;
    void display(){
        System.out.println("The seatcapacity of truck is:- " + seatCapacity);
    }
}

class MotorCycle extends Vechile{
    int seatCapacity = 3;
    void display(){
        System.out.println("The seatcapacity of MotorCycle is:- " + seatCapacity);
    }
}


public class transport_system {
    public static void main(String[] args) {

        Vechile[] Vechiles = new Vechile[3];
        Vechiles[0] = new Car();
        Vechiles[1] = new Truck();
        Vechiles[2]  = new MotorCycle();

        
        for (int i = 0; i < 3; i++) {
            // Access each object and call its method
            Vechiles[i].displayDetail(100 * (i + 1), i % 2 == 0 ? "Diesel" : "Petrol"); // Just an example to show different speeds and fuel types
            // Call the specific display method for each type of vehicle
            if (Vechiles[i] instanceof Car) {
                ((Car) Vechiles[i]).display();
            } else if (Vechiles[i] instanceof Truck) {
                ((Truck) Vechiles[i]).display();
            } else if (Vechiles[i] instanceof MotorCycle) {
                ((MotorCycle) Vechiles[i]).display();
            }
        }
        // car.displayDetail(500, "Diesel");
        // truck.displayDetail(200, "Diesel");
        // motorcycle.displayDetail(600, "Petrol");
    }
}
