package Lessons.lesson13.intefaceExample;

public interface Parts {

    void hoodOrder();

    void wheelsOrder();

    void filtersOrder();

     default void countWheels(){
        System.out.println("4");
    }
}
