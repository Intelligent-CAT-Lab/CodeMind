import java.util.Scanner;

public class p03887 {
    static final int MOD = 1000000007;

    static long[] FACT;
    static long[] INVERSE_FACT;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        FACT = new long[n + 1];
        INVERSE_FACT = new long[n + 1];

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = (FACT[i - 1] * i) % MOD;
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            System.exit(0);
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= c - y / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                long cur_ans = (FACT[x + y + z] * INVERSE_FACT[x]) % MOD;
                cur_ans = (cur_ans * INVERSE_FACT[y]) % MOD;
                cur_ans = (cur_ans * INVERSE_FACT[z]) % MOD;
                cur_ans = (cur_ans * comb(x + y + z + 1 + b / 2 - 1, b / 2)) % MOD;
                cur_ans = (cur_ans * comb(b / 2 + rest3 - 1, rest3)) % MOD;

                ans = (ans + cur_ans) % MOD;
            }
        }

        System.out.println(ans);
    }

    static long inverse(long k) {
        return fastPow(k, MOD - 2);
    }

    static long comb(int n, int k) {
        return (FACT[n] * INVERSE_FACT[n - k] % MOD * INVERSE_FACT[k]) % MOD;
    }

    static long fastPow(long x, int y) {
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2) % MOD;
        p = (p * p) % MOD;
        if (y % 2 != 0) {
            p = (p * x) % MOD;
        }
        return p;
    }
}