package com.aseem.staticexample;
public class Main {
    public static void main(String[] args) {
//        if the files are the same folder u don't have to import them
        human aseem = new human(21, "Aseem", 6, 50000);
        human aryan = new human(20, "aryan", 6, 1000000);


//        this is the wrong practise
        System.out.println(aryan.population);
        System.out.println(aseem.population);

//        the correct convention is this using <classname>.population
        System.out.println(human.population);




        System.out.println("**************");
    }
}
