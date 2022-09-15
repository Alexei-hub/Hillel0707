package Lessons.lesson8;

public class PolimorfizmOverload {

    public static void main(String[] args) {
        int a = 100;
        double b = 1.1;
        String c = "Alex";

        add();
        add(a, a);
        add(b, b);
        add(c, a);

        add(6, 7);
        add("Max", 90);

        print("Alex");
        print("Alex", 33);
    }


    public static void add() {
        System.out.println("Hello");
    }

    public static void add(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    public static void add(int num, int num1, int num2) {
        int e = num + num1 + num2;
        System.out.println(e);
    }


    public static void add(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    public static void add(String a, int b) {
        System.out.println(a + " " + b);
    }

    public static void print(String name) {
        System.out.println(name);
    }

    public static void print(String name, int age) {
        System.out.println(name + " " + age);
    }
}
