package Inheritance;

public class Main{
    public static double area_rectangle(shape rectangle){
        return rectangle.length * rectangle.breadth;
    }
    public static void main(String[] args) {
        shape rectangle = new shape(2,4);
        double area = area_rectangle(rectangle);
        System.out.println("Area : "+area);
    }

}
