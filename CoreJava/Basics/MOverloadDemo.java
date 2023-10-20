import java.lang.*;

class Car {
    String make;
    String model;
    int year;

    // Constructor 1: Takes make, model, year as parameters
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor 2: Takes make and model, sets year to default value 2023
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2023; // Default year
    }

    // Constructor 3: Takes no parameters, sets make, model, and year to default
    // values
    Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2023;
    }

    // Method to display car details
    public void display() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class MOverloadDemo {
    public static void main(String[] args) {
        // Create cars using different constructors
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car();

        // Display car details
        car1.display(); // Make: Toyota, Model: Camry, Year: 2020
        car2.display(); // Make: Honda, Model: Civic, Year: 2023
        car3.display(); // Make: Unknown, Model: Unknown, Year: 2023
    }
}
