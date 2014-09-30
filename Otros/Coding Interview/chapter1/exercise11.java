import java.util.*;

import javax.swing.tree.TreeNode;


public class exercise11{

    public static String solve(String str){
        String result = "";
        char c = str.charAt(0);
        int count = 1;
        for(int i= 1; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }else{
                result = result + c + "" + count;
                count = 0;
                c = str.charAt(i);
            }
        }
		return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("aabcccccaaa"));
        TreeNode t;
        
        
    }
}
