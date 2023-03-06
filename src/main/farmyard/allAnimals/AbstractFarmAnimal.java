package farmyard.allAnimals;

public abstract class AbstractFarmAnimal extends AbstractAnimal {
    private final String name;

    public AbstractFarmAnimal(int age, double weight, String name) {
        super(age, weight);
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
