package Lessons.lesson11;

public class E {

    public E() {
        System.out.println("Метод построения без параметров");
    }

    public E(int value) {
        System.out.println("Метод построения Е с параметром " + value);
    }

    public E(String name) {
        System.out.println("Метод построения Е с параметром " + name);
    }
}

class J extends E {
    public J() {
        System.out.println("J - построения без параметров");
    }

    public J(int value) {
        super("ac");
        System.out.println("Метод построения J с параметром " + value);
    }

}
