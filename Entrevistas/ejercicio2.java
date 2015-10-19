public class ejercicio2 {

    public static void main(String[] args) {
        System.out.println(indice("AA"));
        
    }
    
    static int indice(String columna){
    	int res = 0;
    	char character;
    	for (int i= 0; i < columna.length() ; i++) {
    		character = columna.charAt(i);
    		res += (((int)character) - 65) + 26 * i;
    	}
    	return res;

    }

}
