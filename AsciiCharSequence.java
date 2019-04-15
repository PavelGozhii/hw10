package com.company;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] asciiCodes;

    public AsciiCharSequence(byte[] asciiCodes) {
        this.asciiCodes = asciiCodes;
    }

    @Override
    public int length() {
        return asciiCodes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) asciiCodes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(asciiCodes, start, end));
    }

    @Override
    public String toString() {
        return new String(asciiCodes);
    }
}
