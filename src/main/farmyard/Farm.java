package farmyard;

import farmyard.Shed.ChickenShed;
import farmyard.Shed.CowShed;
import farmyard.Shed.DogShed;
import farmyard.Shed.PigShed;
import farmyard.allAnimals.*;

public class Farm {

    private final ChickenShed chickenShed = new ChickenShed();
    private final CowShed cowShed = new CowShed();

    private final DogShed dogShed = new DogShed();

    private final PigShed pigShed = new PigShed();


    public Farm() {

    }

    public void addTestAnimal() {
        Chicken chicken1 = new Chicken(13, 11, "Henriette", LevelOfHungriness.SATURATED.getHungriness());
        chickenShed.addChicken(chicken1);
        Cow cow1 = new Cow(8, 230, "Paula", LevelOfHungriness.SATURATED.getHungriness());
        cowShed.addCow(cow1);
        Dog dog1 = new Dog(32, 14, "Rufus", LevelOfHungriness.SATURATED.getHungriness());
        dogShed.addDog(dog1);
        Pig pig1 = new Pig(42, 150, "Piggy", LevelOfHungriness.SATURATED.getHungriness());
        pigShed.addPig(pig1);

    }

    public void giveAnimalList() {
        chickenShed.getAnimalList();
        cowShed.getAnimalList();
        dogShed.getAnimalList();
        pigShed.getAnimalList();
    }

    public void countAnimals() {
        System.out.println("There are this much chicken in the shed: ");
        chickenShed.countAnimals();
        System.out.println("There are this much cows in the shed: ");
        cowShed.countAnimals();
        System.out.println("There are this much dogs in the shed: ");
        dogShed.countAnimals();
        System.out.println("There are this much pigs in the shed: ");
        pigShed.countAnimals();
    }

    // add animals sorted by subclass/type of animal
    public void addAnimal(AbstractFarmAnimal farmAnimal) {
        if (farmAnimal instanceof Chicken chicken) {
            chickenShed.addChicken(chicken);
        } else if (farmAnimal instanceof Cow cow) {
            cowShed.addCow(cow);
        } else if (farmAnimal instanceof Dog dog) {
            dogShed.addDog(dog);
        } else if (farmAnimal instanceof Pig pig) {
            pigShed.addPig(pig);
        } else {
            System.out.println("This animal has no shed");
        }
    }


    public void feedAnimals() {
        chickenShed.feedAnimals();
        cowShed.feedAnimals();
        dogShed.feedAnimals();
        pigShed.feedAnimals();
    }

    public void actionAnimals() {
        chickenShed.chickenAction();
        cowShed.cowAction();
        dogShed.dogAction();
        pigShed.pigAction();
    }


    public void actionSound() {
        chickenShed.actionSound();
        cowShed.actionSound();
        dogShed.actionSound();
        pigShed.actionSound();


    }
}


