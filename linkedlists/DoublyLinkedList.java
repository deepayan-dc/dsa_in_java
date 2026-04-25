package linkedlists;

class DNode {
    int data;
    DNode next;
    DNode prev;
    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    DNode(int data, DNode prev, DNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public static void printList(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DNode x = new DNode(1);
        DNode y = new DNode(2);
        DNode z = new DNode(3, y, x);
        System.out.println(z.data);
        System.out.println(z.next.data);
        System.out.println(z.prev.data);
    }
}
