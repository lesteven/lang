import java.util.*;

public class Pq {

    public static void main(String[] args) {
        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(10,
                (a, b) -> Integer.compare(b,a));
        pq.add(10);
        pq.add(3);
        pq.add(5);
        pq.add(99);
        System.out.println(pq.peek());

        // min heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(12);
        pq2.add(24);
        System.out.println(pq2.peek());
    }
}
