package controller;

import calculator.Calculator;
import calculator.Converter;
import farmyard.Farm;
import farmyard.allAnimals.Chicken;
import farmyard.allAnimals.Cow;
import farmyard.allAnimals.Dog;
import farmyard.allAnimals.Pig;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        //Anfang do while


        int menuChoice; //case variable - chose what to do


        Scanner scannerVariable = new Scanner(System.in);


        System.out.println("""
                Choose what you want to do:\s
                \s
                [1] Use calculator\s
                [2] Use converter (distances)\s
                [3] Use converter (time formats)\s
                [4] Start farmyard simulator\s
                """);

        menuChoice = scannerVariable.nextInt();

        int repeat;
        do {
            switch (menuChoice) {

                //Calculation
                case 1 -> {
                    double number1;
                    double number2;
                    System.out.println("First number.");
                    number1 = scannerVariable.nextDouble();
                    System.out.println("Second number.");
                    number2 = scannerVariable.nextDouble();
                    Calculator math = new Calculator();
                    double addition = math.methodeAddition(number1, number2);
                    double subtraktion = math.methodeSubtraction(number1, number2);
                    double multiplikation = math.methodeMulitplication(number1, number2);
                    double division = math.methodeDivision(number1, number2);
                    System.out.println("The result of the addition is: " + addition);
                    System.out.println("The result of the subtraction is: " + subtraktion);
                    System.out.println("The result of the multiplication is: " + multiplikation);
                    System.out.println("The result of the division is: " + division);
                }

                //Distance conversion
                case 2 -> {
                    System.out.println("""
                            Choose what you want to do:\s
                            \s
                            for converting kilometers to miles type '1'\s
                            for converting miles to kilometers type '2'\s
                            """);


                    int conversionChoiceDistances = scannerVariable.nextInt();
                    Converter convert = new Converter();
                    switch (conversionChoiceDistances) {
                        case 1 -> {
                            System.out.println("Insert the distance (in kilometers) you want to convert to miles.");
                            double kilometers = scannerVariable.nextDouble();
                            double convertedMiles = convert.methodeKmToMiles(kilometers);
                            System.out.println("The result of the conversion is: " + convertedMiles);
                        }
                        case 2 -> {
                            System.out.println("Insert the distance (in miles) you want to convert to kilometers.");
                            double miles = scannerVariable.nextDouble();
                            double convertedKilometers = convert.methodeMilesToKM(miles);
                            System.out.println("The result of the conversion is: " + convertedKilometers);
                        }
                    }
                }

                //Time conversion
                case 3 -> {
                    System.out.println("""
                            Choose what you want to do:\s
                            \s
                            for converting format hh:mm:ss to mm:ss, type '1'\s
                            for converting format mm:ss to hh:mm:ss, type '2'\s
                            """);
                    int conversionChoiceTimeFormat = scannerVariable.nextInt();

                    Converter convertTime = new Converter();

                    switch (conversionChoiceTimeFormat) {
                        case 1 -> {
                            System.out.println("Insert the time you want to convert in the following format: hh:mm:ss .");
                            String timeHhMmSs = scannerVariable.next();
                            String[] time = timeHhMmSs.split(":");
                            String convertedTimeHours = convertTime.methodeHhMmSsToMmSs(time);
                            System.out.println("The converted time is: " + convertedTimeHours);
                        }
                        case 2 -> {
                            System.out.println("Insert the time you want to convert in the following format: mm:ss .");
                            String timeMmSs = scannerVariable.next();
                            String[] timeMi = timeMmSs.split(":");
                            String convertedTimeMinutes = convertTime.methodeMmSsToHhMmSs(timeMi);
                            System.out.println("The converted time is: " + convertedTimeMinutes);
                        }
                        default -> System.out.println("this option doesn't exist");
                    }
                }
                // farm simulator
                case 4 -> {

                    System.out.println("""
                            Choose what you want to do:\s
                            \s
                            [1] Create an animal\s
                            [2] Show a list of all animals\s
                            [3] count all animals\s
                            [4] force all animals to do their action\s
                            [5] feed all animals\s
                            [6] listen to animals\s
                            """);

                    int farmyard = scannerVariable.nextInt();
                    Farm farm = new Farm();

                    switch (farmyard) {

                        case 1 -> {
                            System.out.println("""
                                    Choose what you want to do:\s
                                    \s
                                    create a chicken '1'\s
                                    create a cow '2'\s
                                    create a dog '3'\s
                                    create a pig '4'\s
                                    """);
                            int createAnimal = scannerVariable.nextInt();
                            switch (createAnimal) {

                                case 1 -> {

                                    System.out.println("type chicken name");
                                    String chickenName = scannerVariable.next();
                                    System.out.println("type chicken age");
                                    int chickenAge = scannerVariable.nextInt();
                                    System.out.println("type chicken weight");
                                    double chickenWeight = scannerVariable.nextDouble();


                                    Chicken chicken = new Chicken(chickenAge, chickenWeight, chickenName);
                                    System.out.println("Name: " + chicken.getName() +
                                            " Age: " + chicken.getAge() +
                                            " Weight: " + chicken.getWeight());

                                    chicken.makeSound();
                                    farm.addAnimal(chicken);


                                }
                                case 2 -> {
                                    System.out.println("type cow name");
                                    String cowName = scannerVariable.next();
                                    System.out.println("type cow age");
                                    int cowAge = scannerVariable.nextInt();
                                    System.out.println("type cow weight");
                                    double cowWeight = scannerVariable.nextDouble();


                                    Cow cow = new Cow(cowAge, cowWeight, cowName);
                                    System.out.println("Name: " + cow.getName() +
                                            " Age: " + cow.getAge() +
                                            " Weight: " + cow.getWeight());
                                    cow.makeSound();
                                    farm.addAnimal(cow);

                                }

                                case 3 -> {
                                    System.out.println("type dog name");
                                    String dogName = scannerVariable.next();
                                    System.out.println("type dog age");
                                    int dogAge = scannerVariable.nextInt();
                                    System.out.println("type dog weight");
                                    double dogWeight = scannerVariable.nextDouble();


                                    Dog dog = new Dog(dogAge, dogWeight,  dogName);
                                    System.out.println("Name: " + dog.getName() +
                                            " Age: " + dog.getAge() +
                                            " Weight: " + dog.getWeight());
                                    dog.makeSound();
                                    farm.addAnimal(dog);
                                }

                                case 4 -> {
                                    System.out.println("type pig name");
                                    String pigName = scannerVariable.next();
                                    System.out.println("type pig age");
                                    int pigAge = scannerVariable.nextInt();
                                    System.out.println("type pig weight");
                                    double pigWeight = scannerVariable.nextDouble();


                                    Pig pig = new Pig(pigAge, pigWeight, pigName);
                                    System.out.println("Name: " + pig.getName() +
                                            " Age: " + pig.getAge() +
                                            " Weight: " + pig.getWeight());

                                    pig.makeSound();
                                    farm.addAnimal(pig);

                                }
                            }
                        }
                        case 2 -> {
                            farm.giveAnimalList();

                        }
                        case 3 -> {
                            farm.countAnimals();

                        }
                        case 4 -> {
                            farm.actionAnimals();
                        }
                        case 5 -> {
                            farm.feedAnimals();
                        }
                        case 6 -> {
                            farm.actionSound();
                        }
                        default -> {
                            System.out.println("this option doesn't exist");
                        }


                    }


                }
                default -> System.out.println("this option doesn't exist");
            }
            //abfrage obs weitergeht
            System.out.println("""
                                                
                                                
                    Choose what you want to do:\s
                    \s
                    [1] Go back to menu\s
                    [2] End program\s
                    """);
            repeat = scannerVariable.nextInt();
        } while (repeat == 1);

        System.out.println("See you next time");
    }
}