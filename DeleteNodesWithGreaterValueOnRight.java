public class DeleteNodesWithGreaterValueOnRight {
    public void deleteNodesWithGreaterValueOnRight (CreateDLL list) {
        if (list.head == null || list.head.next == null) {
            System.out.println("The list is empty.");
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            Node tail = curr;
            curr = curr.prev;
            while (curr != null) {
                if (curr.data < tail.data) {
                    Node temp = curr.prev;
                    if (temp != null) {
                        temp.next = curr.next;
                    }

                    if (curr.next != null) {
                        curr.next.prev = temp;
                    }
                } else {
                    tail = curr;
                }
                curr = curr.prev;
            }

            while (list.head != null && list.head.prev != null) {
                list.head = list.head.prev;
            }
        }
    } 
}
