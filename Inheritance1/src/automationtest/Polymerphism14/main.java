package automationtest.Polymerphism14;

public class main {
    public class Main {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.setCompany_name("Toyota");
            myCar.setModel_name("Camry");
            myCar.setYear(2020);
            myCar.mileage = 50000;  // You cannot directly set mileage because it's private

            System.out.println("Company: " + myCar.getCompany_name());
            System.out.println("Model: " + myCar.getModel_name());
            System.out.println("Year: " + myCar.getYear());
            System.out.println("Mileage: " + myCar.getMileage());
        }
    }

}
