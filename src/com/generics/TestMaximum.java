package com.generics;

public class TestMaximum {
    float x, y, z;

    public TestMaximum(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // checking max of three integers
    public static Float testMaximum(Float x, Float y, Float z) {
        Float max = x;// Initializing x as greater
        if (y.compareTo(max) > 0)
            max = y;// as of now y is greater

        if (z.compareTo(max) > 0)
            max = z;// now z is greater
        printMax(x, y, z, max);
        return max;

    }

    public static void printMax(Float x, Float y, Float z, Float max) {
        System.out.printf("the max of %s , %s and %s is %s\n", x, y, z, max);

    }
}
