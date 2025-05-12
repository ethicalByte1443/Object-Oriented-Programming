package com.aseem.inheritanceAndPolymorphism.com.aseem.Inheritance;

public class boxPrice extends boxweightcolor{

    double price;

    public boxPrice(){
        super();
        this.price = 0.0;
    }

    public boxPrice(double price){
        super();
        this.price = price;
    }

    public boxPrice(double l, double b, double h, double weight, String color, double price){
        this.l = l;
        this.b = b;
        this.h = h;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public void information(){
        super.information();
        System.out.println("Price : "+ this.price);
        System.out.println(" **************** ");

    }
}
