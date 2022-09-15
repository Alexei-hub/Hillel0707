package Lessons.lesson8;

public class Lesson8 {

    int time = 3600; // свойство или поле

    public static void main(String[] args) {
        int n = 9;
        int k = 4;
        int m = n % k;
        System.out.println(m);

        // 9 - 4 = 5
        // 5 - 4 = 1

        int iYear, twoDigit;
        iYear = 2013;
        twoDigit = iYear % 100;
        System.out.println(twoDigit);
    }

    public boolean sayHello() { // метод
        System.out.println("Hello world");
        return true;
    }

    //Принципы ООП
    //Наследование
    //Полиморфизм
    //Инкапсуляция
}
