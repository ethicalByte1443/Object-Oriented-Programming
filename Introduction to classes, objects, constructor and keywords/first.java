import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        Student kunal;  //declaring the reference to the object
        kunal = new Student(); // 'new' dynamically allocates (allocates memory at runtime and returns reference to it)





        kunal.rollno = 1;
        kunal.name = "Kunal";
        kunal.marks = 50;


        System.out.println(kunal.name);


        Student list[] = new Student[5];
        System.out.println((Arrays.toString(list)));

        list[0] = new Student();
        list[0].name = "aseem";
        list[0].rollno = 2;
        list[0].marks = 100;
        System.out.println(list[0].name);


//      To avoid repeating the code for reference variable initialisation we use constructor
        Student akshit = new Student(01, "Akshit", 100f);

        System.out.println(akshit.name);

    }
}

// class is logical construct
// object is physical entity --> occupy space in memory --> objects are store in heap memory
// reference variable are store in stack memory
class Student{
    // refernce variable (rollno, name, marks)
    int rollno;
    String name;
    float marks;

    public Student(){};

    public Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

