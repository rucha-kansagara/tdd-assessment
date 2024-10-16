package com.tss.wicp;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String n) {
        if (n.isEmpty()) {
            return 0;
        }
        StringBuilder negativeNumbers = new StringBuilder();
        int sum = Arrays.stream(DelimiterStrategyFactory.getDelimiterStrategy(n).split(n))
                .mapToInt(Integer::parseInt)
                .peek(num -> {
                    if (num < 0) {
                        negativeNumbers.append(num).append(",");
                    }
                })
                .sum();
        if (negativeNumbers.length() > 0) {
            negativeNumbers.setLength(negativeNumbers.length() - 1);
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }
        return sum;
    }
}
