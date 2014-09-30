import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static ArrayList<Integer>[] ady; //Lista de adyacencia
	static boolean visitados[];
	static int colores[];
	static Boolean first;
	static boolean result;
	
	public static void main(String[] args) throws IOException{
	    int  V, E , x , y, nInicial , nFinal;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String newLine = in.readLine();
        String[] dimensions = newLine.split("\\s");
        V = Integer.parseInt(dimensions[0]); //numero d evertices
        while(V != 0){
        	result = true;
        	newLine = in.readLine();
        	dimensions = newLine.split("\\s");
	        E = Integer.parseInt(dimensions[0]); //numero de aristas
	        
	        ady = new ArrayList[V];
	        visitados = new boolean[V];
	        colores = new int[V];
	
	        for (int i = 0; i < ady.length; i++) {
				ady[i] = new ArrayList<Integer>();
			}
	        
		    for(int i = 1 ; i <= E ; ++i ){
		    	newLine = in.readLine();
		    	dimensions = newLine.split("\\s");
		    	x = Integer.parseInt(dimensions[0]);
		    	y = Integer.parseInt(dimensions[1]);
		    	ady[x].add(y);
		    	ady[y].add(x);	      
		    }
		    dfs(0);
		    if(result){
		    	System.out.println("BICOLORABLE.");
		    }else{
		    	System.out.println("NOT BICOLORABLE.");
		    }
		    newLine = in.readLine();
	        dimensions = newLine.split("\\s");
	        V = Integer.parseInt(dimensions[0]);
        }
	}
	
	
	public static void dfs(int inicial){
		boolean color1 = true; 
		boolean color2 = true;
		
	    first = false;
	    visitados[inicial] = true;
	    for(int j = 0 ; j < ady[inicial].size(); ++j ){ 
	        if(visitados[ady[inicial].get(j) ] ){ 
	            if(colores[ady[inicial].get(j)] == 1){
	            	color1 = false;
	            }
	            if(colores[ady[inicial].get(j)] == 2){
	            	color2 = false;
	            }
	        }
	    }
	    
	    if(color1){
	    	colores[inicial] = 1;
	    }else if(color2){
	    	colores[inicial] = 2;
	    }else{
	    	result = false;
	    }
	    for(int v = 0 ; v < ady[inicial].size(); ++v ){
	        if(!visitados[ady[inicial].get(v) ] ){
	            dfs( ady[inicial].get(v) );
	        }
	    }
	}
}
