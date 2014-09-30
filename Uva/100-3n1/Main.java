import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long a = in.nextLong();
            long b = in.nextLong();

            if(b > a){
                long tmp = a;
                a = b;
                b = tmp;
            }

            System.out.println(a - b);
        }
    }
}
