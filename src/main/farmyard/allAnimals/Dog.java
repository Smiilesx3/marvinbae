package farmyard.allAnimals;

public class Dog extends AbstractFarmAnimal {

    public Dog(int age, double weight, String name, String levelOfHungriness) {
        super(age, weight, name, levelOfHungriness);
    }

    @Override
    public void doAction() {
        System.out.println("you played fetch with " + this.getName());
    }


    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes woof woof, pls give boner");
    }
}

