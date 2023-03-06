package farmyard;

import farmyard.allAnimals.AbstractFarmAnimal;
import farmyard.allAnimals.Cow;
import farmyard.allAnimals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<AbstractFarmAnimal> animalList = new ArrayList<>();

    public Farm() {

    }

    public void giveAnimalList() {
        for (AbstractFarmAnimal farmAnimal : animalList) {
            System.out.println(farmAnimal.getName());
        }
    }

    public void countAnimals() {
        System.out.println(animalList.size());
    }

    public void addAnimal(AbstractFarmAnimal farmAnimal) {
        animalList.add(farmAnimal);
    }

    public List<AbstractFarmAnimal> getAnimalList() {
        return animalList;
    }

    public void feedAnimals() {
        for (AbstractFarmAnimal farmAnimal : animalList) {
            if (farmAnimal.isHungry()) {
                farmAnimal.setHungry(false);
                System.out.println(farmAnimal.getName() + "was fed");
            } else {
                System.out.println(farmAnimal.getName() + "isn't hungry");
            }
        }
    }

    public void actionAnimals() {
        for (AbstractFarmAnimal farmAnimal : animalList) {
            farmAnimal.doAction();
        }
    }


    public void actionSound() {
        for (AbstractFarmAnimal farmAnimal : animalList) {
            farmAnimal.makeSound();
        }
    }
}

