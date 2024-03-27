public class DeleteNodesWithGreaterValueOnRight {
    public void deleteNodesWithGreaterValueOnRight(CreateDLL list) {
        // Check if the list is empty or has only one element
        if (list.head == null || list.head.next == null) {
            return;
        }
        
        Node curr = list.head;

        while (curr.next != null) {
            curr = curr.next;
        }
        Node tail = curr;
        curr = curr.prev;
        
        while (curr != null) {
            if (curr.data < tail.data) {
                // Deletion needed
                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                }
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
                if (curr == list.head) {
                    list.head = curr.next;
                }
            } else {
                tail = curr;
            }
            curr = curr.prev;
        }
    }
}
