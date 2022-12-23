package com.mycompany.ass1;

 public abstract class Product { //abstract class

    protected double price; //defination of a variable in this package only

    public void setPrice(double price) { //setter method 
        this.price = price;
    }

    public double getPrice() { //getter method 
        return price;
    }

}
