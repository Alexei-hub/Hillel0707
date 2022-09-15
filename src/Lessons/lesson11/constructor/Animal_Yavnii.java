package Lessons.lesson11.constructor;

public class Animal_Yavnii {

    public Animal_Yavnii() {

    }

    public Animal_Yavnii(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal_Yavnii(String name) {
        this.name = name;
    }

    private String name;
    private int age;

    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
