package farmyard.Shed;

import farmyard.allAnimals.Chicken;
import farmyard.allAnimals.LevelOfHungriness;

import java.util.ArrayList;
import java.util.List;

public class ChickenShed implements Shed {
    private final List<Chicken> chickenList = new ArrayList<>();

    //add chicken to list
    public void addChicken(Chicken chicken) {
        chickenList.add(chicken);
    }


    //chicken lays egg/s and gets hungry
    public void chickenAction() {
        for (Chicken chicken : chickenList) {
            if (chicken.getLevelOfHungriness() == LevelOfHungriness.OVEREAT.getHungriness()) {
                chicken.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                chicken.doAction();
            } else if (chicken.getLevelOfHungriness() == LevelOfHungriness.SATURATED.getHungriness()) {
                chicken.setLevelOfHungriness(LevelOfHungriness.HUNGRY.getHungriness());
                chicken.doAction();
            } else if (chicken.getLevelOfHungriness() == LevelOfHungriness.HUNGRY.getHungriness()) {
                System.out.println(chicken.getName() + " can't do its action because it's hungry");
            }
        }
    }

    // chicken makes sound
    public void actionSound() {
        for (Chicken chicken : chickenList) {
            chicken.makeSound();
        }
    }


    // feed chicken

    @Override
    public void feedAnimals() {
        for (Chicken chicken : chickenList) {
            if (chicken.getLevelOfHungriness() == LevelOfHungriness.HUNGRY.getHungriness()) {
                chicken.setLevelOfHungriness(LevelOfHungriness.SATURATED.getHungriness());
                System.out.println(chicken.getName() + " was fed and looks saturated");
            } else if (chicken.getLevelOfHungriness() == LevelOfHungriness.SATURATED.getHungriness()) {
                chicken.setLevelOfHungriness(LevelOfHungriness.OVEREAT.getHungriness());
                System.out.println(chicken.getName() + " was fed and looks really overeaten");
            } else if (chicken.getLevelOfHungriness() == LevelOfHungriness.OVEREAT.getHungriness()) {
                System.out.println(chicken.getName() + " cant be fed because its full");
            }
        }
    }

    // print chicken list
    @Override
    public void getAnimalList() {
        for (Chicken chicken : chickenList) {
            System.out.println(chicken.getName());
        }
    }

    // count chicken
    @Override
    public void countAnimals() {
        System.out.println(chickenList.size());
    }

}
