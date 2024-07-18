

import LinkedList.*;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        linkedList.insertAtStart(node1);
        linkedList.insertAtStart(node2);
        linkedList.insertAtEnd(node3);
        linkedList.insertAfterGivenNode(node1,node4);
//        linkedList.loopLinkedList();
        linkedList.deleteFromEnd();
        linkedList.loopLinkedList();
    }
}