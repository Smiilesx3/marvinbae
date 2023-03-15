package farmyard.Shed;

import farmyard.allAnimals.LevelOfHungriness;
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
            if (pig.getLevelOfHungriness() == LevelOfHungriness.OVEREAT.getHungriness()) {
                pig.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                pig.doAction();
            } else if (pig.getLevelOfHungriness() == LevelOfHungriness.SATURATED.getHungriness()) {
                pig.setLevelOfHungriness(LevelOfHungriness.HUNGRY.getHungriness());
                pig.doAction();
            } else if (pig.getLevelOfHungriness() == LevelOfHungriness.HUNGRY.getHungriness()) {
                System.out.println(pig.getName() + " can't do its action because it's hungry");
            }
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
            if (pig.getLevelOfHungriness() == LevelOfHungriness.HUNGRY.getHungriness()) {
                pig.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                System.out.println(pig.getName() + " was fed and looks saturated");
            } else if (pig.getLevelOfHungriness() == LevelOfHungriness.SATURATED.getHungriness()) {
                pig.setLevelOfHungriness(LevelOfHungriness.OVEREAT.getHungriness());
                System.out.println(pig.getName() + " was fed and looks really overeaten");
            } else if (pig.getLevelOfHungriness() == LevelOfHungriness.OVEREAT.getHungriness()) {
                System.out.println(pig.getName() + " cant be fed because its full");
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
