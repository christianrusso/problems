import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result;
		Scanner s = new Scanner(System.in);
	    while (s.hasNextInt())
	    {
	    	int size = s.nextInt();
	    	int[] arr = new int[size];
	    	for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
	    	if(size == 1){
	    		System.out.print("Jolly");
	    	}else{
	    		int primerDiff = diff(arr[0],arr[1]);
	    		Boolean jolly = true;
	    		for (int i = 1; jolly && (i < arr.length-1); i++) {
					if(diff(arr[i], arr[i+1]) == (primerDiff-1)){
						primerDiff--;
					}else{
						jolly = false;
					}
				}
	    		if(jolly){
	    			System.out.println("Jolly");
	    		}else{
	    			System.out.println("Not jolly");
	    		}
	    	}
	    }
	}
	
	public static int diff(int a, int b){
		if(a >= b){
			return a-b;
		}else{
			return b-a;
		}
	}

}