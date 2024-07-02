import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
System.out.println("[INST]5;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]6;b;sc.nextLong();"+b);
		System.out.println(toString(a & b));
		System.out.println(toString(a | b));
		System.out.println(toString(a ^ b));
	}
	
	static String toString(long x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 32; i++) {
		    sb.append(x % 2);
System.out.println("[INST]15;None;sb.append(x % 2);"+sb.append(x % 2));
		    x /= 2;
		}
	    return sb.reverse().toString();
System.out.println("[INST]18;None;sb.reverse();"+sb.reverse());
	}
}

