import java.io.*;
import java.util.Arrays;
public class Ejercicio4 {

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        char[] chars = s.toCharArray();
        resolver(chars, 13);
        
    }


    public static void resolver(char[] cs, int j){
        for (int i = cs.length-1; i>=0 ; i--) {
            if(cs[j-1] == ' '){
                cs[i] = '0';
                cs[i-1] = '2';
                cs[i-2] = '%';
                i--;
                i--;
                j--;

            }else{
                cs[i] = cs[j-1];
                j--;
            }
        }
        System.out.println(cs);
    }
}
