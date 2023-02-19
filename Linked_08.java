import java.util.LinkedList;

public class Linked_08 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            tail.next = newNode;

            tail = newNode;

            tail.next = head;
        }
    }

    //Displays all the nodes in the list
    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Nodes are the circular list: ");
            do{
                System.out.print("" + current.data);
                current = current.next;
            }while(current!=head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        
        System.out.println(l1);
    }
    
}

// Circular Linked List

