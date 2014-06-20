import java.util.*;

public class Main {
	static int ady[][];
	static int tamanio;
	static int[] prev; 
	
	//
	static int V;
	
	//
	
	public static void main(String[] args) {
		tamanio = 4;
		resolver(tamanio, 2, 2);
	}
	
	public static void resolver(int n, int x, int y){
			ady = new int[n*n][n*n];
			conectarNodos(ady);
			bfs();
	}
	
	public static void conectarNodos(int[][] ady){
		for (int i = 0; i < ady.length; i++) {
			ady[i][i] = 1;
		}
		ArrayList<Tuple> posiciones;
		for (int w = 0; w < tamanio; w++) {
			for (int j = 0; j < tamanio; j++) {
				posiciones = movimientosPosibles(w,j);
				for (int i = 0; i < posiciones.size(); i++) {
					int posx = convertXY2Pos(w,j);
					int posy = convertXY2Pos(posiciones.get(i).x, posiciones.get(i).y);
					
					ady[posx][posy] = 1;
					ady[posy][posx] = 1;
				}
			}
		}
		
	}
	
	public static void imprimirMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println("]");
		}
	}
	
	public static ArrayList<Tuple> movimientosPosibles(int i,int j){
		ArrayList<Tuple> result = new ArrayList<Tuple>();
		int pos_x;
		int pos_y;
		
		Tuple a;
		pos_x = i +1;
		pos_y = j -2;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		pos_x = i -1;
		pos_y = j -2;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		pos_x = i -2;
		pos_y = j +1;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		
		pos_x = i +2;
		pos_y = j +1;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		pos_x = i -2;
		pos_y = j -1;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		pos_x = i +2;
		pos_y = j -1;
		
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		
		pos_x = i -1;
		pos_y = j +2;
	
		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		pos_x = i +1;
		pos_y = j +2;
		

		a = new Tuple(pos_x, pos_y);
		result.add(a);
		
		sacarFueradeRango(result);
		return result;
	}
	
	public static void sacarFueradeRango(ArrayList<Tuple> a) {
		for (int i = 0; i < a.size(); i++) {
			Tuple t = a.get(i);
			if((t.x < 0) || (t.y < 0) || (t.x >= tamanio) || t.y >= (tamanio)){
				a.remove(i);
				i --;
			}
			
		}
	}
	
	
	public static int convertXY2Pos(int x, int y){
		int ancho = tamanio;
		int result;
		result = ancho * y + x;
		return result;
	}
	
	
	public static void bfs(){
		prev = new int[ tamanio * tamanio];
		int ini , fin , pasos = 0, max = 0, actual;
		boolean visitado[ ] = new boolean[ tamanio ];
		Arrays.fill( visitado , false );


		ini = 0;
		fin = 15;		

		prev[ ini ] = -1;

		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add( ini );
		while( !Q.isEmpty() ){
			max = Math.max( max , Q.size() );				//ver memoria usada en cola
			actual = Q.remove();
			pasos++;

			if( actual == fin )break;						//si se llego al destino

			visitado[ actual ] = true;

			for( int i = 0 ; i < V ; ++i ){	    			//vemos adyacentes a nodo actual
				int v = ady[ actual ][ i ];
				if( v != 0 && !visitado[ i ] ){				//no visitado agregamos a cola
					System.out.println( actual +" -> "+ i); //vemos recorrido de todo BFS
					prev[ i ] = actual;						//para ver recorrido de nodo inicio a fin
					Q.add( i );
				}
			}
		}

		System.out.println("Memoria maxima: " + max );
		System.out.println("Nro Pasos: " + pasos);

		PrintRecorrido( ini , fin );

	}

		
	
	//Imprimimos recorrido para llegar de nodo ini a fin
	static void PrintRecorrido( int ini , int fin ){

		System.out.println("Recorrido de nodos para llegar de nodo "+ini+" a " +fin);
		List<Integer> path = new ArrayList<Integer>();

		for(int i = 0;i < 100; i++ ){
			path.add( fin );
			if( prev[ fin ] == -1 )break;
			fin = prev[ fin ];
		}

		for( int i = path.size() - 1 , k = 0 ; i >= 0 ; --i ){
			if( k != 0 ) System.out.print( "->");
			System.out.print( path.get( i ) );
			k = 1;
		}
		System.out.println();

	}
	

}
