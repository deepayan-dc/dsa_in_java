package linkedlists;

public class ReverseDLinkedList {
    public static DNode reverse(DNode head) {
        DNode dummy = null;
        DNode curr = head;
        while (curr != null) {
            curr = head.next;
            head.next= dummy;
            head.prev = curr;
            dummy = head;
            head = curr;
        }
        return dummy;
    }

    public static void main(String[] args) {
        DNode head = ArrayToDLinkedList.convert(new int[]{1, 2, 3, 4, 5});
        DNode.printList(head);
        System.out.println();
        head = reverse(head);
        DNode.printList(head);
    }
}
