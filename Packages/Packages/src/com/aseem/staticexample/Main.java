package com.aseem.staticexample;
public class Main {
    public static void main(){
        System.out.println("Second main");
    }
    public static void main(String[] args) {
//  if the files are the same folder u don't have to import them
        human aseem = new human(21, "Aseem", 6, 50000);
        human aryan = new human(20, "aryan", 6, 1000000);


//  this is the wrong practise
        System.out.println(aryan.population);
        System.out.println(aseem.population);

//  the correct convention is this using <classname>.population
        System.out.println(human.population);


        System.out.println("**************");

//  'greetings' wihtout STATIC requires to call the object of the class to call the function
        Main myClass = new Main();
        myClass.greetings();

//  the parameter is added to the same function 'greetings' otherwise it will cause error of same name function in the same package
        greetings("aseem");

    }

    void greetings(){
        System.out.println("Hello world without STATIC");
    }

    static void greetings(String name){
        System.out.println("Hello world with STATIC : " + name);
    }

    public static class staticInt {
    }
}
