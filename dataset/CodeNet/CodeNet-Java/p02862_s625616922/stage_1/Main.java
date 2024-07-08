import java.util.*;
import java.awt.Point;

public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		if((x+y)%3 != 0) {
			System.out.println(0);
			return;
		}
		long n = (x+y)/3;
		x = x-n;
		y = y-n;
		if(x<0 || y<0) {
			System.out.println(0);
			return;
		}
		System.out.println(modCombination(x+y, x, mod));
	}
	public static long modCombination(long n, long r, long mod) {
		long top = 1;
		long bottom = 1;
		for (int i = 1; i <= r; i++) {
			top *= n;
			top %= mod;
			n--;
			bottom *= i;
			bottom %= mod;
		}
		bottom = modPow(bottom, mod-2, mod);
		return (top * bottom) % mod;
	}
	public static long modPow(long base, long exp, long mod) {
		if (exp == 0)
			return 1;
		if (exp == 1)
			return base % mod;
		if (exp % 2 == 1)
			return (base * modPow(base, exp - 1, mod) % mod);
		long tmp = modPow(base, exp / 2, mod);
		return (tmp * tmp) % mod;
	}
}
