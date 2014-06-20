import java.util.Random;


public class Main {
	static int n = 4;
	static int m = 5;
	static int[][] dp = new int[n][m];
	
	
	public static void main(String[] args) {
		
		int[][] a = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) { 			
				dp[i][j] = -1;
			}
		}
		
		leerEntrada(a);
		System.out.println("matrix entrada");
		imprimir(a);
		System.out.println("solucion: " + solution(a,n,m));
		
	}

	public static void leerEntrada(int[][] a){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Random generator = new Random(); 
				int r= generator.nextInt(10) + 1;
				a[i][j] = r;
			}
		}
	}
	
	public static int solution(int[][] a, int i, int j){
		return solve(a, n-1,m-1);
	}
	
    private static int solve(int[][] a, int i, int j) {
    	//System.out.println("i: " + i + "j:" +j+ "a[i][j]:" + a[i][j]);
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        
        int izq = 0;
        int der = 0;
       
        if (i > 0) {
            izq = solve(a, i -1, j);
        }
        if (j > 0) {
            der = solve(a, i, j - 1);
        }
    	int res = a[i][j] + max(izq, der);
    	
    	dp[i][j] = res;
    	
		return res;
	}

	private static int max(int izq, int der) {
		if(izq > der){
			return izq;
		}else{
			return der;
		}
	}

	public static void imprimir(int[][] a){
    	for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println("]");
		}
    }

}
