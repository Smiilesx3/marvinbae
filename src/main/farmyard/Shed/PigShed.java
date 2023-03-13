package farmyard.Shed;

import farmyard.allAnimals.Pig;

import java.util.ArrayList;
import java.util.List;

public class PigShed implements Shed {

    List<Pig> pigList = new ArrayList<>();

    // add pig to list
    public void addPig(Pig pig) {
        pigList.add(pig);
    }


    public void pigAction() {
        for (Pig pig : pigList) {
            pig.doAction();
        }
    }

    //pig makes sound
    public void actionSound() {
        for (Pig pig : pigList) {
            pig.makeSound();
        }
    }

    // feed pigs
    @Override
    public void feedAnimals() {
        for (Pig pig : pigList) {
            if (pig.isHungry()) {
                pig.setHungry(false);
                System.out.println(pig.getName() + "was fed");
            } else {
                System.out.println(pig.getName() + "isn't hungry");
            }
        }
    }

    // print pig list
    @Override
    public void getAnimalList() {
        for (Pig pig : pigList) {
            System.out.println(pig.getName());
        }
    }

    // count pigs in list
    @Override
    public void countAnimals() {
        System.out.println(pigList.size());
    }
}
