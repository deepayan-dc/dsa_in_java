package linkedlists;

class Node {
    int data;
    Node next;
    public Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node (int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        Node x = new Node (1);
        System.out.println(x.data);
        Node y = new Node (3, x);
        System.out.println(y.data);
        System.out.println(y.next.data);
    }
}
