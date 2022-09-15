package Lessons.lesson9.inkapsulation.Car;


import Lessons.lesson9.inkapsulation.Specification.Specific;

public class Bmw extends Specific {

    public static void main(String[] args) {
        Specific specific = new Specific();
        System.out.println(specific.getFuel());
        specific.setFuel("Electro");
        specific.setSpeed(200);


        System.out.println(specific.getFuel());
        System.out.println(specific.getSpeed());

        Specific specific2 = new Specific();
        System.out.println(specific2.getFuel());
    }
}
