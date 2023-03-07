package farmyard.Shed;

import farmyard.allAnimals.AbstractFarmAnimal;

import java.util.ArrayList;
import java.util.List;

public class ChickenShed implements Shed{
    List<AbstractFarmAnimal> chickenList = new ArrayList<>();

    public void feedChicken() {
        for (AbstractFarmAnimal farmAnimal : chickenList) {
            if (farmAnimal.isHungry()) {
                farmAnimal.setHungry(false);
                System.out.println(farmAnimal.getName() + "was fed");
            } else {
                System.out.println(farmAnimal.getName() + "isn't hungry");
            }
        }
    }

    public void giveChickenList() {
        for (AbstractFarmAnimal farmAnimal : chickenList) {
            System.out.println(farmAnimal.getName());
        }
    }

    public void countChicken() {
        System.out.println(chickenList.size());
    }

    public void addChicken(AbstractFarmAnimal farmAnimal) {
        chickenList.add(farmAnimal);
    }

    @Override
    public void addAnimal() {

    }

    @Override
    public void getAnimalList() {

    }

    @Override
    public void countAnimals() {

    }

}
