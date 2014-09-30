package ar.dc.uba.loteria;

import java.util.ArrayList;
import java.util.Random;

public class Carton {
	
	static ArrayList<Integer> nums = new ArrayList<Integer>();

    public Carton() {
    	cargarNums(nums);
    }
    
    static void cargarNums(ArrayList<Integer> nums){
    	for (int i = 0; i < 10;  i++) {
    		Random r = new Random();
			int value = r.nextInt(10)+1;
    		nums.add(value);
		}
    }
    
    
    static void imprimirNumerosLibres(){
    	for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
    }
    
    static void tacharNum(int n){
    	for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == n){
				nums.remove(i);
			}
		}
    }

}
