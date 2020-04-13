package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Product a1= new Product();
        Product a2 = new Product("PC");
        Product a3 = new Product("Clothes","ZARA");

        a1.addProducts("DELL");
        a2.addProducts("Lancer");
        a3.addProducts("Phones");

        a1.getProducts();
        a2.getProducts();
        a3.getProducts();



        a3.removeProducts("ZARA");

        a1.removeProducts("Lancer");
        a3.renameProduct("house");

        // task number 2


        Purchases b1 = new Purchases("ade","Watch");
        Purchases b2 = new Purchases("Rock");
        Purchases b4 = new Purchases("Phone",b2);


        b1.addProduct("Phone");

        b1.addProduct("Watch");
        b2.addProduct("Phone");
        b4.addProduct("shirt");
        b1.buy();
        b1.removeProduct("Phone");
        b1.buy();
        b2.buy();
        b4.buy();
    }
}
