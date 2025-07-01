public class Student {
    String name;
    int age;
    int percentage;
    String passing_status;

    Student(){
        this.name = "xxxxxxxxx xxxxxxxxx";
        this.age = Integer.MIN_VALUE;
        this.percentage = Integer.MIN_VALUE;
        this.passing_status = "NA";
    }

    Student(String name, int age, int percentage){
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.passing_status = "NA";
    }

    public void display(){
        System.out.println("Name           : "+ this.name);
        System.out.println("Age            : "+ this.age);
        System.out.println("Percentage     : "+ this.percentage + "%");
        System.out.println("Passing Status : "+ this.passing_status);

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

        if(student1.passing_status.equals("NA")){
            check_passing(student1);
        }

        student1.display();
    }
}

