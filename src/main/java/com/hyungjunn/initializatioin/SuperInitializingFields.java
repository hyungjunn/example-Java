package com.hyungjunn.initializatioin;

public class SuperInitializingFields {

    static int count;

    static {
        count++;
        System.out.println("This is a super static block");
    }

    {
        count++;
        System.out.println("This is a super instance block");
    }

    public SuperInitializingFields() {
        count++;
        System.out.println("This is a Super Constructor");
    }

}
