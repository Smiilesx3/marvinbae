package farmyard.Shed;

import farmyard.allAnimals.Dog;
import farmyard.allAnimals.LevelOfHungriness;

import java.util.ArrayList;
import java.util.List;

public class DogShed implements Shed {

    List<Dog> dogList = new ArrayList<>();

    //add dog to list
    public void addDog(Dog dog) {
        dogList.add(dog);
    }


    //play with dog and dog gets hungry
    public void dogAction() {
        for (Dog dog : dogList) {
            if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.OVEREAT.getHungriness())) {
                dog.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                dog.doAction();
            } else if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.SATURATED.getHungriness())) {
                dog.setLevelOfHungriness(LevelOfHungriness.HUNGRY.getHungriness());
                dog.doAction();
            } else if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.HUNGRY.getHungriness())) {
                System.out.println(dog.getName() + " can't do its action because it's hungry");
            }
        }
    }

    // dog makes sound
    public void actionSound() {
        for (Dog dog : dogList) {
            dog.makeSound();
        }
    }

    // feed dogs
    @Override
    public void feedAnimals() {
        for (Dog dog : dogList) {
            if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.HUNGRY.getHungriness())) {
                dog.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                System.out.println(dog.getName() + " was fed and looks saturated");
            } else if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.SATURATED.getHungriness())) {
                dog.setLevelOfHungriness(LevelOfHungriness.OVEREAT.getHungriness());
                System.out.println(dog.getName() + " was fed and looks really overeaten");
            } else if (dog.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.OVEREAT.getHungriness())) {
                System.out.println(dog.getName() + " cant be fed because its full");
            }
        }
    }


    //print dog list
    @Override
    public void getAnimalList() {
        for (Dog dog : dogList) {
            System.out.println(dog.getName());
        }
    }

    // count dogs in list
    @Override
    public void countAnimals() {
        System.out.println(dogList.size());
    }
}
