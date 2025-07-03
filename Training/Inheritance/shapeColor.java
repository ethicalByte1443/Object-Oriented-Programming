package Inheritance;

public class shapeColor extends shape{
    String color;

    shapeColor(String color){
        super();
        this.color = color;
    }

    shapeColor(double length, double breadth, String color){
        super(length, breadth);
        this.color = color;
        System.out.println("rectangle");
    }

    shapeColor(double length, String color){
        super(length);
        this.color = color;
        System.out.println("square");
    }

    public void display(){
        super.display();
        System.out.println("Color           : "+ this.color);
    }
}
