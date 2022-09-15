package Lessons.lesson5;

import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;

        System.out.println(twoDimArray[0][1]);
        System.out.println(twoDimArray[1][1]);

        //
        int[][] twoDimArray2 = {{2, 5, 7, 13}, {7, 4, 2}, {2, 3, 4, 7}};
        for (int i = 0; i < twoDimArray2.length; i++) {
            for (int j = 0; j < twoDimArray2[i].length; j++) {
                System.out.print(" " + twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }

        //
        int[][] twoDimArray3 = {{2, 5, 7, 13}, {7, 4, 2}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDimArray3));


        sayHello();

        mySum(3, 5);
        mySum(6, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        System.out.println(mySum2(3, 56));

        sayNameAndAge("Alex", 33);


        String name = "Hello, i am Alex";
        System.out.println(name.length());

        String text1 = "Hello";
        String text2 = " I am Maks";
        System.out.println(text1.concat(text2));


        String text3 = "    Hello world   ";
        String text4 = "    Hello world   ";
        System.out.println(text3);
        System.out.println(text4.trim());

        String text5 = "Hello i am Maks";
        boolean end1 = text5.endsWith("Maks");
        boolean end2 = text5.endsWith("Alex");
        System.out.println(end1);
        System.out.println(end2);


        String text6 = "Hello studenTs";
        System.out.println(text6.toUpperCase());
        System.out.println(text6.toLowerCase());

        String text7 = "Alex";
        String text8 = "Maks";
        System.out.println(text7.equals(text8));

        String text9 = "Alex, Hello";
        String text10 = "Alex";
        System.out.println(text9.contains(text10));


        String name2 = "Hello, i am Alex";
        System.out.println(name2.charAt(4));

        System.out.println(name2.indexOf("l"));
        System.out.println(name2.lastIndexOf("l"));

        System.out.println(name2.substring(5));
        System.out.println(name2.substring(2, 6));


        String name3 = "Hello, i am Maks";
        System.out.println(name3.replace("Maks", "Igor"));

        String name4 = "Hello, i am Maks, i am 34";
        System.out.println(name4.replaceAll(",", "!"));

        String text11 = "Hello people";
        char[] arr = text11.toCharArray();
        System.out.println(arr[2]);

        char[] arrChar = {'H', 'e', 'l', 'l', 'o'};
        String temp = null;
        temp = temp.copyValueOf(arrChar);
        System.out.println(temp);



    }

    static void sayHello() {
        System.out.println("Hello world!");
    }

    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }

}
