package com.akeed.training.dpatterns.factory;

public class Delivery extends FoodOrder {

    public Delivery(int quantity, String item) {
        super(quantity, item);
    }

    public void serveFood(){
        System.out.println("Food will be delivered on time");
    }

    public void calculatePayment(){
        priceReduction += 100;

        switch (item) {
            case "chicken submarine":
                this.totalPrice = this.quantity * FoodOrder.chickenSubmarine + priceReduction;
                break;

            case "chicken burger":
                this.totalPrice = this.quantity * FoodOrder.chickenBurger + priceReduction;

        }
        System.out.println("The total price for your order is " + totalPrice);

    }
}
