package ar.dc.uba.clase29;

public class Empleado extends Persona{

	protected int sueldo;
    public void cargarSueldo() {
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextInt();
    }
    
    public void imprimirSueldo() {
        System.out.println("El sueldo es:"+sueldo);
    }
}
