public class first {
    public static void main(String[] args) {
        A user = new A("new_user");
        System.out.println(user);           // random number
        System.out.println(user.name);
//        user.num = 20; cannot assign to the final variable
        System.out.println(user.num);
    }
}
class A{
    String name;
    final int num = 10;

    public A(String name){
        this.name = name;
    }
}