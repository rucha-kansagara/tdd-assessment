package com.tss.wicp;

public class StringCalculator {

    public static int add(String n){
        if(n.isEmpty()){
            return 0;
        }
        return Integer.parseInt(n);
    }
}
