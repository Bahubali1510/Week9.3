package automationtest.Test;


public class IfThenElse_Q3 {




        public boolean isTeen(int age) {
            if (age <= 18) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            return false;
        }

    public static void main(String[] args) {

            IfThenElse_Q3 obj1 = new IfThenElse_Q3();
            int age =18 ;
            System.out.println("is age teen?" + obj1.isTeen(age));

        }
    }


