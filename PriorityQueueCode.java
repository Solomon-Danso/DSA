import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class PriorityQueueCode {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        Queue<String> sQueue = new PriorityQueue<>();

        sQueue.offer("C");
        sQueue.offer("D");
        sQueue.offer("A");
        sQueue.offer("B");
        sQueue.offer("C+");

        while (!sQueue.isEmpty()) {
            System.out.println(sQueue.poll());
        }







    }
}
