package controller;
import calculator.Calculator;
import calculator.Converter;
import farmyard.Farm;
import farmyard.allAnimals.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class MenuSelection {
    Scanner menuScan = new Scanner(System.in);
    Farm farm = new Farm();


    public void menuData() {
        int selection;



        System.out.println("""
                                    Choose what you want to do:\s
                                    \s
                                    [1] Use calculator\s
                                    [2] Use converter (distances)\s
                                    [3] Use converter (time formats)\s
                                    [4] Start farmyard simulator\s
                                    """);

        selection = menuScan.nextInt();


        switch (selection) {

            //Calculation
            case 1 -> {
                double number1;
                double number2;
                System.out.println("First number.");
                number1 = menuScan.nextDouble();
                System.out.println("Second number.");
                number2 = menuScan.nextDouble();
                Calculator math = new Calculator();
                double addition = math.methodeAddition(number1, number2);
                double subtraction = math.methodeSubtraction(number1, number2);
                double multiplication = math.methodeMulitplication(number1, number2);
                double division = math.methodeDivision(number1, number2);
                System.out.println("The result of the addition is: " + addition);
                System.out.println("The result of the subtraction is: " + subtraction);
                System.out.println("The result of the multiplication is: " + multiplication);
                System.out.println("The result of the division is: " + division);
            }

            //Distance conversion
            case 2 -> {
                System.out.println("""
                            Choose what you want to do:\s
                            \s
                            [1]for converting kilometers to miles type\s
                            [2]for converting miles to kilometers type\s
                            """);


                int conversionChoiceDistances = menuScan.nextInt();
                Converter convert = new Converter();
                switch (conversionChoiceDistances) {
                    case 1 -> {
                        System.out.println("Insert the distance (in kilometers) you want to convert to miles.");
                        double kilometers = menuScan.nextDouble();
                        double convertedMiles = convert.methodeKmToMiles(kilometers);
                        System.out.println("The result of the conversion is: " + convertedMiles);
                    }
                    case 2 -> {
                        System.out.println("Insert the distance (in miles) you want to convert to kilometers.");
                        double miles = menuScan.nextDouble();
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
                            [1]for converting format hh:mm:ss to mm:ss, type\s
                            [2]for converting format mm:ss to hh:mm:ss, type\s
                            """);
                int conversionChoiceTimeFormat = menuScan.nextInt();

                Converter convertTime = new Converter();

                switch (conversionChoiceTimeFormat) {
                    case 1 -> {
                        System.out.println("Insert the time you want to convert in the following format: hh:mm:ss .");
                        String timeHhMmSs = menuScan.next();
                        String[] time = timeHhMmSs.split(":");
                        String convertedTimeHours = convertTime.methodeHhMmSsToMmSs(time);
                        System.out.println("The converted time is: " + convertedTimeHours);
                    }
                    case 2 -> {
                        System.out.println("Insert the time you want to convert in the following format: mm:ss .");
                        String timeMmSs = menuScan.next();
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

                int farmyard = menuScan.nextInt();

                switch (farmyard) {

                    case 1 -> {
                        int createAnimal = farmMenu();
                        switch (createAnimal) {

                            case 1 -> {

                                System.out.println("type chicken name");
                                String chickenName = menuScan.next();
                                System.out.println("type chicken age");
                                int chickenAge = menuScan.nextInt();
                                System.out.println("type chicken weight");
                                double chickenWeight = menuScan.nextDouble();


                                Chicken chicken = new Chicken(chickenAge, chickenWeight, chickenName,
                                        LevelOfHungriness.SATURATED.getHungriness());
                                System.out.println("Name: " + chicken.getName() +
                                        " Age: " + chicken.getAge() +
                                        " Weight: " + chicken.getWeight());

                                chicken.makeSound();
                                farm.addAnimal(chicken);


                            }
                            case 2 -> {
                                System.out.println("type cow name");
                                String cowName = menuScan.next();
                                System.out.println("type cow age");
                                int cowAge = menuScan.nextInt();
                                System.out.println("type cow weight");
                                double cowWeight = menuScan.nextDouble();


                                Cow cow = new Cow(cowAge, cowWeight, cowName, LevelOfHungriness.SATURATED.getHungriness());
                                System.out.println("Name: " + cow.getName() +
                                        " Age: " + cow.getAge() +
                                        " Weight: " + cow.getWeight());
                                cow.makeSound();
                                farm.addAnimal(cow);

                            }

                            case 3 -> {
                                System.out.println("type dog name");
                                String dogName = menuScan.next();
                                System.out.println("type dog age");
                                int dogAge = menuScan.nextInt();
                                System.out.println("type dog weight");
                                double dogWeight = menuScan.nextDouble();


                                Dog dog = new Dog(dogAge, dogWeight, dogName, LevelOfHungriness.SATURATED.getHungriness());
                                System.out.println("Name: " + dog.getName() +
                                        " Age: " + dog.getAge() +
                                        " Weight: " + dog.getWeight());
                                dog.makeSound();
                                farm.addAnimal(dog);
                            }

                            case 4 -> {
                                System.out.println("type pig name");
                                String pigName = menuScan.next();
                                System.out.println("type pig age");
                                int pigAge = menuScan.nextInt();
                                System.out.println("type pig weight");
                                double pigWeight = menuScan.nextDouble();


                                Pig pig = new Pig(pigAge, pigWeight, pigName, LevelOfHungriness.SATURATED.getHungriness());
                                System.out.println("Name: " + pig.getName() +
                                        " Age: " + pig.getAge() +
                                        " Weight: " + pig.getWeight());

                                pig.makeSound();
                                farm.addAnimal(pig);

                            }

                            case 5 -> {
                                farm.addTestAnimal();
                                System.out.println("Test animals were created");
                            }
                        }
                    }
                    case 2 -> farm.giveAnimalList();
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


    }

    //Farm menu
    public int farmMenu() {
        int selection;


        System.out.println("""
                                    Choose what you want to do:\s
                                    \s
                                    [1]create a chicken\s
                                    [2]create a cow\s
                                    [3]create a dog\s
                                    [4]create a pig\s
                                    [5]create a bunch of test animals\s
                                    """);

        selection = menuScan.nextInt();
        return selection;

    }

    public int endMenu() {
        int selection;


        System.out.println("""                           
                                    Choose what you want to do:\s
                                    \s
                                    [1] Go back to menu\s
                                    [2] End program\s
                                    """);

        selection = menuScan.nextInt();
        return selection;
    }


}
