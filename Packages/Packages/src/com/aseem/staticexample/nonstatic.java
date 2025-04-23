package com.aseem.staticexample;
// this code will not run
public class nonstatic {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        System.out.println(a);      // this will give the error
    }
}
