package Lessons.lesson6;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        String text = "Hello i am MAks";

        if (text.equalsIgnoreCase("Hello i am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }

        String text2 = "Hello i am Alex";
        System.out.println(text2.indexOf("l"));
        System.out.println(text2.lastIndexOf("l"));

        int num = 1256341;
        String temp = String.valueOf(num);
        System.out.println(temp);

        String num2 = "45463";
        int temp2 = Integer.parseInt(num2);
        System.out.println(temp2);

        double num3 = 5.4999;
        System.out.println(Math.round(num3));
        System.out.println(Math.floor(num3));
        System.out.println(Math.ceil(num3));

        String[] myArr = {"Привет", "меня", "зовут", "Макс"};
        reverseArray(myArr);

        countWordsExample();
    }

    public static void reverseArray(String[] arr) {
        int n = arr.length;

        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (String a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void countWords() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в консоль");

        String input = scanner.nextLine();

        int count = 0;


        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void countWordsExample() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в консоль");

        String str = scanner.nextLine();

        int count = 0;
        System.out.println(str.length());
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.' && str.charAt(i + 1) != '.') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


