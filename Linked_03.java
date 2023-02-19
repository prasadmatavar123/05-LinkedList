public class Linked_03 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println(head.data);
        System.out.println(temp1.data);
        System.out.println(temp2.data);
    }
    
}
