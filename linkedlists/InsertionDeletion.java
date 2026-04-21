package linkedlists;

public class InsertionDeletion {
    public static Node convert (int[] arr) {
        Node head = new Node (arr[0]);
        Node curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node (arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node deleteHead(Node head){
        if (head == null) return head;
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head){
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteKthElement(Node head, int k){
        if (head == null) return head;
        if (k == 1) return deleteHead(head);
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null){
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteElement(Node head, int element){
        if (head == null) return head;
        if (head.data == element) return deleteHead(head);
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data == element) {
                prev.next = prev.next.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node insertAtFirst(Node head, int data){
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtLast(Node head, int data){
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertAtKthPosition(Node head, int data, int k){
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            return head;
        }
        if (k==1) return insertAtFirst(head, data);
        int count = 0;
        Node temp = head;
        Node prev  = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = newNode;
                newNode.next = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert(arr);
        print(insertAtKthPosition(head, 2, 3));
    }
}
