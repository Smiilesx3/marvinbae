package farmyard.allAnimals;


import java.util.Random;

public class Chicken extends AbstractFarmAnimal {


    public Chicken(int age, double weight, String name) {
        super(age, weight, name);

    }

    @Override
    public void doAction() {

        if (isHungry()) {
            System.out.println("This animal is hungry");
        } else {
            Random random = new Random();
            int layedEggs = random.nextInt(10) + 1;
            System.out.println(this.getName() + " layed " + layedEggs + " eggs.");
            this.setHungry(true);
        }
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes cock cock *makes gay noises* 8===D");
    }
}
