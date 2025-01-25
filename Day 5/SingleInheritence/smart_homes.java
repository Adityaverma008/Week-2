// package SingleInheritence;

class Devices{              //parents class
    int deviceId;
    String status;

    public Devices(int deviceId , String status) {      //constructor for deives class
        this.deviceId = deviceId;
        this.status = status;
    }
}

class thermostat extends Devices{             //child class 
    String temperatureSetting;

    public thermostat(int deviceId , String status , String temperatureSetting ){       //constructor for thermostat class
        super(deviceId , status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayInfo(){              //funtion to display everything 
        System.out.println("The displayid is:- " + " " + deviceId + " " + "and the device status is:- " + " " + status + " " + "and the temperaturesetting is :- " + " " + temperatureSetting );
    }

}



public class smart_homes {
    public static void main(String[] args) {
        thermostat obj = new thermostat(20, "Working", "No changes in setting needed");
        obj.displayInfo();
    }
}
