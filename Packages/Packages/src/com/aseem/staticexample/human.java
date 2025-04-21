package com.aseem.staticexample;

public class human {
    int age;
    String name;
    int height;
    int salary;

//    static variable is not linked to particular object but to the whole class
    static int population = 0;

    public human(int age, String name, int height, int salary){
        this.age = age;
        this.name = name;
        this.height = height;
        this.salary = salary;
        human.population++;
    }
}
