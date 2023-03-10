package farmyard.allAnimals;

public class Pig extends AbstractFarmAnimal {

    public Pig(int age, double weight, String name) {
        super(age, weight, name);
    }

    @Override
    public void doAction() {
        if (isHungry()) {
            System.out.println("This animal is hungry");
        } else {
            this.setHungry(true);
            //System.out.printf("%s just took a nap", getName());
            System.out.println(this.getName() + " just took a nap");
        }
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes oink oink");
    }
}

