import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
System.out.println("[INST]6;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]7;b;sc.nextLong();"+b);
		long n = sc.nextLong();
System.out.println("[INST]8;n;sc.nextLong();"+n);
		
		long x = Long.min(b - 1, n);
System.out.println("[INST]10;x;Long.min(b - 1, n);"+x);
		
		long ans = a * x / b;
		
		System.out.println(ans);
	}
	
}
