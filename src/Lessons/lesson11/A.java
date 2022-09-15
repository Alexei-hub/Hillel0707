package Lessons.lesson11;

public class A {
    int value = 10;

}

class B extends A {
    int value = 20;

    public void print() {
        int value = 30;
        System.out.println(value);// 30
        System.out.println(this.value); // 20
        System.out.println(super.value);// 10
    }
}
