package ar.dc.uba.clase17;

import java.util.Scanner;

public class Vector {

	  private Scanner teclado;
	  private int[] vector;
	  public void cargar()
	    {
	        teclado=new Scanner(System.in);
	        System.out.print("Cuantos numeros cargar‡:");
	        int cant;
	        cant=teclado.nextInt();
	        vector=new int[cant];
	        for(int f=0;f<vector.length;f++) {
	            System.out.print("Ingrese sueldo:");
	            vector[f]=teclado.nextInt();
	        }	
	    }
	  
	  public void sumar(){
		  int suma = 0;
		  for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		  System.out.println(suma);
	  }
	  
	  
	   
	public static void main(String[] args) {
		Vector v = new Vector();
		v.cargar();
		v.sumar();
			

	}

}
