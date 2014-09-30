
public class Tablero {
	public int[][] tablero;
	public int n;
	public int m;
	
	public Tablero(int n, int m){
		this.n = n;
		this.m = m;
		tablero = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				tablero[i][j] = 0;
			}
		}
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	public void imprimir(){
		for (int i = 0; i < n; i++) {
			System.out.print("[ ");
			for (int j = 0; j < m; j++) {
				System.out.print(tablero[i][j] + ",");
			}
			System.out.println(" ]");
		}
	}
	

}
