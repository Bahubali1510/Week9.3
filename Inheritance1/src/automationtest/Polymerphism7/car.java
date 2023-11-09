package automationtest.Polymerphism7;

public class car extends Vehicle{
    public void speedUp(){
        super.speedUp();
        System.out.println("Speed of the car is " + super.getClass());

    }
}
