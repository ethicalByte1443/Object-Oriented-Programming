package stringPractice;
interface A{
    void show();
}
interface B{
    void display();
}
interface C{
    void print();
}

public class test1 implements A, B, C{
    public void display() {
        System.out.println("Display from B");
    }

    public void show() {
        System.out.println("Show from A");
    }

    public void print(){
        System.out.println("Print form C");
    }
}
