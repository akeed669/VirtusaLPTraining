package com.akeed.training.dpatterns.factory;

public class DriveThru extends FoodOrder {


    public DriveThru(int quantity, String item) {
        super(quantity, item);
    }


    public void serveFood() {

        System.out.println("Food will be handed to customer at the drivethru exit");

    }

    public void calculatePayment() {

        priceReduction = 0.8;

        switch (item) {
            case "chicken submarine":
                this.totalPrice = this.quantity * FoodOrder.chickenSubmarine * priceReduction;
                break;

            case "chicken burger":
                this.totalPrice = this.quantity * FoodOrder.chickenBurger * priceReduction;

        }
        System.out.println("The total price for your order is " + totalPrice);

    }


}
