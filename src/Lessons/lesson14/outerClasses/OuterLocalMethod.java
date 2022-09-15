package Lessons.lesson14.outerClasses;

public class OuterLocalMethod {

    void my_Method() {
        int num = 888;

        class MethodInner_Demo {
            // Локальный метод внутренего класса
            public void print() {
                System.out.println("Это метод внутренего класса " + num);
            }
        }

        class SecondInner_Demo {
            public void num() {
                System.out.println(2 + 2);
            }
        }

        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();

        SecondInner_Demo secondInner_demo = new SecondInner_Demo();
        secondInner_demo.num();
    }
}
