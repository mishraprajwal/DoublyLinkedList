public class SwapNodesInPair {
    public void swapNodes(CreateDLL list) {
        if (list.head == null || list.head.next == null) {
            return;
        }
    
        list.head = list.head.next;
    
        Node current = list.head.prev;
    
        while (current != null && current.next != null) {
            Node node1 = current;
            Node node2 = current.next;
            Node nextPair = node2.next;
    
            node1.next = nextPair;
            node2.next = node1;
            if (nextPair != null) {
                nextPair.prev = node1;
            }
            
            node2.prev = node1.prev;
            node1.prev = node2;
            
            if (node2 == list.head) {
                node2.prev = null;
            } else {
                node2.prev.next = node2;
            }
    
            current = nextPair;
        }
    }
    
}
