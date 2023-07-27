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

        Cat cat1 = new Cat();
       
        //wertzuweisung
        cat1.firstName = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;


        //Ausgabe
         output(cat1.tellYourName());
         output(cat1.furColor);

         //.. was nicht passt, wird passend gemacht .. ;-)
         //.. Typkonvertierung

         output(Integer.toString(cat1.age));
         output(String.valueOf(cat1.age));
    
        output("---------------------");

        Cat cat2 = new Cat();

        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

         output(cat2.tellYourName());
         output(cat2.furColor);
          output(Integer.toString(cat2.age));
         output(String.valueOf(cat2.age));
    
       
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }

   

}

