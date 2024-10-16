package com.tss.wicp;

public class CustomDelimiterStrategy implements DelimiterStrategy {

    @Override
    public String[] split(String n) {
        int delimiterIndex = n.indexOf("\n");
        String customDelimiter = n.substring(2, delimiterIndex);
        String numbers = n.substring(delimiterIndex + 1);
        return numbers.split(customDelimiter);
    }
}
