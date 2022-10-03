package Lessons.lesson17.ComparableExmpl;

public class Car {

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.model + " " + this.year;
    }

}
