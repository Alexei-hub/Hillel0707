package Lessons.lesson17.ComparableExmpl;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.year == o2.year) {
            return 0;
        } else if (o1.year < o2.year) {
            return 1;
        } else {
            return -1;
        }
    }
}
