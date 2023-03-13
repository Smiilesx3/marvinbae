package farmyard.Shed;

import farmyard.allAnimals.AbstractFarmAnimal;
import farmyard.allAnimals.Cow;

import java.util.ArrayList;
import java.util.List;

public class CowShed implements Shed {
    List<Cow> cowList = new ArrayList<>();

    // add cow to list
    public void addCow(Cow cow) {
        cowList.add(cow);
    }


    // cow gives milk and gets hungry
    public void cowAction() {
        for (Cow cow : cowList) {
            cow.doAction();
        }
    }

    // cow makes sound
    public void actionSound() {
        for (Cow cow : cowList) {
            cow.makeSound();
        }
    }

    // feed cows
    @Override
    public void feedAnimals() {
        for (AbstractFarmAnimal farmAnimal : cowList) {
            if (farmAnimal.isHungry()) {
                farmAnimal.setHungry(false);
                System.out.println(farmAnimal.getName() + "was fed");
            } else {
                System.out.println(farmAnimal.getName() + "isn't hungry");
            }
        }
    }

    // print cow list
    @Override
    public void getAnimalList() {
        for (Cow cow : cowList) {
            System.out.println(cow.getName());
        }
    }

    //count cows
    @Override
    public void countAnimals() {
        System.out.println(cowList.size());
    }
}
