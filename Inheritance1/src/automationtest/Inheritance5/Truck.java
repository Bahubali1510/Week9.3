package automationtest.Inheritance5;

public class Truck extends Vehicle{
    public Truck(String make, String model, int year, String fuelType){
    super( make, model, year, fuelType);
    }

    public double calculateDistanceTraveled(double time, double speed) {
        return time * speed;
    }
    public double getMaxSpeed() {
        return getMaxSpeed();
    }

}
