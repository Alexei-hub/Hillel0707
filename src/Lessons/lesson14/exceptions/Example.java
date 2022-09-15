package Lessons.lesson14.exceptions;

public class Example {

    public static void main(String[] args) {
        int a = 5;

        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!!!");
        }

        System.out.println("Программа продолжает выполнять свою работу");
    }
}
