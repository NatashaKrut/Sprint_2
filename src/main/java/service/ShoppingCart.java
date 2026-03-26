package service;

import model.Food;

public class ShoppingCart {
    Food[] productsArray;

    public ShoppingCart(Food[] productsArray) {
        this.productsArray = productsArray;
    }

    public double amountWithoutDiscount() {
        double totalAmount = 0;
        for (int i = 0; i < productsArray.length; i++) {
            totalAmount = totalAmount + (productsArray[i].getAmount() * productsArray[i].getPrice());
        }
        return totalAmount;
    }

    public double amountWithDiscount() {
        double totalAmount = 0;
        for (int i = 0; i < productsArray.length; i++) {
            totalAmount = totalAmount + (productsArray[i].getAmount() * productsArray[i].getPrice() * (1 - productsArray[i].getDiscount()));

        }
        return totalAmount;
    }

    public double amountOfVegetarian() {
        double totalAmount = 0;
        for (int i = 0; i < productsArray.length; i++) {
            if (productsArray[i].isVegetarian()) {
                totalAmount = totalAmount + (productsArray[i].getAmount() * productsArray[i].getPrice());
            }
        }
        return totalAmount;
    }
}