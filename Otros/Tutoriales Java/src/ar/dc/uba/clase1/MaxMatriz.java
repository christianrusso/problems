package ar.dc.uba.clase1;

import java.util.Random;

public class MaxMatriz {

	/**
	 * @param args
	 * author: Christian Russo 
	 */
	
	//DOS VARIABLES GLOBALES
	static int row = 0;
	static int col = 0;
	
	public static void main(String[] args) {
		int n = 10;
		int m = 12;
		int matriz[][] = new int[n][m];
		inicializarMatriz(matriz);
		searchMax(matriz);
		printMatriz(matriz);
		
	}
	
	/*
	 *  Busco el maximo de la matriz y me guardo los indices en las variables locales
	 */
	static void searchMax(int m[][]){
		int max = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] > max){
					max = m[i][j];
					row = i;
					col = j;
				}
			}
		}
	}
	
	/*
	 * Inicializo la matriz con valores ramdon entre 0 y 9 (inclusive)
	 */
	static void inicializarMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				Random r = new Random();
				int value = r.nextInt(100)+1;
				m[i][j] = value;
			}
		}
	}
	
	/*
	 * Recorro la matriz para imprimirla
	 */
	
	static void printMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < m[i].length; j++) {
				if((i == row) && (j == col)){
					System.out.print("'" + m[i][j] + "' ");	
				}else{
					System.out.print(m[i][j] + " ");
				}
				
			}
			System.out.print("]");
			System.out.println(" ");
			
		}
	}

}
