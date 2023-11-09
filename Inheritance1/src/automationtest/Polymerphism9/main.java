package automationtest.Polymerphism9;

import Polymerphism6.Bird;

public class main extends Animal{
    public class AnimalDemo {
        public static void main(String[] args) {
            Animal A = new Animal();
            Bird sparrow = new Bird();
            panthera lion = new panthera();

            System.out.println(" Animal:");
            A.move();
            A.makeSound();

            System.out.println("\nBird (Sparrow):");
            sparrow.sound();

            System.out.println("\nPanthera (Lion):");
            lion.move();
            lion.makeSound();
        }
    }



}
