package farmyard.allAnimals;

public abstract class AbstractFarmAnimal extends AbstractAnimal {
    private final String name;

    public AbstractFarmAnimal(int age, double weight, String name, String levelOfHungriness) {
        super(age, weight, levelOfHungriness);
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
