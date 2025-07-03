public class Employee {
    int id;
    String name;
    int salary;
    int Empcounter = 0;
    static int count = 0;
    static String companyName = "AIAI";

    Employee(String name, int salary){
        this.id = ++count;
        this.name = name;
        this.salary = salary;
    }

    public void change_company_name(String new_name){
        companyName = new_name;
    }

    public static void get_emp_count(){
        System.out.println(count);
    }

    public void display(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(companyName);
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("aseem", 560000);
        Employee employee2 = new Employee("aryan", 1060000);

        employee1.display();
        employee2.display();


        get_emp_count();


    }




}
