package com.hyungjunn.nestedclass.innerclass;

public class OuterClass {

    interface Animal {
        public void crying();

        public void running();
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
            private int speed = 10;
            private static final String cry = "MIAOW~~~ in localclass";
            @Override
            public void crying() {
                System.out.println(cry);
            }

            @Override
            public void running() {
                speed += 10;
                System.out.println("cat's speed: " + speed);
            }
        }
        Cat cat = new Cat();
        cat.crying();

        Animal dog = new Animal() {

            private int speed = 10;
            private static final String cry = "Baw Baw!!! in Anonymousclass";

            @Override
            public void crying() {
                System.out.println(cry);
            }

            @Override
            public void running() {
                speed += 10;
                System.out.println("dog's speed: " + speed);
            }
        };
        dog.crying();
        dog.running();
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass cat = outerClass.new InnerClass();
        cat.crying();
        outerClass.behave(); // 보일러플레이트 코드에서 메서드가 한개보다 많아질경우에 명확성이 떨어지게 된다
    }


}
