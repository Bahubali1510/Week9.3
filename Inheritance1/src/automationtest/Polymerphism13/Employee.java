package automationtest.Polymerphism13;

public class Employee {

        private int employee_id;
        private String employee_name;
        private double employee_salary;

        // Constructor
        public Employee(int id, String name, double salary) {
            this.employee_id = id;
            this.employee_name = name;
            this.employee_salary = salary;
        }

        // Getter and Setter for employee_id
        public int getEmployeeId() {
            return employee_id;
        }

        public void setEmployeeId(int employee_id) {
            this.employee_id = employee_id;
        }

        // Getter and Setter for employee_name
        public String getEmployeeName() {
            return employee_name;
        }

        public void setEmployeeName(String employee_name) {
            this.employee_name = employee_name;
        }

        // Getter for employee_salary (formatted as a string)
        public String getFormattedEmployeeSalary() {
            return String.format("%.2f", employee_salary);
        }

        public double getEmployeeSalary() {
            return employee_salary;
        }

        public void setEmployeeSalary(double employee_salary) {
            this.employee_salary = employee_salary;
        }

        public static void main(String[] args) {
            // Create an Employee object
            Employee employee = new Employee(1, "Alka", 50000.0);

            // Access and modify the employee's information
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Employee Salary: $" + employee.getFormattedEmployeeSalary());

            employee.setEmployeeId(2);
            employee.setEmployeeName("Jane Smith");
            employee.setEmployeeSalary(60000.0);

            System.out.println("Updated Employee ID: " + employee.getEmployeeId());
            System.out.println("Updated Employee Name: " + employee.getEmployeeName());
            System.out.println("Updated Employee Salary: " + employee.getFormattedEmployeeSalary());
        }
    }


