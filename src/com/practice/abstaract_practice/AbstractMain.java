package com.practice.abstaract_practice;

public class AbstractMain {
    public static void main(String[] a){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // ghew
        cat.sound(); // mew

        dog.run(); // running
        cat.run(); // running

        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("kaka");
            }

            @Override
            public void eat(){
                System.out.println("grass");
            }
        };

        animal.sound(); // kaka
        animal.run(); // running
    }
}
