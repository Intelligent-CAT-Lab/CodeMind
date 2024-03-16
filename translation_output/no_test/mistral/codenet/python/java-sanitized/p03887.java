import java.util.Scanner;

public class p03887 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] FACT = new int[n + 1];
        int[] INVERSE_FACT = new int[n + 1];

        FACT[0] = 1;
        INVERSE_FACT[0] = 1;
        for (int i = 1; i <= n; i++) {
            FACT[i] = FACT[i - 1] * i % MOD;
            INVERSE_FACT[i] = fastInverse(FACT[i]);
        }

        int ans = 0;
        if (b % 2 != 0) {
            System.out.println(0);
            return;
        }

        for (int y = 0; y <= Math.min(a + 1, c + 1); y++) {
            for (int z = 0; z <= (c - y) / 3 + 1; z++) {
                int x = a - y;
                int rest3 = c - y - 3 * z;

                if (b == 0 && rest3 != 0) {
                    continue;
                }

                int curAns = FACT[x + y + z] * fastInverse(FACT[x]) % MOD;
                curAns = curAns * fastInverse(FACT[y]) % MOD;
                curAns = curAns * fastInverse(FACT[z]) % MOD;
                curAns = curAns * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                curAns = curAns * comb(b / 2 + rest3 - 1, rest3) % MOD;

                ans = (ans + curAns) % MOD;
            }
        }

        System.out.println(ans);
    }

    private static int fastInverse(int num) {
        int p = num;
        int q = MOD - 2;
        while (p * p <= q) {
            p = p * p % q;
        }
        for (; p != 1; p = p * p % q) {
            if (num % p == 0) {
                return (q + num) % q;
            }
        }
        return 1;
    }

    private static int comb(int n, int k) {
        return FACT[n] * INVERSE_FACT[n - k] * INVERSE_FACT[k] % MOD;
    }
}