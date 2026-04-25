package linkedlists;

public class ArrayToDLinkedList {
    public static DNode convert (int[] arr) {
        DNode head = new DNode(arr[0]);
        DNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            DNode newNode = new DNode(arr[i], temp, null);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        DNode head = convert(arr);
        DNode.printList(head);
    }
}
