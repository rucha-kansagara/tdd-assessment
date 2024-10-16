package com.tss.wicp;

public class DelimiterStrategyFactory {

    public static DelimiterStrategy getDelimiterStrategy(String input) {
        if (input.startsWith("//")) {
            return new CustomDelimiterStrategy();
        } else {
            return new DefaultDelimiterStrategy();
        }
    }
}
