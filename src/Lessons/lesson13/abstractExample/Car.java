package Lessons.lesson13.abstractExample;


abstract class Car  {

     String model;
     int year;


     public Car(){

     }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    void countWheels() {
        System.out.println("4");
    }
}
