package com.hyungjunn.initializatioin;

public class InitializingFields {

    static int count;

    static {
        count++;
        System.out.println("This is a static block");
    }

    {
        count++;
        System.out.println("This is a instance block");
    }

    public InitializingFields() {
        System.out.println("This is a Constructor");
    }

}
