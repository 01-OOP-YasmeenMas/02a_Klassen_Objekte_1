package com.cc.java;

public class App {
    
    public static void main(String[] args) {


        //Erzeugen von Objekten ohne Referenz
        // System.out.println(new Cat());
        // System.out.println(new Cat());

        /*------------------------------- */

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable
        Cat cat = new Cat();
        // System.out.println("Blick von aussen: " + cat);
        // cat.tellYourAddress();

        cat.testObj();
        Cat.testClasse();

        System.out.println("---------------------");

        // Cat cat2 = new Cat();
        // System.out.println("Blick von aussen: " + cat2);
        // cat2.tellYourAddress();

    }

   

}

