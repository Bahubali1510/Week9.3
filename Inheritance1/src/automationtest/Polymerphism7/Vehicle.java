package automationtest.Polymerphism7;

public class Vehicle {
    private int speed;

    public Vehicle(){
        this.speed=0;
    }
    public void speedUp(){
        speed +=5;
        System.out.println("What is speed of vehicle" + speed+ "units");
    }
}
