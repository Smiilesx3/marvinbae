package controller;

import calculator.Calculator;
import calculator.Converter;
import farmyard.allAnimals.Cow; //why tho

import java.util.Scanner;

import static farmyard.allAnimals.Cow.createCow;

public class Runner {
    public static void main(String[] args) {


        int menuChoice; //case variable - chose what to do


        Scanner scannerVariable = new Scanner(System.in);


        System.out.println("""
                Choose what you want to do:\s
                \s
                for calculating, type '1'\s
                for converting distances, type '2'\s
                for converting different time formats, type '3'\s
                for starting the farmyard simulator, type '4'\s
                """);

        menuChoice = scannerVariable.nextInt();


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
            // farm shit ass fuck cow test
            case 4 -> {

                System.out.println("Insert the name of the cow");
                String cowName = scannerVariable.next();
                System.out.println("Insert the Sound of the cow");
                String cowSound = scannerVariable.next();
                System.out.println("Insert the weight of the cow");
                double cowWeight = scannerVariable.nextDouble();
                System.out.println("Insert the amount of milk of the cow in Liters");
                double cowMilk = scannerVariable.nextDouble();
                System.out.println("type false because its not hungry rn");
                boolean cowHunger = scannerVariable.nextBoolean();


                createCow(cowName,cowSound,cowWeight,cowMilk,cowHunger);



            }
            default -> System.out.println("this option doesn't exist");
        }


    }
}
