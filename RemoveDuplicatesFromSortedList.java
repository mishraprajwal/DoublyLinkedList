public class RemoveDuplicatesFromSortedList {
    public void removeDuplicatesFromSortedList(CreateDLL list) {
        if (list.head == null || list.head.next == null) {
            return;
        }

        Node current = list.head;
        
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                int duplicateValue = current.data;
 
                while (current != null && current.data == duplicateValue) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        list.head = current.next;
                    }
                    
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    
                    current = current.next;
                }
                
            } else {
                current = current.next;
            }
        }
    }
}

