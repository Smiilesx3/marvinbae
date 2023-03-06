package farmyard.allAnimals;

import farmyard.Animal;

public abstract class AbstractAnimal implements Animal {

    private boolean isHungry;
    private double weight;
    private int age;


    public AbstractAnimal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
