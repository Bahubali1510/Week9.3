package automationtest.Inheritance5;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public Vehicle() {

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0;
    }

    public double calculateDistanceTraveled(double time, double speed) {
        return time * speed;
    }

    public double getMaxSpeed() {
        return 0.0;

    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.calculateFuelEfficiency();

        double time = 2.5; // hours
        double speed = 60.0; // miles per hour

        double distanceTraveled = v1.calculateDistanceTraveled(time, speed);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
    }
    }



