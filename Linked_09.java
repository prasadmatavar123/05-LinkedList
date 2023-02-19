// import java.util.LinkedList;

public class Linked_09 {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){

            head = tail = newNode;

            head.prev = null;

            tail.next = null;

            tail.next = null;
        }
        else{
            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

            tail.next = null;
        }

    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list");
        while(current!=null){
            System.out.println(current.data + "");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Linked_09 l2 = new Linked_09();
        l2.addNode(10);
        l2.addNode(20);
        l2.addNode(30);
        l2.addNode(40);
        l2.addNode(50);

        l2.display();
        
    }
    
}
