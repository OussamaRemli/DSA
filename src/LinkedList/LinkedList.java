package LinkedList;
import LinkedList.Node;

public class LinkedList {

    Node head = null;


    //Inserting at the start
    public void insertAtStart(Node node){
        node.setNext(head);
        head=node;
    }

    //Inserting at the end

    public void insertAtEnd(Node node){
        if(head!=null) {
            Node nextNode = head.getNext();
            Node perviousNode = new Node();
            while (nextNode != null) {
                perviousNode = nextNode;
                nextNode = nextNode.getNext();
            }
            perviousNode.setNext(node);
        }else{
            head=node;
        }
    }

    //Inserting after a given node

    public  void insertAfterGivenNode(Node previousNode , Node newNode){
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    //Looping Linkedlist nodes

    public void loopLinkedList(){
        Node node = head;
        do{
            System.out.println(node.getData());
            node =node.getNext();
        }while(node!=null);
    }


    //delete node from start
    public void deleteFromStart(){

        Node tmp = head.getNext();
        head.setNext(null);
        head = tmp;
    }

    //delete node from end
    public void deleteFromEnd(){
        if(head==null) return;
        Node nextNode =head;
        Node previousNode = new Node();
        while(nextNode.getNext()!=null){
            previousNode = nextNode;
            nextNode=nextNode.getNext();
        }
        previousNode.setNext(null);

    }
}
