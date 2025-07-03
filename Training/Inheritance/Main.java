package Inheritance;

public class Main extends shape{
    Main(double length, double breadth){
        super(length, breadth);
    }

    Main(double length){
        super(length);
    }

    public void display(){
        super.display();
    }
    public static void main(String[] args) {
        Main rectangle = new Main(20, 30);

        Main square = new Main(20);

        square.display();
    }

}
