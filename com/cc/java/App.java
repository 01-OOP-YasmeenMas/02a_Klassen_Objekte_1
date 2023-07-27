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
        output("Blick von aussen: " + cat);
        output(cat.tellYourAddress());

        // cat.testObj();
        // Cat.testClasse();

    
        output("---------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        cat2.tellYourAddress();
        output(cat2.tellYourAddress());

    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }

   

}

