package com.mycompany.ass1;

public class Book extends Product {//subclass from prduct class

    public Book(double pr) { //constractor to define class
        this.price = pr;
    }

    @Override
    public double getPrice() {//getter method overrided from the product class to return the price mult. in 0.5
        return (price * 0.5);

    }
}
