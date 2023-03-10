package farmyard.allAnimals;

public class Dog extends AbstractFarmAnimal {

    public Dog(int age, double weight, String name) {
        super(age, weight, name);
    }

    @Override
    public void doAction() {
        if (isHungry()) {
            System.out.println("This animal is hungry");
        } else {
           // System.out.printf("%n you played fetch with %s", getName());
            this.setHungry(true);
            System.out.println("you played fetch with " + this.getName());
        }
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes woof woof, pls give boner");
    }
}

