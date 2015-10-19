
public class ListaEnteros{
	public Nodo primero;
	public Nodo ultimo;
	public int tamaño;


	public ListaEnteros()
	{
		primero = null;
		ultimo  = null;
		tamaño = 0;
	}
	
	public void addNode(int valor)
	{
		if (tamaño == 0){
			primero = new Nodo(valor);
			ultimo = primero;
		}else{
			ultimo.siguiente = new Nodo(valor);
			ultimo = ultimo.siguiente;
		}
		tamaño++;		
	}

	public void imprimir(){
		Nodo n = primero;
		while(n != null){
			System.out.print(n.valor + " -> ");
			n = n.siguiente;
		}
	}
	
	public void reverse(int a, int b)
	{
		if (a < 0 || b >= tamaño)
			return;

		Nodo izq = null;
		Nodo der = null;
		Nodo A = null;
		Nodo B = null;

		if (a > 0)
		{
			A = iesimoNodo(a);
			izq = A.siguiente;
		}

		if (b < tamaño - 1)
		{
			B = iesimoNodo(b);
			der = B.siguiente;
		}

		for (int i = 0; i < b - a + 1; i++){
			Nodo actual = iesimoNodo(b - 1 - i);
			actual.siguiente.siguiente = actual;
    	}
		if (izq != null)
			izq.siguiente = B;
		if (der != null)
			der.siguiente = A;
	}
	
	public class Nodo{
			public int valor;
			public Nodo siguiente;

			public Nodo(int val){
				this.valor = val;
				this.siguiente = null;
			}
	}
	
	public Nodo iesimoNodo(int a){
		Nodo iesimo = primero;
		if (a < 0 || a >= tamaño)
			return iesimo;

	    for(int i = 0; i < a; i++){
	    	if(iesimo.siguiente != null)
	    		
	    		iesimo = iesimo.siguiente;
	    }
	    return iesimo;
	}
}