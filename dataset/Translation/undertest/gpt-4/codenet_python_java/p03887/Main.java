import java.util.Scanner;

public class p03887 {

    private static final int MOD = 1000000007;
    private static long[] FACT;
    private static long[] INVERSE_FACT;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        FACT = new long[n + 1];
        INVERSE_FACT = new long[n + 1];

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = FACT[i - 1] * i % MOD;
            INVERSE_FACT[i] = inverse(FACT[i]);
        }

        long ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a, c); y++) {
            for (int z = 0; z <= (c - y) / 3; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                long cur_ans = FACT[x + y + z] * INVERSE_FACT[x] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[y] % MOD;
                cur_ans = cur_ans * INVERSE_FACT[z] % MOD;
                cur_ans = cur_ans * comb(x + y + z + b / 2, b / 2) % MOD;
                cur_ans = cur_ans * comb(b / 2 + rest3, rest3) % MOD;

                ans = (ans + cur_ans) % MOD;
            }
        }

        System.out.println(ans);

        input.close();
    }

    private static long inverse(long k) {
        return fastPow(k, MOD - 2);
    }

    private static long comb(int n, int k) {
        return FACT[n] * INVERSE_FACT[n - k] % MOD * INVERSE_FACT[k] % MOD;
    }

    private static long fastPow(long x, long y) {
        if (y == 0) {
            return 1;
        }
        long p = fastPow(x, y / 2) % MOD;
        p = p * p % MOD;
        if (y % 2 == 1) {
            p = p * x % MOD;
        }
        return p;
    }
}