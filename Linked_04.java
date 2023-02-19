public class Linked_04 { 
    static class Node{
        String data ;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node("Abhay");
        Node temp1 = new Node("Rohit");
        Node temp2 = new Node("Bijendra");
        Node temp3 = new Node("Aman");
        
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        System.out.println(head.data);
        System.out.println(temp1.data);
        System.out.println(temp2.data);
        System.out.println(temp3.data);
    }
    
}
