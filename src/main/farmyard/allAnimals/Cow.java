package farmyard.allAnimals;

public class Cow {
double milkAmount;

public static void createCow(String name, String sound, double weight, double milk, boolean hunger){
    String cowName = name;
    String cowSound = sound;
    double cowWeight = weight;
    double cowMilk = milk;
    boolean cowHunger = hunger;

    System.out.println("a new Cow lives on the farm now. Its name is " + cowName +
            ", its happily " + cowSound + "ing, it weights about " + cowWeight + "kilogram");

}


}
