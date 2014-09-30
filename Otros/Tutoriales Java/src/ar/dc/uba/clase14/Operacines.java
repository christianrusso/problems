package ar.dc.uba.clase14;

import java.util.Scanner;

public class Operacines {
	private int valor1;
	private int valor2;
	private Scanner teclado;
	public void inicializar(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese valor1:");
        this.valor1 = teclado.nextInt();
        System.out.print("Ingrese valor2:");
        this.valor2 = teclado.nextInt();
	}
	
	public int suma(){
		return valor1 + valor2;
	}
	
	public int resta(){
		return valor1 - valor2;
	}
	
	public float div(){
		return valor1/valor2;
	}
	
	public int mult(){
		return valor1*valor2;
	}
	
	public static void main(String[] args) {
		Operacines op = new Operacines();
		op.inicializar();
		System.out.println(op.suma());
		System.out.println(op.resta());
		System.out.println(op.mult());
		System.out.println(op.div());

	}

}
