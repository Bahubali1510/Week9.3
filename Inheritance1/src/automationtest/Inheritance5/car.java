package automationtest.Inheritance5;

public class car extends Vehicle{
    public car(String make, String model, int year, String fuelType){
        super( make, model, year, fuelType);
    }

    public car() {

    }

    public double calculateDistanceTraveled(double time, double speed) {
        return time * speed;
    }

    public double getMaxSpeed() {
        return getMaxSpeed();
    }

    public static void main(String[] args) {
        car c = new car();
        c.calculateFuelEfficiency();
    }
}
