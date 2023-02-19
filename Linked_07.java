import java.util.LinkedList;

public class Linked_07 {
    public static void main(String[] args) {
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        
        l3.addFirst(600);
        l3.addLast(700);
        l3.addLast(800);
        l3.addLast(900);
        l3.addLast(1000);
        
        l3.remove(2);
        System.out.println(l3);
    }
}

//Remove index