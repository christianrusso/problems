class Node {
	Node next = null;
	int data;
	public Node(int d) { 
		data = d; 
	} 

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) { 
			n = n.next; 
		} 
		n.next = end;
	}

	void imprimir(){      
		Node n = this; 
        while (n.next != null) { 
            System.out.print(n.data);
            System.out.print(" -> ");
            n = n.next; 
        } 
        System.out.println(n.data);
    } 
}