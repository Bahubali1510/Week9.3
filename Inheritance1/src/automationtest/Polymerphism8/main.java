package automationtest.Polymerphism8;

public class main {
    public static void main(String[] args) {
        manager m1 = new manager("Alka", 101, 60000.0, 10000.0);
        programmer p1 = new programmer("Asha", 102, 25.0, 160);

        m1.displayEmployeedetails();
        System.out.println();

        p1.displayEmployeedetails();
    }
}
