package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] productsArray = {new Meat(5, 100), new Apple(10, 50, Colour.red), new Apple(8, 60, Colour.green)};
        ShoppingCart cart = new ShoppingCart(productsArray);
        System.out.println(cart.amountWithoutDiscount());
        System.out.println(cart.amountWithDiscount());
        System.out.println(cart.amountOfVegetarian());
    }
}