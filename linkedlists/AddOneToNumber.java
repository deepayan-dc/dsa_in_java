package linkedlists;

public class AddOneToNumber {
    public static Node addOne(Node head) {
        Node reverse = reverse(head);
        Node temp = reverse;
        int carry = 1;
        while (temp != null) {
            temp.data = temp.data + carry;
            if (temp.data > 9) {
                temp.data = temp.data % 10;
            } else carry = 0;
            if (carry == 0) break;
            temp = temp.next;
        }
        head = reverse(reverse);
        if (carry == 1) {
            Node node = new Node(carry, head);
            head = node;
        }
        return head;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        Node ans = addOne(head);
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
