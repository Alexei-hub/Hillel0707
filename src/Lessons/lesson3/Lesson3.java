package Lessons.lesson3;

import Lessons.lesson2.Main;
import Lessons.lesson8.Cat;

import java.util.Scanner;

import static java.lang.Math.*;


public class Lesson3 {

    public static void main(String[] args) {

//        int a = 9;
//        System.out.println(sqrt(a));
//
//        int b = 8;
//        int i = 16;
//        System.out.println(max(b, i));
//
//        int k = 8;
//        int l = 16;
//        System.out.println(max(b, i));
//
//
//        System.out.println("Введите любое целое число от 1 до 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int result = number + 2;
//        System.out.println("Вы ввели число: " + result);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите два целых числа: ");
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        System.out.println(number1 + number2);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите две фразы: ");
//        String phrase = scanner.nextLine();
//        String phrase2 = scanner.nextLine();
//        System.out.println(phrase + " " + phrase2);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите фразу: ");
//        String phrase = scanner.next();
//        System.out.println(phrase);

//        System.out.println("Введите любое дробное число: ");
//        Scanner scanner = new Scanner(System.in);
//        double number = scanner.nextDouble();
//        System.out.println("Вы ввели число: " + number);


//        System.out.println("Введите любое целое число от 1 до 10: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        System.out.println("Введите любой текст: ");
//        Scanner scannerText = new Scanner(System.in);
//        String text = scannerText.nextLine();
//
//        System.out.println(text + " " + number);


//        byte a = 15;
//        int b = a;
//        System.out.println(b);
//
//        int y = 148;
//        byte k = (byte) y;
//        System.out.println(k);

//        double a = 11.855;
//        int b = (int) a;
//        System.out.println(b);

//        int number1 = 6;
//        int number2 = 6;
//
//        if (number1 > number2) {
//            System.out.println("Первое число больше второго");
//        } else if (number1 < number2) {
//            System.out.println("Первое число меньше второго");
//        } else {
//            System.out.println("Числа равны");
//        }

        System.out.println("Введите 2 целых числа: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;

        System.out.println("Введите имя: ");
        Scanner scannerText = new Scanner(System.in);
        String name = scannerText.nextLine();

        System.out.println(name + " " + result);

        Main main = new Main();
        main.newMethod();

    }
}
