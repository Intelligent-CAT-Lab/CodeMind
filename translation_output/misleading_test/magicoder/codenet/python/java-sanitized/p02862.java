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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        long c = (factN * modinv(factX, MOD) % MOD * modinv(factY, MOD) % MOD) % MOD;
        System.out.println(c);
    }
}