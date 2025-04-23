package com.aseem.staticexample;

public class example
{
//    if the 9 line is kept here u will find the line number 16 will print 3
    public static  example RED = new example();
    public static final example BLUE = new example();
    public static final example GREEN = new example();
    static int i=0;                 // if this line is kept here the line number 16 will always print 0 because static instances are loaded as per the same order they are listed in the class so the last value of i is 0

    example(){
        System.out.println("Incrementing 'i'  here  "+(++i));
    }

    public static void main(String[] args) {
        System.out.println("The 'i' variable is not incremented here, it still shows '0' ,  'i' is: " + i);  // line 14
        example x = new example();
        System.out.println(x.i);
    }
}