package farmyard.Shed;

import farmyard.allAnimals.Dog;

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
            dog.doAction();
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
        for (Dog farmDog : dogList) {
            if (farmDog.isHungry()) {
                farmDog.setHungry(false);
                System.out.println(farmDog.getName() + "was fed");
            } else {
                System.out.println(farmDog.getName() + "isn't hungry");
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
