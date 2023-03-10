package farmyard.allAnimals;

import java.util.Random;

public class Cow extends AbstractFarmAnimal {


    public Cow(int age, double weight, String name) {
        super(age, weight, name);
    }

    @Override
    public void doAction() {
        if (isHungry()) {
            System.out.println("This animal is hungry");
        } else {
            Random random = new Random();
            int givenMilk = random.nextInt(10) + 1;
            System.out.println(this.getName() + " gave " + givenMilk + " litres milk.");
            this.setHungry(true);
        }
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes moo moo");
    }
}
