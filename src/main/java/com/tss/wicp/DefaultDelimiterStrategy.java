package com.tss.wicp;

public class DefaultDelimiterStrategy implements DelimiterStrategy {

    @Override
    public String[] split(String numbers) {
        String defaultDelimiter = ",|\n";
        return numbers.split(defaultDelimiter);
    }
}
