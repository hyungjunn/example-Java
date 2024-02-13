package com.hyungjunn.nestedclass.innerclass;

public class OuterClass {

    interface Animal {
        public void crying();
    }

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
        class Cat implements Animal{
            private static final String cry = "MIAOW~~~ in localclass";
            @Override
            public void crying() {
                System.out.println(cry);
            }
        }
        Cat cat = new Cat();
        cat.crying();

        Animal dog = new Animal() {

            private static final String cry = "Baw Baw!!! in Anonymousclass";

            @Override
            public void crying() {
                System.out.println(cry);
            }
        };
        dog.crying();

    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass cat = outerClass.new InnerClass();
        cat.crying();
        outerClass.behave();
    }


}
