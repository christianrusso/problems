
package ar.dc.uba.minesweeper;

import java.util.Scanner;

public class asd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result;
		Scanner s = new Scanner(System.in);
	    while (s.hasNextInt())
	    {
	    	int v = s.nextInt();
	    	int w = s.nextInt();
	    	if(v>w){
	    		result = v-w;
	    	}else{
	    		result = w-v;
	    	}
	    	System.out.println(result);
	    }
		

	}

}