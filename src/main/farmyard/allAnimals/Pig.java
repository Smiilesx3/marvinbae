package farmyard.allAnimals;

public class Pig extends AbstractFarmAnimal {

    public Pig(int age, double weight, String name, String levelOfHungriness) {
        super(age, weight, name, levelOfHungriness);
    }

    @Override
    public void doAction() {
        System.out.println(this.getName() + " just took a nap");
    }


    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes oink oink");
    }
}

