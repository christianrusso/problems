
public class exeercise3{

    public static String sort(String str){
        char[] contenido = str.toCharArray();
        java.util.Arrays.sort(contenido);
        return new String(contenido);
    }

    public static boolean permutation(String str1,String str2){
    if(str1.length() != str2.length()) return false;

    return sort(str1).equals(sort(str2));
    }

    public static boolean permutation2(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        int[] letras = new int[128];

        char[] s_array = str1.toCharArray();
        for(char c : s_array){
            letras[c]++;
        }

        for(int i = 0; i < str2.length(); i++){
            int c = (int) str2.charAt(i);
            letras[c]--;
        }

        for(int i = 0; i < 128; i++){
            if(letras[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(permutation2("whola","aloh"));
    }
}
