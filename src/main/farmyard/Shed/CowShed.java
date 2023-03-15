package farmyard.Shed;

import farmyard.allAnimals.Cow;
import farmyard.allAnimals.LevelOfHungriness;

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
            if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.OVEREAT.getHungriness())) {
                cow.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                cow.doAction();
            } else if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.SATURATED.getHungriness())) {
                cow.setLevelOfHungriness(LevelOfHungriness.HUNGRY.getHungriness());
                cow.doAction();
            } else if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.HUNGRY.getHungriness())) {
                System.out.println(cow.getName() + " can't do its action because it's hungry");
            }
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
        for (Cow cow : cowList) {
            if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.HUNGRY.getHungriness())) {
                cow.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                System.out.println(cow.getName() + " was fed and looks saturated");
            } else if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.SATURATED.getHungriness())) {
                cow.setLevelOfHungriness(LevelOfHungriness.OVEREAT.getHungriness());
                System.out.println(cow.getName() + " was fed and looks really overeaten");
            } else if (cow.getLevelOfHungriness().equalsIgnoreCase(LevelOfHungriness.OVEREAT.getHungriness())) {
                System.out.println(cow.getName() + " cant be fed because its full");
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
