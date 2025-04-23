package com.aseem.staticexample;

import jdk.dynalink.beans.StaticClass;

import java.sql.Statement;

// this is the demo to show initialisation of static variables
public class staticInt {
    static int a = 10;
    static int b = 20;


    static{
        System.out.println("static block");
        b = a * 5;
    }

    public static void main(String[] args) {
//        staticInt obj = new staticInt();
//        a = 0; ERROR
        System.out.println(a);
        System.out.println(b);
    }
}
