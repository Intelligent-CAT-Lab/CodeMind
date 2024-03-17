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

    static long binomialCoefficient(long n, long k) {
        if (k > n) {
            return 0;
        }
        return (fact[(int) n] * modinv(fact[(int) k], MOD) % MOD * modinv(fact[(int) (n - k)], MOD) % MOD);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0 || x < y || y < x) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long c = binomialCoefficient(n, x);
        System.out.println(c);
    }
}