import java.util.Scanner;

import java.util.*;

public class Main {
	
	static class Node implements Comparable<Node>{
		int first, second;
		Node( int d , int p ){							//constructor
			this.first = d;
			this.second = p;
		}
		public int compareTo( Node other){				//es necesario definir un comparador para el correcto funcionamiento del PriorityQueue
			if( second > other.second ) return 1;
			if( second == other.second ) return 0;
			return -1;
		}
	}
	
	static final int MAX = 20005;  
	static final int INF = 1<<30;

	static Scanner sc = new Scanner( System.in );	   
	static List< List< Node > > ady; //lista de adyacencia
	static int distancia[ ] = new int[ MAX ];          //distancia[ u ] distancia de v�rtice inicial a v�rtice con ID = u
	static boolean visitado[ ] = new boolean[ MAX ];   //para v�rtices visitados
	static PriorityQueue< Node > Q = new PriorityQueue<Node>(); //priority queue propia de Java, usamos el comparador definido para que el de menor valor este en el tope
	static int V, S, T, k;                                     //numero de vertices
	static int previo[] = new int[ MAX ];              //para la impresion de caminos
	
	static void init(){
	    for( int i = 0 ; i <= V ; ++i ){
	        distancia[ i ] = INF;  //inicializamos todas las distancias con valor infinito
	        visitado[ i ] = false; //inicializamos todos los v�rtices como no visitados
	        previo[ i ] = -1;      //inicializamos el previo del vertice i con -1
	    }
	}
	
	public static void main(String[] args) {
		
		int E , origen, destino , peso , inicial;
		int nCases = sc.nextInt();
		for (k = 1; k <= nCases; k++) {
			ady = new ArrayList< List< Node > >();
			V = sc.nextInt();
			E = sc.nextInt();
			S = sc.nextInt();
			T = sc.nextInt();
			for(int i = 0; i <= V; ++i) ady.add(new ArrayList<Node>());
			for( int i = 0 ; i < E ; ++i ){
				origen = sc.nextInt(); 
				destino = sc.nextInt(); 
				peso = sc.nextInt();
				ady.get(origen).add(new Node(destino , peso ) );  
				ady.get( destino ).add( new Node( origen , peso ) ); 
			}
		    dijkstra(S);
		}
	}
	
	
	static void dijkstra(int inicial){
		init();
		Q.add(new Node(inicial,0));
		distancia[inicial] = 0;
		int actual, adyacente,peso;
		while(!Q.isEmpty()){
			actual = Q.element().first;
			Q.remove();
			if(visitado[actual]) continue;
			visitado[actual] = true;
			for (int i = 0; i < ady.get(actual).size(); i++) {
				adyacente = ady.get(actual).get(i).first;
				peso = ady.get(actual).get(i).second;
				if(!visitado[adyacente]){
					relajacion(actual,adyacente,peso);
				}
			}
		}
		
		if(distancia[T] == INF){
			System.out.println("Case #"+ k +": unreachable");
		}else{
			System.out.println("Case #"+ k +": " +  distancia[T]);
			
		}
			
	
	    
	}
	
	static void relajacion( int actual , int adyacente , int peso ){
	    //Si la distancia del origen al vertice actual + peso de su arista es menor a la distancia del origen al vertice adyacente
	    if( distancia[ actual ] + peso < distancia[ adyacente ] ){
	        distancia[ adyacente ] = distancia[ actual ] + peso;  //relajamos el vertice actualizando la distancia
	        previo[ adyacente ] = actual;                         //a su vez actualizamos el vertice previo
	        Q.add( new Node( adyacente , distancia[ adyacente ] ) ); //agregamos adyacente a la cola de prioridad
	    }
	}

}
