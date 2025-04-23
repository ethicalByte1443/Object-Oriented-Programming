package com.aseem.staticexample;
// this code will not run
public class nonstatic {
    int a = 10;
    int b = 20;


    static {
        System.out.println("Static box initiated");
        nonstatic obj = new nonstatic();
        obj.a = 100;
        obj.b = 200;
    }
    public static void main(String[] args) {
//        System.out.println(a);      // this will give the error


        nonstatic obj = new nonstatic();
        obj.a = 100;
        System.out.println(obj.a);
    }
}
