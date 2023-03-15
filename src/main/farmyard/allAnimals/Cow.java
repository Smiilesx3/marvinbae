package farmyard.allAnimals;

import java.util.Random;

public class Cow extends AbstractFarmAnimal {


    public Cow(int age, double weight, String name, String levelOfHungriness) {
        super(age, weight, name, levelOfHungriness);
    }

    @Override
    public void doAction() {
        Random random = new Random();
        int givenMilk = random.nextInt(10) + 1;
        System.out.println(this.getName() + " gave " + givenMilk + " litres milk.");
    }


    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes moo moo");
    }
}
