package com.company;
import java.util.Scanner;

public class GroupE_FruitSalad {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Peach peach = new Peach();
        Sapodilla sapodilla = new Sapodilla();
        Tangerine tangerine = new Tangerine();
        Blueberry blueberry = new Blueberry();
        System.out.println("Welcome to Team E Fruit Salad Maker. \n Please enter how many grams of Peach do you want in your salad?");
        peach.setPeachWeight(scan.nextDouble());
        System.out.println("Alright, and how much grams of Sapodilla do you want in your salad?");
        sapodilla.setSapodillaWeight(scan.nextDouble());
        System.out.println("We got you pal, and how much grams of Tangerine do you want in your salad?");
        tangerine.setTangerineWeight(scan.nextDouble());
        System.out.println("Excellent, and how much grams of Blueberry do you want in your salad?");
        blueberry.setBlueberryWeight(scan.nextDouble());
        double amount = peach.getPeachWeight() + sapodilla.getSapodillaWeight() + tangerine.getTangerineWeight() + blueberry.getBlueberryWeight();
        if (peach.getPeachWeight() < 0 || sapodilla.getSapodillaWeight() < 0 || tangerine.getTangerineWeight() < 0 || blueberry.getBlueberryWeight() < 0) {
            System.out.println("Please, enter the number, which is more or equals 0");
        }
        if (amount == 0) {
            System.out.println("Your salad is empty because you have not ordered any of fruits");
        }
            else {
                System.out.println("Thank you for your order! Your fruit salad is ready. Total weight of your salad is " + amount + "\n Ingredients:");
                if (peach.getPeachWeight() > 0) {
                    System.out.println("Peach");
                }
                if (sapodilla.getSapodillaWeight() > 0) {
                    System.out.println("Sapodilla");
                }
                if (tangerine.getTangerineWeight() > 0) {
                    System.out.println("Tangerine");
                }
                if (blueberry.getBlueberryWeight() > 0) {
                    System.out.println("Blueberry");
                }
            }
    }
}
