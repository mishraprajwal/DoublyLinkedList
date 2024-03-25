import java.util.Scanner;

public class DoublyLinkedList {
    
    public static void main(String[] args) {
        CreateDLL list = new CreateDLL();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the linked list:");
            int n = scanner.nextInt();

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                list.createDoublyLL(element);
        }

        System.out.println("The linked list is:");
        list.display();

        DeleteNodesWithGreaterValueOnRight greaterValueOnRight = new DeleteNodesWithGreaterValueOnRight();
        greaterValueOnRight.deleteNodesWithGreaterValueOnRight(list);

        System.out.println("The linked list is:");
        list.display();



        }
    }

}
