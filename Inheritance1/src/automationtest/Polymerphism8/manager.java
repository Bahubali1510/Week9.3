package automationtest.Polymerphism8;

public class manager extends Employee {
    private double baseSalary;
    private double bonus;

    public manager (String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    public double calculateSalary() {
        // Manager's salary is the sum of base salary and bonus
        return baseSalary + bonus;
    }
}
