import java.util.Scanner;

import java.util.*;

public class Main {
	static int n;
	static int votos[];
	static int total = 0;
	static int mayor = -1;
	static int segundo = -1;
	static Scanner sc = new Scanner( System.in );


	public static void main(String[] args) {
		n = sc.nextInt();
		votos = new int[n];
		
		for( int i = 0 ; i < n ; ++i ){
			int tmp = sc.nextInt();
			votos[i] = tmp;
			total += tmp;
		}

		Arrays.sort(votos);

		mayor = votos[n-1];
		segundo = votos[n-2];
	
		if(mayor >= total *0.45) {

			devolverUno();
			return;
		}
		if(mayor < total *0.40){

			devolverDos();
			return;
		}

		if(mayor - segundo >= total *0.10){
			
			devolverUno();
			return;
		}
		devolverDos();
		return;
	}


	public static void devolverUno(){
		System.out.println(1);
	}


	public static void devolverDos(){
		System.out.println(2);
	}
}