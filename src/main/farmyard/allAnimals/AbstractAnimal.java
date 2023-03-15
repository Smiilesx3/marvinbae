package farmyard.allAnimals;

import farmyard.Animal;

public abstract class AbstractAnimal implements Animal {


    private double weight;
    private int age;
    private String levelOfHungriness;


    public AbstractAnimal(int age, double weight, String levelOfHungriness) {
        this.age = age;
        this.weight = weight;
        this.levelOfHungriness = levelOfHungriness;
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

    public String getLevelOfHungriness() {
        return levelOfHungriness;
    }

    public void setLevelOfHungriness(String levelOfHungriness) {
        this.levelOfHungriness = levelOfHungriness;
    }
}
