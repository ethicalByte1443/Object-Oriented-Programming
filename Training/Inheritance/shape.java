package Inheritance;

public class shape {
    double length;
    double breadth;

    shape(){
        this.length = 0.0;
        this.breadth = 0.0;
    }

    shape(double length, double breadth){
        System.out.println("Rectange");
        this.length = length;
        this.breadth = breadth;
    }

    shape(double side){
        System.out.println("Square");
        this.length = side;
        this.breadth = side;
    }

    public void display() {
        if (this.length == this.breadth) {
            System.out.println("Square");
            System.out.println("Side       : " + this.length);
        } else {
            System.out.println("Rectangle");
            System.out.println("Length        : " + this.length);
            System.out.println("Breadth       : " + this.breadth);
        }
    }
}
