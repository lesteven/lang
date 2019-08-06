public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        a.next = new Node(10);
        print(a);
    }
}
