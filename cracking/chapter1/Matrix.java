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


    public void rotate(){
    	
    	for (int layer = 0; layer < nrows/2; layer++) {
    		int first = layer;
    		int last = nrows - 1 -layer; 
    		
    		for (int i=first; i < last; i++) {
    			int offset = i-first;
    			int top = datos[first][i];
    			datos[first][i] = datos[last-offset][first];
  				datos[last-offset][first] = datos[last][last - offset];
  				datos[last][last - offset] = datos[i][last];
				datos[i][last] = top;
    		}
    	}
    }
}