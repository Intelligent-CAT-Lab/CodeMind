import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
System.out.println("[INST]6;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]7;b;sc.nextLong();"+b);
		long x = sc.nextLong();
System.out.println("[INST]8;x;sc.nextLong();"+x);
		long s = a - b;
		long count = Math.max(x - a, 0) / s;
System.out.println("[INST]10;None;Math.max(x - a, 0);"+Math.max(x - a, 0));
		long total = (count % MOD) * (a % MOD) % MOD;
		x -= count * s;
		while (x >= a) {
		    total += a;
		    x += - a + b;
		}
		total += x;
		total %= MOD;
		System.out.println(total);
	}
}

