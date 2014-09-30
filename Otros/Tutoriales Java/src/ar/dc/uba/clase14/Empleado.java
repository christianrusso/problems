package ar.dc.uba.clase14;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int sueldo;
	private Scanner teclado;
	
	public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        this.nombre = teclado.next();
        System.out.print("Ingrese sueldo:");
        this.sueldo = teclado.nextInt();
	}
	
	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo: " + sueldo);
	}
	
	public void impuestos(){
		if(sueldo > 3000){
			System.out.println("Paga impuestos");
		}else{
			System.out.println("No paga impuestos");
		}
	}
	
	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		e1.inicializar();
		e1.imprimir();
		e1.impuestos();

	}

}
