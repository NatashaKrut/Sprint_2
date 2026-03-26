package model;

import model.constants.Discount;

public class Apple extends Food{
    String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.colour = colour;
        isVegetarian = true;
        this.price = price;
    }



    @Override
    public double getDiscount() {
        if (this.colour == "red"){
            return Discount.discount;
        }
        else {
            return 0;
        }
    }
}
