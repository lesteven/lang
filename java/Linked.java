import java.util.*;


public class Linked {

    public static void print(Deque<Integer> list) {
        for (Integer each : list) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
    // add always return true, and throws exception when cant add 
    // offer returns false if cant add
    public static void main(String[] args) {
        // linkedlist 
        Deque<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(4);
        System.out.println("Linked List");
        print(list);
        System.out.println();

        // stack
        Deque<Integer> stack = new LinkedList<>();
        stack.addFirst(3);
        stack.addFirst(23);
        stack.addFirst(14);
        System.out.println("Stack");
        print(stack);
        stack.pollFirst();
        print(stack);
        System.out.println();

        // queue
        Deque<Integer> q = new LinkedList<>();
        q.addLast(2);
        q.addLast(5);
        q.addLast(8);
        System.out.println("Queue");
        print(q);
        q.pollFirst();
        print(q);
        System.out.println();
    }
}
