import java.util.*;

public class p02862 {
    static long MOD = 1000000007;
    static long[] fact = new long[100001];

    static long xgcd(long a, long b, long[] x) {
        if (b == 0) {
            x[0] = 1;
            x[1] = 0;
            return a;
        }
        long[] y = new long[2];
        long g = xgcd(b, a % b, y);
        x[0] = y[1];
        x[1] = y[0] - (a / b) * y[1];
        return g;
    }

    static long modinv(long a, long m) {
        long[] x = new long[2];
        long g = xgcd(a, m, x);
        if (g != 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return (x[0] % m + m) % m;
        }
    }

    static long C(long n, long r, long p) {
        if (r == 0)
            return 1;
        return (fact[(int) n] * modinv(fact[(int) r] * fact[(int) (n - r)] % p, p)) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3 != 0 || x + y < 3 * Math.max(x, y)) {
            System.out.println(0);
            return;
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        fact[0] = 1;
        for (int i = 1; i <= (int) n; i++)
            fact[i] = (fact[i - 1] * i) % MOD;
        long c = C(n, x, MOD);
        System.out.println(c);
    }
}