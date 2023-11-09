package automationtest.Polymerphism11;

public class person {

        // Private instance variables
        private String name;
        private int age;
        private String country;

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Setter method for age
        public void setAge(int age) {
            this.age = age;
        }

        // Getter method for country
        public String getCountry() {
            return country;
        }

        // Setter method for country
        public void setCountry(String country) {
            this.country = country;
        }

        public static void main(String[] args) {
            // Create a Person object
            person p1 = new person();

            // Set the person's information using the setter methods
            p1.setName("ALka");
            p1.setAge(30);
            p1.setCountry("UK");

            // Retrieve and print the person's information using the getter methods
            System.out.println("Name: " + p1.getName());
            System.out.println("Age: " + p1.getAge());
            System.out.println("Country: " + p1.getCountry());
        }
    }


