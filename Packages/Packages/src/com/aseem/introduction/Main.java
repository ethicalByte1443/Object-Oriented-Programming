package com.aseem.introduction;

import com.aseem.packages.greetings;

import static com.aseem.packages.greetings.message;
import static com.aseem.packages.testing.test;


//packages are the folder structure to allow same name files allocation easier and import made more handy
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        message();

        test();
    }
}