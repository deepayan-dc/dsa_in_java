package linkedlists;

public class DInsertionDeletion {
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
    public static DNode deleteHead(DNode head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }
    public static DNode deleteTail(DNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }
    public static DNode deleteAtKthPosition(DNode head, int k) {
        if (head == null) return null;
        if (k == 1) return deleteHead(head);
        int count = 0;
        DNode temp = head;
        while (temp != null){
            count++;
            if (count == k) {
                if (temp.next == null) return deleteTail(head);
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.prev = null;
                temp.next = null;
            }
            temp = temp.next;
        }
        return head;
    }

    public static DNode insertAtHead(DNode head, int data) {
        DNode newNode = new DNode(data, null, head);
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static DNode insertAtTail(DNode head, int data) {
        DNode newNode = new DNode(data);
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    public static DNode insertAtMiddle(DNode head, int data, int k) {
        DNode newNode = new DNode(data);
        if (k == 1) return insertAtHead(head, data);
        int count = 0;
        DNode temp = head;
        while (temp != null) {
            count++;
            if (count == k) {
                if (temp.next != null) return insertAtTail(head, data);
                temp.prev.next = newNode;
                newNode.next = temp;
                newNode.prev = temp.prev;
                temp.prev = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        DNode head = convert(arr);
        DNode temp = insertAtMiddle(head, 4, 6);
        DNode.printList(temp);
    }
}
