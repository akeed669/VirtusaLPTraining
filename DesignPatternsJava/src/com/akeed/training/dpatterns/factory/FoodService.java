package com.akeed.training.dpatterns.factory;

import java.util.Scanner;

public class FoodService {

    public static void main(String []args){

        FoodFactory foodFactory = new FoodFactory();

        Scanner userInput = new Scanner(System.in);

//        System.out.println("Please enter your desired order below:\nEnter 1 for a chicken burger or 2 for a chicken submarine");
//        int userChoice = userInput.nextInt();
//
//        System.out.println("Enter your desired quantity:");
//        int userQuantity = userInput.nextInt();
//
//        System.out.println("Enter 1 for dine-in or 2 for delivery or 3 for a drive-thru pickup");
//        int userServeChoice = userInput.nextInt();

        FoodOrder foodOrder = foodFactory.createFoodOrder("delivery",3,"chicken submarine");

        foodOrder.serveFood();
        foodOrder.calculatePayment();

    }
}
