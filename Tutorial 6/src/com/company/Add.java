package com.company;

import java.util.ArrayList;

public class Add {
    public Add() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(ArrayList a) {
        int sum = 0;

        for(int i = 0; i < a.size(); ++i) {
            sum += (Integer)a.get(i);
        }

        return sum;
    }
}
