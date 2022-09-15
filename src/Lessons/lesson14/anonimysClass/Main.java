package Lessons.lesson14.anonimysClass;

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.displayMessage(new Message() {
            @Override
            public String sayHello() {
                return "Привет";
            }
        });
    }

}
