package com.akeed.training.dpatterns.factory;

public class FoodFactory {

    public FoodOrder createFoodOrder(String orderType, int quantity, String item) {

        if (orderType == null) {
            return null;

        }

        if (orderType.equals("dine")) {

            return new DineIn(quantity, item);

        } else if (orderType.equals("drivethru")) {

            return new DriveThru(quantity, item);

        } else if (orderType.equals("delivery")) {

            return new Delivery(quantity, item);

        }
        return null;

    }
}
