package Lessons.lesson15;

import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Alex");
        name.add("Maks");
        name.add("Jeka");

       name.remove("Alex");

        System.out.println(name.get(0));

        name.remove(0);

        System.out.println(name.get(0));

    }
}
