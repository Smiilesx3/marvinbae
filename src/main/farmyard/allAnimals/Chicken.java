package farmyard.allAnimals;


import java.util.Random;

public class Chicken extends AbstractFarmAnimal {


    public Chicken(int age, double weight, String name, String levelOfHungriness) {
        super(age, weight, name, levelOfHungriness);

    }

    @Override
    public void doAction() {
        Random random = new Random();
        int layedEggs = random.nextInt(10) + 1;
        System.out.println(this.getName() + " layed " + layedEggs + " eggs.");
    }


    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes cock cock *makes gay noises* 8===D");
    }
}
