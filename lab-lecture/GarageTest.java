// Superclass
class Car {
    public void drive() {
        System.out.println("Car is driving...");
    }
}

// Subclass 1
class HondaCity extends Car {
    @Override
    public void drive() {
        System.out.println("Honda City drives smoothly on highways!");
    }
}

// Subclass 2
class ToyotaCorolla extends Car {
    @Override
    public void drive() {
        System.out.println("Toyota Corolla drives comfortably in the city!");
    }
}

// Garage class
class Garage {
    // Garage accepts any Car
    public void park(Car car) {
        System.out.println("Parking the car in the garage...");
        car.drive(); // Dynamic behavior based on actual car type
    }
}

// Main class
public class GarageTest {
    public static void main(String[] args) {
        // Create specific car instances
        Car myHonda = new HondaCity();   // superclass reference -> subclass object
        Car myToyota = new ToyotaCorolla();

        // Create Garage
        Garage myGarage = new Garage();

        // Park the cars
        myGarage.park(myHonda);    // Output based on HondaCity's drive
        myGarage.park(myToyota);   // Output based on ToyotaCorolla's drive
    }
}