import java.util.Random;


public class Main {

	static int n = 5;
	static int[] arr = new int[n];
	
	
	public static void main(String[] args) {
		//leerEntrada(arr);
		
		arr[0] = 2;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 4;
		System.out.print("Entrada: ");
		imprimir(arr);
		System.out.println("Solucion: " + solve(arr));
	}

	
	public static int solve(int[] arr){
		int cant = 0;
		int max = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
			
			if(max-1 == i){
				cant++;
			}
			if(i < arr.length-1){
				if(arr[i] < arr[i+1]){
					max = arr[i+1];
				}
			}
		}
		return cant;
	}
	public static void leerEntrada(int[] arr){
		for (int i = 0; i < n; i++) {
				Random generator = new Random(); 
				int r= generator.nextInt(10) + 1;
				arr[i] = r;
			}
	}
	
	public static void imprimir(int[] a){
		System.out.print("[");
		for (int i = 0; i < n; i++) {
				System.out.print(a[i]+ " ");
		}
		System.out.println("]");
	}

}
