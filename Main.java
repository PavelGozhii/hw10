package com.company;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1, 1);
        ComplexNumber complexNumber1 = new ComplexNumber(1, 1);
        System.out.println(complexNumber1.hashCode());
        System.out.println(complexNumber.equals(complexNumber1));

        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[]{40, 45, 50, 55, 60});
        System.out.println(asciiCharSequence);
        System.out.println(asciiCharSequence.subSequence(1, 3));
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(2));
    }
}
