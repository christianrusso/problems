import java.util.ArrayList;


public class Main {
	static int num2;
	static int num3;
	static int num5;
	static int min;
	static int minaux;
	
	public static void main(String[] args) {
		int[] arr = new int[1500];
		arr[0] = 1;
		
		for (int i = 1; i < 1500; i++) {
			min = Integer.MAX_VALUE;
			ArrayList<Integer> aux = new ArrayList<Integer>();
			for (int j = 0; j < i; j++) {
				num2 = arr[j]*2;
				num3 = arr[j]*3;
				num5 = arr[j]*5;
				aux.add(num2);
				aux.add(num3);
				aux.add(num5);
				
			}
			min = max(aux,arr[i-1]);
			arr[i] = min;
		}
		System.out.println(arr[1499]);
	}
	
	public static int max(ArrayList<Integer> arr,int ant){
		int minimo = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) <= ant){
				arr.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) < minimo){
				minimo = arr.get(i);
			}
		}
		return minimo;
	}

}
