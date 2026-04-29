package linkedlists;

public class LengthOfLoop {
    public static int getLength(Node head) {
        int length = 0;
        Node i = head;
        Node j = head;
        while (j != null && j.next != null) {
            i = i.next;
            j = j.next.next;
            if (i == j) break;
        }
        if (j == null || j.next == null) return 0;
        i = i.next;
        j = j.next.next;
        length++;
        while (i != j) {
            length++;
            i = i.next;
            j = j.next.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        System.out.println(getLength(head));
    }
}
