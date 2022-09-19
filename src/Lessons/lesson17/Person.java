package Lessons.lesson17;

public class Person {

    private String fullName;
    private int age;
    private boolean retired;

    public Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName of person='" + fullName + '\'' +
                ", age=" + age +
                ", retired=" + retired +
                '}';
    }
}
