package com.company;

import java.math.BigDecimal;

public class Multiply {
    public Multiply() {
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int b, int a, int c, int d) {
        return a * b * this.multiply(c, d) * c * d;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
