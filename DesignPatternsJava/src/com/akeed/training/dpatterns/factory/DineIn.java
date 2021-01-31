package com.akeed.training.dpatterns.factory;

public class DineIn extends FoodOrder {

    public DineIn(int quantity, String item) {
        super(quantity, item);
    }

    public void serveFood(){

        System.out.println("Food will be served to the table");

    }

    public void calculatePayment(){

        switch (item) {
            case "chicken submarine":
                this.totalPrice = this.quantity * FoodOrder.chickenSubmarine;
                break;

            case "chicken burger":
                this.totalPrice = this.quantity * FoodOrder.chickenBurger;

        }
        System.out.println("The total price for your order is " + totalPrice);

    }
}
