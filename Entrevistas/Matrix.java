import java.util.Random;


public class Matrix {
	 	private int nrows;
	    private int ncols;
	    private int[][] datos;
	    
    public Matrix(int nrow, int ncol) {
        this.nrows = nrow;
        this.ncols = ncol;
        datos = new int[nrow][ncol];
    }
    
    public void imprimir(){
    	for (int i = 0; i < nrows; i++) {
			System.out.print("[");
			for (int j = 0; j < ncols; j++) {
				System.out.print(datos[i][j]+ " ");
			}
			System.out.println("]");
		}
    }
    
    public void completarRandom(){
    	for (int i = 0; i < nrows; i++) {
			for (int j = 0; j < ncols; j++) {
				Random generator = new Random(); 
				int r= generator.nextInt(10) + 1;
				datos[i][j] = r;
			}
		}
    }

	public int getNrows() {
		return nrows;
	}

	public void setNrows(int nrows) {
		this.nrows = nrows;
	}

	public int getNcols() {
		return ncols;
	}

	public void setNcols(int ncols) {
		this.ncols = ncols;
	}

	public int[][] getDatos() {
		return datos;
	}

	public void setDatos(int[][] datos) {
		this.datos = datos;
	}
    
	public void set(int i, int j, int x){
		datos[i][j] = x;
	}

	
	public void fusionar(Matrix sub,int i){
		int w = 0;
		for (int j = i; j < ncols-i; j++) {
			this.set(i, j, sub.getDatos()[0][w]);
			w++;
		}
		
		
		w = 0;
		for (int j = i; j < ncols-i; j++) {
			this.set(nrows-i-1, j, sub.getDatos()[sub.getNrows()-1][w]);
			w++;
		}
		
		w = 0;
		for (int j = i; j < nrows-i; j++) {
			this.set(j, i, sub.getDatos()[w][0]);
			w++;
		}
		w = 0;
		for (int j = i; j < nrows-i; j++) {
			this.set(j, ncols-i-1, sub.getDatos()[w][sub.getNcols()-1]);
			w++;
		}
	
	}
}