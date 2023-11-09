package automationtest.Polymerphism8;

public class programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        // Programmer's salary is calculated based on the hourly rate and hours worked
        return hourlyRate * hoursWorked;
    }
}
