package com.cc.java;

public class Cat {

   public void tellYourAddress() {

    // this --> Instanzvariable

    System.out.println("Blick von innen: " + this);
    
   }
    

public void testObj() {
    System.out.println("Grüße aus dem Objekt: " + this);
}

public static void testClasse() {
    System.out.println("Grüße aus der Klasse!");
}
}
