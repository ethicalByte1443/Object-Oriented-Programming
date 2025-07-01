import java.util.ArrayList;

public class Student {
    String name;
    int age;
    int percentage;
    String passing_status;
    static int count = 0;

    Student(){
        this.name = "xxxxxxxxx xxxxxxxxx";
        this.age = Integer.MIN_VALUE;
        this.percentage = Integer.MIN_VALUE;
        this.passing_status = "NA";
        count++;
    }

    Student(String name, int age, int percentage){
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.passing_status = "NA";
        count++;
    }

    public void display(){
        System.out.println("Name           : "+ this.name);
        System.out.println("Age            : "+ this.age);
        System.out.println("Percentage     : "+ this.percentage + "%");
        System.out.println("Passing Status : "+ this.passing_status);
        System.out.println(" ************************************* ");

    }

    public void setPassing_status(String passing_status){
        this.passing_status = passing_status;
    }

    public static void check_passing(Student student){
        if(student.percentage > 40){
            student.setPassing_status("Pass");
        }
        else{
            student.setPassing_status("Fail");
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("Aseem", 20, 76);
        Student student2 = new Student("Neha", 21, 82);
        Student student3 = new Student("Rahul", 19, 67);
        Student student4 = new Student("Priya", 22, 90);
        Student student5 = new Student("Karan", 20, 73);
        Student student6 = new Student("Sneha", 21, 88);
        Student student7 = new Student("Rohan", 23, 22);
        Student student8 = new Student("Anjali", 20, 91);
        Student student9 = new Student("Vikram", 19, 30);
        Student student10 = new Student("Meera", 22, 85);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(student1);
        arr.add(student2);
        arr.add(student3);
        arr.add(student4);
        arr.add(student5);
        arr.add(student6);
        arr.add(student7);
        arr.add(student8);
        arr.add(student9);
        arr.add(student10);


        for (int i = 0; i < arr.size(); i++) {
            Student current = arr.get(i);
            if(current.passing_status.equals("NA")){
                check_passing(current);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).display();
        }
    }
}

