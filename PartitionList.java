public class PartitionList {

    public void partitionList (CreateDLL list, int x) {
        Node current = list.head;
        Node lessHead = new Node(0);
        Node greaterHead = new Node(0);
        Node lessTail = lessHead;
        Node greaterTail = greaterHead;

        while (current != null) {
            if (current.data < x) {
                lessTail.next = current;
                lessTail = lessTail.next;
            } else {
                greaterTail.next = current;
                greaterTail = greaterTail.next;
            }
            current = current.next;
        }

        lessTail.next = greaterHead.next;
        greaterTail.next = null; // End the list

        Node temp = lessHead.next; // Skip the dummy node
        Node prev = null;
        while (temp != null) {
            temp.prev = prev;
            prev = temp;
            temp = temp.next;
        }
        list.head = lessHead.next;
    }
}
