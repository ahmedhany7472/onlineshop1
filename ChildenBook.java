package com.mycompany.ass1;

public class ChildenBook extends Product {//subclass from prduct class

    public ChildenBook(double pr) { //constractor to define class
        this.price = pr;
    }

    @Override
    public double getPrice() {//getter method to return the price mult. in 0.3
        return (price * 0.3);
    }

}
