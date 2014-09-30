import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String newLine = in.readLine();
        String[] dimensions = newLine.split("\\s");
        System.out.println("m = " + dimensions[0]);
        System.out.println("n = " + dimensions[1]);
    }
}
