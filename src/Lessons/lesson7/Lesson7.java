package Lessons.lesson7;

public class Lesson7 {

    public static void main(String[] args) {

        int month = 5;

        String monthString = null;
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            default:
                monthString = "Я не знаю такого месяца";
        }
        System.out.println(monthString);


        double a = Math.random();
        System.out.println(a);

        // (Math.random() * (b - a)) + a

        //[0,3)
        // (Math.random() * (3 - 0)) + 0 = Math.random() * 3
        double b = Math.random() * 3;
        System.out.println(b);

        //[2,3)
        // (Math.random() * (3 - 2)) + 2 = Math.random() * 1 + 2 =  Math.random() + 2
        double c = Math.random() + 2;
        System.out.println(c);

        //[0, 2]
        int m = (int) (Math.random() * 3);
        System.out.println(m);

        String text = "Привет меня зовут Максим";
        String[] words = text.trim().split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        for (String temp : words) {
            System.out.println(temp);
        }

        System.out.println(words.length);

        arrMax();
    }

    //Написать программу, в которой создаётся целочисленный
    //массив из 8 случайных чисел из диапозона  [0, 99]
    //и выводит максимальный элемент массива в консоль.

    public static void arrMax() {
        int max = 0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
