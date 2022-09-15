package Lessons.lesson14.outerClasses;

public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display_Inner();

        OuterLocalMethod outerLocalMethod = new OuterLocalMethod();
        outerLocalMethod.my_Method();
    }
}
