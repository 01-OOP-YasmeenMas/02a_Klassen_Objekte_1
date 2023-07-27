package com.cc.java;

public class App {
    
    public static void main(String[] args) {


        //Erzeugen von Objekten ohne Referenz
        // System.out.println(new Cat());
        // System.out.println(new Cat());

        /*------------------------------- */

       

        // Instanziierung mit custom constructor
        Cat cat1 = new Cat("Grizabella","white", 29);

        //Ausgabe über Getter
         output(cat1.getFirstName());
         output(cat1.getFurColor());

         //.. was nicht passt, wird passend gemacht .. ;-)
         //.. Typkonvertierung

         output(Integer.toString(cat1.getAge()));
         output(String.valueOf(cat1.getAge()));

         cat1.setFurColor("grey");
         output(cat1.getFurColor());
    
        output("---------------------");
        
        Cat cat2 = new Cat("Alonzo", "grey", 35);

        //Ausgabe über Getter
         output(cat2.getFirstName());
         output(cat2.getFurColor());
         output(Integer.toString(cat2.getAge()));
         
       
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }

   

}

