import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
System.out.println("[INST]4;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]5;b;sc.nextLong();"+b);
		long c = sc.nextLong();
System.out.println("[INST]6;c;sc.nextLong();"+c);
		System.out.println(b + Math.min(a + b + 1, c));
	}
}