package Lessons.lesson7;

import java.util.Scanner;

public class Task {

    //Написать программу, в которой пользователю предлогается ввести в консоль текст "Привет меня зовут Максим".
    // Далее создать массив и записать каждое слово в отдельный элемент массива.
    // Вывести в консоль строку из элементов массива в обратном порядке используя формулу  n-i-1.
    //Каждое действие должно выполняться в отдельном методе! Т.е. В методе main только вызов пользовательских методов!
    public static void main(String[] args) {
        consoleOutput();
        String textFromScanner = getInputString();
        String[] arrAfterSplit = arrayFromStr(textFromScanner);
        String[] arrAfterReverse = reverseArray(arrAfterSplit);
        printArray(arrAfterReverse);
    }

    private static void printArray(String[] arr) {
        for (String array : arr) {
            System.out.print(array + " ");
        }
    }

    private static String[] reverseArray(String[] arrText) {
        String[] reversArr = arrText;

        String temp = null;
        int count = arrText.length;
        for (int i = 0; i < count / 2; i++) {
            temp = reversArr[count - i - 1];
            reversArr[count - i - 1] = reversArr[i];
            reversArr[i] = temp;
        }
        return reversArr;
    }

    private static String[] arrayFromStr(String str) {
        String[] arr = str.trim().split(" ");
        return arr;
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static void consoleOutput() {
        System.out.println("Введите какой-то текст");
    }


}
