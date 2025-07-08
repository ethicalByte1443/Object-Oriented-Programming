package stringPractice;
interface A{
    void show();
}
interface B{
    void display();
}

public class test1 implements A, B{
    public void display() {
        System.out.println("Display from B");
    }

    public void show() {
        System.out.println("Show from A");
    }
}
