import java.util.*;

public class p02862 {
    static long MOD = 100000007;

    static long[] fact;

    static long modinv(long a, long m) {
        long g = xgcd(a, m)[0];
        if (g!= 1) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return (a % m + m) % m;
        }
    }

    static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b!= 0) {
            long q = a / b;
            long a1 = a % b, b1 = b;
            a = a1;
            b = b1;
            long x = x0, y = y0;
            x0 = x1;
            y0 = y1;
            x1 = x - q * x1;
            y1 = y - q * y1;
        }
        return new long[]{a, x0, y0};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x + y) % 3!= 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        long n = (x + y) / 3;
        x -= n;
        y -= n;
        fact = new long[(int) n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long c = fact[(int) n] * modinv(fact[(int) x], MOD) % MOD * modinv(fact[(int) y], MOD) % MOD;
        System.out.println(c);
    }
}