import java.util.*;
public class Ejercicio1 {

    public static void main(String[] args) {
        Node n = new Node(3);
        n.appendToTail(11);
        n.appendToTail(11);
        n.appendToTail(11);
        n.appendToTail(11);
        n.appendToTail(11);
        n.imprimir();
        removerRepetidos(n);
        n.imprimir();
	}

	public static void removerRepetidos(Node n){
		Hashtable<Integer,Boolean> dicc =new Hashtable<Integer,Boolean>();
		Node previo = null;
		while(n != null){
			if(dicc.containsKey(n.data)) 
				previo.next = n.next;
			else{
				dicc.put(n.data, true);
				previo = n;
			}
			n = n.next;
		}
    }
}