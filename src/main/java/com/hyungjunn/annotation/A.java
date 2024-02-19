package com.hyungjunn.annotation;

class A {

    @Deprecated
    static void methodFrist() {
        System.out.println("This is first method");
    }

    void methodSecond() {
        System.out.println("This is second method");
    }

}

class B extends A {
    @Override
    void methodSecond() {
        super.methodSecond();
    }
}

class Main {

    public static void main(String[] args) {
        A.methodFrist();

    }
}

