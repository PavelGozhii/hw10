package com.company;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        ComplexNumber complexNumber = (ComplexNumber) o;
        if (complexNumber != null) {
            return this.re == complexNumber.re && this.im == complexNumber.im;
        }
        return false;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + re);
        result = (int) ((prime * result) + im);
        return result;
    }
}