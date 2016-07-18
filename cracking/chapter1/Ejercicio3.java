import java.io.*;
import java.util.Arrays;
public class Ejercicio3 {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String s1 = "hola";
        String s2 = "lasoh";
        if(resolver(s1,s2))
        	System.out.println("Es permutacion");
        else
        	System.out.println("No es permutacion");
    }


    public static boolean resolver(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        if(!sorted1.equals(sorted2)) return false;
        return true;
    }
}
