public class ejercicio4 {

    public static void main(String[] args) {
    	ListaEnteros lista = new ListaEnteros();
    	lista.addNode(1);
    	lista.addNode(3);
    	lista.addNode(4);
    	lista.addNode(6);
    	lista.addNode(9);
    	lista.addNode(11);
    	lista.addNode(12);
    	lista.imprimir();
    	lista.reverse(3, 5);
    	lista.imprimir();
    	}
}
