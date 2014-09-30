package ar.dc.uba.clase20;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
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
	
	public void imprimir(){
		Arrays.sort(vector);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
		}
	}
	public static void main(String[] args) {
		Sort s = new Sort();
		s.cargar();
		s.imprimir();

	}

}
