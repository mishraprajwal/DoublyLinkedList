public class RotateList {
    public void rotateListByK (CreateDLL list, int k) {
        if (list.head == null || list.head.next == null) {
            return;
        }

                Node temp = list.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                Node tail = temp;
                temp = temp.prev;
                Node curr = tail;
                Node fake = list.head;
                if (k == 0) {
                    return;
                }

                    for (int i=0; i < k; i++) {
                        temp.next = tail.next;
                        tail.prev = fake.prev;
                        tail.next = fake;
                        tail.next.prev = tail;
                        curr = tail.next;
                        tail = temp;
                        temp = temp.prev;
                        fake = fake.prev;
                    }

        
                        list.head = curr.prev;

    



    }
}
