package com.mycompany.ass1;

public class Ass1 {

    public static void main(String[] args) {

        // create an object as array
        Product[] arr = new Product[2];

        //first index that create object from book class 
        arr[0] = new Book(40);
        //call the method getprice for book then print it
        System.out.println("price of book is : " + arr[0].getPrice());

        //second index that create object from children book class 
        arr[1] = new ChildenBook(20);
        //call the method getprice for children then print it
        System.out.println("price of childrenbook is : " + arr[1].getPrice());

    }
}
