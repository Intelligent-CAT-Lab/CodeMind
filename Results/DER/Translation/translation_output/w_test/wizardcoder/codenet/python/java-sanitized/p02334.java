import java.util.*;
import java.math.*;

public class p02334 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N+K-1-i)) % MOD;
            q = (q * (i+1)) % MOD;
        }

        System.out.println(p * pow(q, MOD-2, MOD) % MOD);
    }

    public static long pow(long a, long b, long mod) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long temp = pow(a, b/2, mod);
            return (temp * temp) % mod;
        } else {
            return (a * pow(a, b-1, mod)) % mod;
        }
    }
}