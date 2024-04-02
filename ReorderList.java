public class ReorderList {

    public void reorderList(CreateDLL list) {
        if (list.head == null || list.head.next == null) return;

        // Step 1: Find the middle of the list
        Node slow = list.head, fast = list.head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        Node secondHalf = reverse(slow.next);
        slow.next = null; // Split the list into two halves

        // Step 3: Merge the two halves
        Node firstHalf = list.head;
        while (secondHalf != null) {
            Node temp1 = firstHalf.next, temp2 = secondHalf.next;
            
            firstHalf.next = secondHalf;
            secondHalf.prev = firstHalf; // Update prev pointer for doubly linked list
            
            if (temp1 == null) break; // In case of odd number of elements
            
            secondHalf.next = temp1;
            temp1.prev = secondHalf; // Update prev pointer for doubly linked list

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }

    private Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        return prev;
    }
}
