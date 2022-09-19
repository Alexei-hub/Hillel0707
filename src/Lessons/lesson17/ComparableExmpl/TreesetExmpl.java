package Lessons.lesson17.ComparableExmpl;

import java.util.TreeSet;

public class TreesetExmpl {

    public static void main(String[] args) {
        CarComparator carComparator = new CarComparator();
        TreeSet<Car> cars = new TreeSet<Car>(carComparator);

        cars.add(new Car("BMW", 23));
        cars.add(new Car("HONDA", 5));
        cars.add(new Car("TOYOTA", 4));
        cars.add(new Car("TESLA", 7));

        for (Object car : cars) {
            System.out.println(car);
        }
    }

}
