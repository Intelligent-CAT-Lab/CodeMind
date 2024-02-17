
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static long MOD = 1000_000_007;

    public static void main(String[] args) {
	int H = Integer.parseInt(scan.next());
	int W = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());

	long ans = 0;
	long comb1 = comb(H-A-1+B-1, B-1);
	long comb2 = comb(A-1+W-B, W-B);
	for (int i = 1; i <= W-B; i++) {
	    comb1 = comb1 * (H-A-1+B-1+i) % MOD * inverse(B-1+i) % MOD;
	    comb2 = comb2 * (W-B-i+1) % MOD * inverse(A-1+W-B-i+1) % MOD;
	    ans = (ans + comb1 * comb2 % MOD) % MOD;
	}

	System.out.println(ans);
	scan.close();
    }

    private static long pow(long x, long y) {
	if(y == 0) return 1;
	
	long x2 = pow(x, y/2);
	long ans = x2 * x2 % MOD;
	if(y%2 != 0) ans = ans * x % MOD;
	return ans;
    }

    private static long fact(long n) {
	if(n == 0) return 1;
	
	long ans = 1;
	for (int i = 2; i <= n; i++) {
	    ans = ans * i % MOD;
	}
	return ans;
    }

    private static long inverse(long x) {
	return pow(x, MOD-2);
    }


    private static long infact(long n) {
	return inverse(fact(n));
    }

    private static long comb(long n, long m) {
	return fact(n) * infact(m) % MOD * infact(n-m) % MOD;
    }
}
