import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		int k = sc.nextInt();
System.out.println("[INST]8;k;sc.nextInt();"+k);
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
