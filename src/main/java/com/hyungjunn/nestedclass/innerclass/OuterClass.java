package com.hyungjunn.nestedclass.innerclass;

public class OuterClass {

    // innerclass
    class InnerClass {
        private static final String cry = "Miaow~~~ in inner class";

        private void crying() {
            System.out.println(cry);
        }
    }

    void behave() {

        String cry = "miaow~~~ in localclass enclosing class";

        // localclass
        class Cat {
            private static final String cry = "MIAOW~~~ in localclass";
            private void crying() {
                System.out.println(cry);
            }
        }
        Cat cat = new Cat();
        cat.crying();


    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass cat = outerClass.new InnerClass();
        cat.crying();
        outerClass.behave();
    }


}
