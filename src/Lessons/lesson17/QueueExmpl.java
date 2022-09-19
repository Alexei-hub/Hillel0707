package Lessons.lesson17;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExmpl {

    public static void main(String[] args) {
        Queue<Boolean> queue = new PriorityQueue<>();

        queue.add(true);
        queue.add(false);
        queue.add(true);


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
