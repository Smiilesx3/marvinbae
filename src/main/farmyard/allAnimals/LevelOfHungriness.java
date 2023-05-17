package farmyard.allAnimals;

public enum LevelOfHungriness {
    HUNGRY("hungry"),
    SATURATED("saturated"),
    OVEREAT("overeat");

    private final String hungriness;

    LevelOfHungriness(String hungriness) {
        this.hungriness = hungriness;

    }

    public String getHungriness() {
        return hungriness;
    }


}
