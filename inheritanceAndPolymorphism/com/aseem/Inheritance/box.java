package com.aseem.inheritanceAndPolymorphism.com.aseem.Inheritance;

public class box {
    double l;
    double b;
    double h;

    box () {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

//    cuboid
    box (double l, double b, double h){
        System.out.println("Cuboid");
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void information(){
        System.out.println("Length : " + this.l);
        System.out.println("Breadth : " + this.b);
        System.out.println("Height : " + this.h);
    }

//    cube
    box (double side){
        System.out.println("Cube");
        this.l = side;
        this.b = side;
        this.h = side;
    }

    box (box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
}
