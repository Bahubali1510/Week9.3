package automationtest.Polymerphism7;

public class bicycle extends Vehicle{
    public void speedUp(){
        super.speedUp();
        System.out.println("Speed of the bicycle is " + super.getClass() );

    }
}
