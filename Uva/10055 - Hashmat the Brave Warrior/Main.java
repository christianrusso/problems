import java.util.Scanner;

import java.util.*;

public class Main {

	static int n = 3;
	static int[] arr1 = new int[n];
	static int[] arr2 = new int[n];
	static int[] arr2c = new int[n];
	static int[] sol = new int[n];
	static int result = 0;
	
	
	public static void main(String[] args) {
		//leerEntrada(arr);

		for (int i = 0; i < n; i++) {
			sol[i] = -1;
		}
		
		arr1[0] = 2;
		arr1[1] = 1;
		arr1[2] = 100000;

		arr2[0] = 1;
		arr2[1] = 1;
		arr2[2] = 2;

		arr2c[0] = 0;
		arr2c[1] = 0;
		arr2c[2] = 0;


		System.out.print("Entrada 1: ");
		imprimir(arr1);
		System.out.print("Entrada 2:");
		imprimir(arr2);
		System.out.println("Solucion:");
		solve();
		imprimir(sol);
		System.out.println("result: " +  result);
	}


	public static void solve(){
		Arrays.sort(arr2);
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if(arr1[i] < arr2[j]){
					arr2c[i] = 1;
					sol[i] = arr2[j];
					arr2[j] = -1;
					break;
				}

			}
		}
	
		for (int i = 0; i < n; i++) {
			if(sol[i] == -1)
				for (int j = 0; j< n ; j++ ) {
					if(arr2[j] != -1){
						sol[i] = arr2[j];
					}
				}
		}

		for (int i = 0; i < n; i++){
			if(sol[i] > arr1[i]) result++;
		}
	}

	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("]");
	}

}