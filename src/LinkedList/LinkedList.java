package LinkedList;
import LinkedList.Node;

public class LinkedList {

    Node head = null;

    //Inserting at the start

    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(head);
        head=newNode;
    }

    //Inserting at the end

    public void insertAtEnd(int data){
        Node node =new Node();
        node.setData(data);
        if(head!=null) {
            Node nextNode = head.getNext();
            Node perviousNode = new Node();
            while (nextNode != null) {
                perviousNode = nextNode;
                nextNode = nextNode.getNext();
            }
            perviousNode.setNext(node);
        }else{
            head.setNext(node);
        }



    }

    //Looping Linkedlist nodes

    public void loopLinkedList(){
        Node node = head;
        do{
            System.out.println(node.getData());
            node =node.getNext();
        }while(node!=null);
    }
}
