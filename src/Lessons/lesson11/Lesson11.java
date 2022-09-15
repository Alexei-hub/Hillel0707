package Lessons.lesson11;

public class Lesson11 {

    public static void main(String[] args) {
        int mouse;
        int weight;
        mouse = 5;
        weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Error");
        }

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно кормить кота");
        } else {
            System.out.println("Error");
        }


        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);


        int x = 1;
        int y = 1;
        int z = 0;
        //
        if ((x++ >= 1 && y++ > 1)) {
            z = x + y;
        }
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);

        System.out.println("------");
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i);
        }

        System.out.println("------");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}
