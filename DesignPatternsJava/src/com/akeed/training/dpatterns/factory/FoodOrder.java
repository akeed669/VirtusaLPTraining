package com.akeed.training.dpatterns.factory;

public abstract class FoodOrder {

    public static int chickenBurger = 500;
    public static int chickenSubmarine = 700;
    public int quantity;
    public String item;
    public double totalPrice;
    public double priceReduction;

    public FoodOrder(int quantity, String item) {
        this.quantity = quantity;
        this.item = item;

    }

    public abstract void serveFood();

    public abstract void calculatePayment();
}
