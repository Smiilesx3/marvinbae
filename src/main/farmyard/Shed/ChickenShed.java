package farmyard.Shed;

import farmyard.allAnimals.Chicken;

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
            chicken.doAction();
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
            if (chicken.isHungry()) {
                chicken.setHungry(false);
                System.out.println(chicken.getName() + "was fed");
            } else {
                System.out.println(chicken.getName() + "isn't hungry");
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
