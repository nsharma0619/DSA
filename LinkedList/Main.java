public class Main {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegging(new ListNode(3));
        ll.insertAtEnd(new ListNode(9));
        ll.insertAtEnd(new ListNode(8));
        ll.insertAtBegging(new ListNode(0));
        ll.insert(new ListNode(1), 4);
        ll.removeFromBegin();
        System.out.println(ll.toString());
    }
}
