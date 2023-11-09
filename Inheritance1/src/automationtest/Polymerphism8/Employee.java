package automationtest.Polymerphism8;

public class Employee {
    private String name;
    private int EmployeeId;
    private double salary;

    public Employee(String name, int EmployeeId){
        this.name=name;
        this.EmployeeId= EmployeeId;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayEmployeedetails(){
        System.out.println("Name:" + name);
        System.out.println("EmployeeId:" + EmployeeId);
        System.out.println("Salary:" + calculateSalary());
    }
}
