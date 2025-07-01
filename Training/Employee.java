public class Employee {
    int id;
    String name;
    int salary;
    int Empcounter = 0;
    static int count = 0;
    Employee(String name, int salary){
        this.id = ++count;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("aseem", 560000);
        Employee employee2 = new Employee("aryan", 1060000);

        employee1.display();
        employee2.display();


    }




}
