package com.tss.wicp;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String n) {
        if (n.isEmpty()) {
            return 0;
        }
        return Arrays.stream(n.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
