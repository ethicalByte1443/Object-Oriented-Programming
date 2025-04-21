public class wrapper_classes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        Integer num = new Integer(10);        deprecated in 9+ java
        Integer num1 = 10;
        Integer num2 = 20;
        swap(num1, num2);

        System.out.println(num1 + " "+ num2);


    }
//    this will also not swap the value bcoz in java primitive datatypes are passed by values
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
    }

//    and this will also not swap the value because Integer Wrapper class is final access
    static void swap(Integer num1, Integer num2){
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
