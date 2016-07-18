import java.io.*;
public class DeletingNode {

    public static void main(String[] args) {
        Node n = new Node(3);
        n.appendToTail(11);
        n.appendToTail(12);
        n.appendToTail(13);
        n.appendToTail(14);
        n.appendToTail(15);
        n.imprimir();
        deleting(n,11);
        n.imprimir();
    }

    public static Node deleting(Node head, int d){
        Node n = head;
        if(n.data == d){
            return head.next;
        }
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

}
