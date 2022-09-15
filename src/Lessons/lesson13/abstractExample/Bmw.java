package Lessons.lesson13.abstractExample;

public class Bmw extends Car {

    @Override
    String maxSpeed() {
        return null;
    }

    @Override
    void drive() {

    }

    @Override
    void brake() {

    }

    public void aboutBmw() {
        System.out.println("This is BMW");
        System.out.print("Wheels count ");
        countWheels();
    }
}
