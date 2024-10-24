package com.tss.wicp;

import java.util.Arrays;

public class StringCalculator {

    public static int add(String n) {
        if (n.isEmpty()) {
            return 0;
        }
        StringBuilder negativeNumbers = new StringBuilder();


       String[] sum = DelimiterStrategyFactory.getDelimiterStrategy(n).split(n);
       Arrays.stream(sum).mapToInt(Integer::parseInt)
               .forEach(i ->{
                    if(i<0){
                        negativeNumbers.append(i).append(",");
                    }
               });
        if (negativeNumbers.length() > 0) {
            negativeNumbers.setLength(negativeNumbers.length() - 1);
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }
       int ans = Arrays.stream(sum).mapToInt(Integer::parseInt).sum();

        return ans;
    }
}
