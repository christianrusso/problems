package ar.dc.uba.clase1;

import java.util.Random;

public class HelloWordReload {

	/**
	 * @param args
	 * author: Christian Russo 
	 */
	public static void main(String[] args) {
		int n = 10;
		int m = 12;
		int matriz[][] = new int[n][m];
		inicializarMatriz(matriz);
		printMatriz(matriz);
		
	}
	/*
	 * Inicializo la matriz con valores ramdon entre 0 y 9 (inclusive)
	 */
	static void inicializarMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				Random r = new Random();
				int value = r.nextInt(9)+1;
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
				System.out.print(m[i][j] + " ");
			}
			System.out.print("]");
			System.out.println(" ");
			
		}
	}

}
