public class Ejercicio6 {

    public static void main(String[] args) {
        Matrix m = new Matrix(5,5);
        m.completarRandom();
        m.imprimir();
        m.rotate();
        System.out.println("");
        m.imprimir();
    }
}
