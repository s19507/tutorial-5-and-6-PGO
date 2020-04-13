package com.company;
import java.util.ArrayList;
public class Product {
    private String name;
    private ArrayList<String> products = new ArrayList<>();

    public Product() {

    }


    public Product(String name){

        this.name=name;
    }

    public Product(String name, String products) {
        this.name = name;
        this.products.add(products);
    }

    public String getName() {
        return name;
    }

    public void renameProduct(String name) {
        this.name = name;
        System.out.println("\nProduct name changed  to "+ this.name);
    }

    public  void getProducts() {
        System.out.println("\nthis is the product you added  "+products+ " ") ;
    }

    public void addProducts(String product) {
        this.products.add(product);

    }

    public void removeProducts(String product) {
        this.products.remove(product);
        System.out.println("\nproduct "+product+" is removed from category-"+name+"   new product list in "+name +" category "+products);
        System.out.println( "\nis category "+ this.name+ " empty  "+ this.products.isEmpty());
    }

}
