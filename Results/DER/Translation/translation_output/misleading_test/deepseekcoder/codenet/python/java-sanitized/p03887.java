import java.util.*;

public class p03887 {
    static long MOD = 1000000007;
    static long[] fact;
    static long[] inverseFact;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        fact = new long[n + 1];
        inverseFact = new long[n + 1];

        fact[0] = 1;
        inverseFact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inverseFact[i] = inverse(fact[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            System.exit(0);
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0)
                    continue;

                long curAns = fact[x + y + z] * inverseFact[x] % MOD;
                curAns = curAns * inverseFact[y] % MOD;
                curAns = curAns * inverseFact[z] % MOD;
                curAns = curAns * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                curAns = curAns * comb(b / 2 + rest3 - 1, rest3) % MOD;

                ans = (ans + curAns) % MOD;
            }
        }

        System.out.println(ans);
    }

    static long inverse(long k) {
        return fastPow(k, MOD - 2);
    }

    static long comb(int n, int k) {
        return fact[n] * inverseFact[n - k] % MOD * inverseFact[k] % MOD;
    }

    static long fastPow(long x, long y) {
        if (y == 0)
            return 1;
        long p = fastPow(x, y / 2);
        p = p * p % MOD;
        if (y % 2 == 1)
            p = p * x % MOD;
        return p;
    }
}