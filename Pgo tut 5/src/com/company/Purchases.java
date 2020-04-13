package com.company;
import java.util.Arrays;

 public class Purchases {
        private int shirt1=shirt, Watch = Watch1,Phone=3;
        private static int  shirt= 3,Watch1 =4,Phone1 = 3;
        private int WatchPrice=0,shirtPrice=0,PhonePrice=0;
        private int  productNo= shirt + Watch + Phone;
        private String userAccount;
     private Purchases b2;
     private static int arraysize=10;
     private int shop =  Watch + shirt + Phone;
        int j=1;
        private Users type;
        private  String  []  productList= new String [arraysize];



        public Purchases(String ade, String watch) {
        }


        public Purchases(String userAccount, Purchases b2) {
            this.userAccount = userAccount;
            this.b2 = b2;
            this.type= Users.guest;
        }

        public Purchases(String userAccount, String Products) {
            this.userAccount = userAccount;
            this.type= Users.fullUser;
            if(productList.equals("Watch")){
                --Watch;
                WatchPrice+=700;
            }if(productList.equals("Phone")){
                --Phone;
                PhonePrice+=6000;
            }if(productList.equals("shirt")){
                --shirt;
                shirtPrice+=500;
            }
            for (int j =0; j < 1; j++){ this.productList[j] = productList;
                --shop;

                ++arraysize;
                break;
            }
        }
        public Purchases ( String ProductList, Purchases guest) {
            this.type= Users.guest;
            this.userAccount = guest.userAccount;
            for (int j = 0; j < 1; j++) {
                this.productList[j] = ProductList;
                --shop;
                ++arraysize;
                break;

            }
        }

     public Purchases(String NAME) {
     }


     public void addProduct(String   product) {

            if ( Watch==0 || shop==0) {
                System.out.println("out of stock");

            }else if(product.equals("Watch")){
                productList[j] = product;
                --Watch;
                WatchPrice+=700;
                ++arraysize;
                ++j;
                --shop;
            }
            if ( Phone ==0|| shop==0) {

                System.out.println("out of stock");

            }else if (product.equals("Phone")){
                productList[j] = product;
                --Phone;
                PhonePrice+=6000;
                ++arraysize;
                ++j;
                --shop;
            }
            if ( shirt==0 ||shop==0) {
                System.out.println("out of stock");


            }else if (product.equals("shirt")){
                productList[j] = product;
                --shirt;
                shirtPrice+=500;
                ++arraysize;
                ++j;
                --shop;
            }

        }



        public void removeProduct(String product){
            if(product.equals("Watch")){
                WatchPrice-=700;
                ++Watch;
            }if(product.equals("phone") ){
                PhonePrice-=600;
                ++Phone;
            }if(product.equals("shirt")){
                shirtPrice-=700;
                ++shirt;
            }
            for(int i=0; i<shop;i++){
                if(productList[i] == product ) {
                    productList[i]=null;

                    ++shop;
                }


            }
        }


        public void buy() {
            System.out.print(Arrays.toString(this.productList)+" ");
            System.out.print("$");
            System.out.println(shirtPrice+PhonePrice+WatchPrice+" "+this.type);
            System.out.println("total number of products in shop = "+productNo+" total number of product in shop after shopping = "+shop);
            System.out.println("initial number of Watch = "+Watch+" number of bags left ="+Watch+" " +
                    "initial number of Phone = "+Phone+" number of shoes left ="+Phone+" " +
                    "initial number of shirts = "+shirt1+" number of shirts left ="+shirt);
            System.out.println("\n");
        }

    }
