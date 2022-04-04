package com.rooftop;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class Main {

    public static final String HOLA = "Hola";
    public static final String BCONSTANT = "b";

    public static void main(String[] args) {
        Sample s = new DefaultSample();
        s.run();
    }

    private static int generateValues() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
}
