public class Ejercicio6 {

    public static void main(String[] args) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		
		for (int j = 0; j < matrix[0].length;j++) { 
			if (matrix[i][j] == 0) {
				row[i] = 1;
				column[j] = 1; 
			}
		} 

		resolver();
	}

	public static resolver(){
		for (int j = 0; j < matrix[0].length; j++) { 
			if ((row[i] == 1 || column[j] == 1)) {
				matrix[i][j] = 0; 
			} 
		}
    }
}
