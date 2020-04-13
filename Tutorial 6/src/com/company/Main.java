package com.company;
import java.math.BigDecimal;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
            Add s1 = new Add();
            Address f1 = new Address();
            Multiply b1 = new Multiply();
            BigDecimal num = new BigDecimal("50");
            BigDecimal num1 = new BigDecimal("10");
            ArrayList<Integer> a = new ArrayList();
            a.add(7);
            a.add(13);
            a.add(30);
            System.out.println(s1.add(6, 4));
            System.out.println(b1.multiply(2, 2, 2, 2));
            System.out.println(s1.add(a));
            System.out.println(b1.multiply(num, num1));
            System.out.println(f1.createAddress("India", "Mumbai", "400077", "local 2a street", 723));
        }
    }

