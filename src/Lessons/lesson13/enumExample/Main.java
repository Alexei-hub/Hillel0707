package Lessons.lesson13.enumExample;

public class Main {
    public static void main(String[] args) {

        for (Country country : Country.values()) {
            System.out.println(country + " , " + country.currency);
        }
    }
}
