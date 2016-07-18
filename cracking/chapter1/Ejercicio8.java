public class Ejercicio8 {

    public static void main(String[] args) {
    	System.out.println(isRotation("abc", "bca"));
    }

    public static boolean isRotation(String s1, String s2){
    	int len = s1.length();
    	if(len == s2.length() && len > 0){
    		String s1s2 = s1 + s2;
    		return isSubString(s1s2,s2);
    	}
    	return false;
    }
}
