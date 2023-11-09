package automationtest.Inheritance2;

public class vehicle extends car{
public void m1(){
    System.out.println("This is child class" );
}

    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.drive();
    }
}
