package com.aseem.inheritanceAndPolymorphism.com.aseem.Inheritance;

public class boxPrice extends boxweightcolor{

    double price;
    public static int count = 0;
    public boxPrice(){
        super();
        this.price = 0.0;
        count++;
    }

    public boxPrice(double price){
        super();
        this.price = price;
        count++;

    }

    public boxPrice(double l, double b, double h, double weight, String color, double price){
        this.l = l;
        this.b = b;
        this.h = h;
        this.weight = weight;
        this.color = color;
        this.price = price;
        count++;

    }

    public boxPrice(double side, double weight, String color, double price){
        super(side, weight, color);
        this.price = price;
        count++;

    }

    public void information(){
        super.information();
        System.out.println("Price : "+ this.price);
        System.out.println(" **************** ");


    }
}
