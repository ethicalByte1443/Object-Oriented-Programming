package com.aseem.inheritanceAndPolymorphism.com.aseem.Inheritance;

public class boxWeight extends box{
    double weight;

    public boxWeight() {
        super();
        this.weight = -1;
    }

    public boxWeight (double weight){
        this.weight = weight;
    }


    public boxWeight(double l, double b, double h, double weight){
//        this.l = l;
//        this.b = b;
//        this.h = h;
//        these 3 lines can be replaced using super()

        super(l ,b, h);
        this.weight = weight;
    }

    @Override
    public void information() {
        super.information();
        System.out.println("Weight : "+ this.weight);
        System.out.println(" **************** ");
    }
}
