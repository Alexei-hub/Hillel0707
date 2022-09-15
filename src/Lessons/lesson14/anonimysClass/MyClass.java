package Lessons.lesson14.anonimysClass;

public class MyClass {

    public void displayMessage(Message m) {
        System.out.println(m.sayHello() +
                " , это пример анонимного внутренего класса в качестве аргумента");
    }
}
