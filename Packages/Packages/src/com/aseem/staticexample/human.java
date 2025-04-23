package com.aseem.staticexample;

public class human {
    int age;
    String name;
    int height;
    int salary;

//    static variable is not linked to particular object but to the whole class
    static int population = 0;

    static void greeting(){
        System.out.println("Greetings from human class");
//        System.out.println(this.name);            // in static function u cant use instance based constructors or non-static constructor

    }

    public human(int age, String name, int height, int salary){
        this.age = age;
        this.name = name;
        this.height = height;
        this.salary = salary;
        human.population++;
        greeting();
    }
}
