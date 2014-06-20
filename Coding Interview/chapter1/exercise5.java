
public class exercise5{

    public static String solve(String str){
        String result = "";
        char c = str.charAt(0);
        int count = 1;
        for(int i= 1; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }else{
                result = result + c + "" + count;
                count = 1;
                c = str.charAt(i);
            }
        }
        result = result + c + ""+ count;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("aabcccccaaa"));
    }
}
