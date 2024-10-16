package com.tss.wicp;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String n) {
        if (n.isEmpty()) {
            return 0;
        }

        return Arrays.stream(DelimiterStrategyFactory.getDelimiterStrategy(n).split(n))
                .mapToInt(Integer::parseInt)
                .peek(num -> {
                    if (num < 0) {
                        throw new IllegalArgumentException("Negative numbers not allowed: " + num);
                    }
                })
                .sum();
    }
}
