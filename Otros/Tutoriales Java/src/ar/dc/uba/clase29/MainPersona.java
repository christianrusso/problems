package ar.dc.uba.clase29;

public class MainPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.cargarDatosPersonales();
		Empleado e1 = new Empleado();
		e1.cargarDatosPersonales();
		e1.cargarSueldo();
		p1.imprimirDatosPersonales();
		e1.imprimirDatosPersonales();
		e1.imprimirSueldo();
	}

}
