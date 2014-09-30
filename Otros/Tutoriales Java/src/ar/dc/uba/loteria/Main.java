package ar.dc.uba.loteria;

import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carton c1 = new Carton();
		int bolillas = 0;
		while(!algunCartonVacio(c1)){
			System.out.println("======== CARTONES ========");
			c1.imprimirNumerosLibres();
			System.out.println(" ");
    		Random r = new Random();
			int value = r.nextInt(10)+1;
			System.out.println(" ");
			System.out.println("SALE NUMERO:" + value);
			c1.tacharNum(value);
			bolillas++;
			
		}
		System.err.println("Ganaste luego de " + bolillas + " bolillas");
		
	}
	
	public static boolean algunCartonVacio(Carton c1){
		if(c1.nums.size() == 0){
			return true;
		}
		return false;
		
	}

}
