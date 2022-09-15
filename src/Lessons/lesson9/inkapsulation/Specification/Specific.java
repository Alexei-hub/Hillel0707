package Lessons.lesson9.inkapsulation.Specification;

public class Specific {

    private String fuel = "petrol";
    private int speed;

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

}
