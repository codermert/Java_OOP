package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        User myUser =  new User();
        myUser.name = "Mert";
        myUser.job = "Android developer";

        User newUser = new User();
        newUser.name = "Hadise";
        newUser.job = "Musician";

         */

        User myUser = new User("Mert","Developer");
        System.out.println(myUser.job);


        //Abstract
        System.out.println(myUser.information());


        //Encapsulation

        Musician james = new Musician("James","Org",30);
        System.out.println(james.getAge());
        james.setAge(25);
        System.out.println(james.getAge());

        // Inheritance

        SuperMusician lars = new SuperMusician("Mert","Gitar",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());


        //Polymorphism

        // Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        // Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();


        // Interface
        Piano myPiano = new Piano();
        myPiano.brand ="Yamaha";
        myPiano.digital = true;
        myPiano.info();




    }
}