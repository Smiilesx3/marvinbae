package farmyard.Shed;

import farmyard.allAnimals.AbstractFarmAnimal;

import java.util.ArrayList;
import java.util.List;

public class PigShed implements Shed{

    List<AbstractFarmAnimal> pigList = new ArrayList<>();

    public void feedPigs() {
        for (AbstractFarmAnimal farmAnimal : pigList) {
            if (farmAnimal.isHungry()) {
                farmAnimal.setHungry(false);
                System.out.println(farmAnimal.getName() + "was fed");
            } else {
                System.out.println(farmAnimal.getName() + "isn't hungry");
            }
        }
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
