package com.aseem.inheritanceAndPolymorphism.com.aseem.Inheritance;

public class boxweightcolor extends boxWeight{
    String color;

    public boxweightcolor(){
        super();
        this.color = "None";
    }

    public boxweightcolor(String color){
        super();
        this.color = color;
    }

    public boxweightcolor(double side, double weight, String color){
        super(side, weight);
        this.color = color;
    }

    public boxweightcolor(double l, double b, double h, double weight, String color){
        this.l = l;
        this.b = b;
        this.h = h;
        this.weight = weight;
        this.color = color;

    }

    public void information(){
        super.information();
        System.out.println("Color : "+ this.color);
    }


}
