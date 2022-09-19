package Lessons.lesson17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args) {
        String[] a = {"красный", "синий", "зелёный" };
        List<String> list = Arrays.asList(a);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);


        List<Integer> list2 = Arrays.asList(1, 4, 5, 6, 8, 8, 8);
        System.out.println(Collections.max(list2));
        System.out.println(Collections.min(list2));

        System.out.println(Collections.frequency(list2, 8));
        System.out.println(Collections.frequency(list2, 1));
    }
}
