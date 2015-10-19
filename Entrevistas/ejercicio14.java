public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Matrix A = new Matrix(5, 5);
		A.completarRandom();
		A.imprimir();
		rotar(A,0);
		System.out.println();
		A.imprimir();
	}
	
	public static void rotar(Matrix A, int s){
		for (int i = 0; i < (A.getNcols()/2); i++) {
			Matrix sub = generarSubMatrix(A,i);
			intercambiar(sub);
			A.fusionar(sub,i);
		}
	}
	
	public static Matrix generarSubMatrix(Matrix A, int s){
		Matrix result = new Matrix(A.getNrows() - 2*s, A.getNcols() - 2*s);
		int w = 0;
		for (int i = s; i < A.getNrows() - s; i++) {
			int p = 0;
			for (int j = s; j < A.getNcols() - s; j++) {
					result.set(w, p, A.getDatos()[i][j]);
					p++;
			}
			w++;
		}
		return result;
	}
	
	public static void intercambiar(Matrix A){
		int a,b,c,d;
		for (int i = 0; i < A.getNcols()-1; i++) {
			a = A.getDatos()[0][i];
			b = A.getDatos()[i][A.getNcols()-1];
			c = A.getDatos()[A.getNcols()-1][A.getNcols()-1-i];
			d = A.getDatos()[A.getNcols()-1-i][0];
			
			
			A.set(0, i, d);
			A.set(i, A.getNcols()-1, a);
			A.set(A.getNcols()-1, A.getNcols()-1-i, b);
			A.set(A.getNcols()-1-i, 0, c);
			
		}
	}

}