import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
System.out.println("[INST]6;n;in.nextInt();"+n);
		int a = in.nextInt();
System.out.println("[INST]7;a;in.nextInt();"+a);
		int b = in.nextInt();
System.out.println("[INST]8;b;in.nextInt();"+b);
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}