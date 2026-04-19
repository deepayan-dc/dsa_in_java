package linkedlists;

public class ArrayToLinkedList {
    public static Node convert (int[] arr) {
        Node head = new Node (arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node (arr[i]);
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node node = convert (arr);
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
}
