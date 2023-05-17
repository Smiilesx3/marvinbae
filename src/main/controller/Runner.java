package controller;

import calculator.Calculator;
import calculator.Converter;
import farmyard.Farm;
import farmyard.allAnimals.*;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        MenuSelection menuSelection = new MenuSelection();

        int repeat;

        do {
            menuSelection.menuData();
            //request if loop or end
            repeat = menuSelection.endMenu();
        } while (repeat == 1);

        System.out.println("See you next time");
    }
}