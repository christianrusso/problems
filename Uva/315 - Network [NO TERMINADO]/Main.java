import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static List< List< Integer > > ady = new ArrayList< List< Integer > >(); //lista de adyacencia
	static BufferedReader in;
	
	//
	static String n;  
	static int V;  
	static boolean visitados[]; 
	static int sinLuz;
	static int result = 0;
	static boolean encontre = false;
	
	//
	
	public static void main(String[] args) throws IOException{
		in = new BufferedReader(new InputStreamReader(System.in));
		resolver();
	}
	
	public static void resolver() throws IOException{
		n = in.readLine();
		V = Integer.parseInt(n);
		visitados = new boolean[V+1];
		visitados[0] = true;
		
		for(int i = 0; i <= V; ++i) ady.add(new ArrayList<Integer>());
		String newLine = in.readLine();
	    String[] aristas = newLine.split("\\s");
	    int origen = Integer.parseInt(aristas[0]);
        for (int j = 1; j < 3; j++) {
        	ady.get(Integer.parseInt(aristas[j])).add(origen);
        	ady.get(origen).add(Integer.parseInt(aristas[j]));
        }




        newLine = in.readLine();
	    aristas = newLine.split("\\s");
	    origen = Integer.parseInt(aristas[0]);
	
        for (int j = 1; j < 4; j++) {
        	ady.get(Integer.parseInt(aristas[j])).add(origen);
        	ady.get(origen).add(Integer.parseInt(aristas[j]));
        }




        for (int j = 1; j < V+1; j++) {
        	sinLuz=j;
        	for (int i = 1; i < V && !encontre;i++ ) {
        		dfs(i);
        		if(Articulation_point() == 1)
        			encontre = true;
        		result += Articulation_point();
        	}
        }
        System.out.println(result);

	}
	

	public static void dfs(int inicial){
		if(inicial != sinLuz){
			visitados[inicial] = true;
		}
        for(int v = 0 ; v < ady.get(inicial).size(); v++ ){
            if(!visitados[ady.get(inicial).get(v) ] ){
            	if(inicial != sinLuz){
                	dfs(ady.get(inicial).get(v) );
                }
            }
        }
	}


	public static int Articulation_point()
	{
	
	    for(int i=1;i <= V;i++)
	        if(!visitados[i]){
	        	if(i != sinLuz)
	            	return 1;
	        }
	    return 0;
	}
	
	
	

}
