package automationtest.Test;

public class ForLoop_Q4 {
    String name;
    int howManyTime;
public void printMyName() {
    for (int i=0; i < howManyTime; i++) ;
    {
        System.out.println(name);
    }
}

    public static void main(String[] args) {
        ForLoop_Q4 obj1 = new ForLoop_Q4();
        obj1.name = "Alka";
        obj1.howManyTime = 10;
        obj1.printMyName();
    }

}

