package Lessons.lesson14.exceptions.myExeption;

public class MyExceptionDemo {

    public static void main(String[] args) {
        try {
            compute(9);
            compute(11);
        } catch (MyException e) {
            System.err.print("Перехваченное исключение " + e);
        }
        System.out.println();
        System.out.println("Дальнейший ход выполнения в main");
    }

    public static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute c цыфрой " + a);
        if (a > 10) {
            throw new MyException(a, "trouble here");
        }
        System.out.println("Нормальное завершение программы");
    }
}
