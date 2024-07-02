import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
		System.out.println(f(n+1));
	}
	static HashMap<Long, Long> mb = new HashMap<>();
	public static long f(long n) {
		Long memo = mb.get(n);
System.out.println("[INST]12;memo;mb.get(n);"+memo);
		if (memo != null) return memo;
		if (n <= 2) {
			return n;
		}
		long res = f(n/2) + f((n-1)/2) + f((n+1)/2);
		res %= MOD;
		mb.put(n, res);
System.out.println("[INST]19;None;mb.put(n, res);"+mb.put(n, res));
		return res;
	}
}

