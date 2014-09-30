package ar.dc.uba.minesweeper;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ej
{    
	static int n;
	static int m;
	
    public static void main(String[] args) 
    {
    	Scanner s = new Scanner(System.in);
    	int[][] tablero = null;
	    while (s.hasNextInt())
	    {
	    	n = s.nextInt();
	        m = s.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	        	for (int j = 0; j < m; j++) {
	        		tablero[i][j] = s.nextInt();
				}	
			}
	        
	    }
    }
	    
    
    public static void imprimir(int[][] t){  
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		System.out.print(t[i][j]);
			}	
		}
    }
}