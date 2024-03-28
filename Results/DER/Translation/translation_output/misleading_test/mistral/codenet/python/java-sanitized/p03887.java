import java.util.Scanner;

public class p03887 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] fact = new int[n + 1];
        int[] invFact = new int[n + 1];

        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            invFact[i] = inverse(fact[i]);
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

                int curAns = fact[x + y + z] * invFact[x] % MOD;
                curAns = curAns * invFact[y] % MOD;
                curAns = curAns * invFact[z] % MOD;
                curAns = curAns * comb(x + y + z + 1 + b / 2 - 1, b / 2) % MOD;
                curAns = curAns * comb(b / 2 + rest3 - 1, rest3) % MOD;

                ans = (ans + curAns) % MOD;
            }
        }

        System.out.println(ans);
    }

    private static int inverse(int k) {
        return fastPow(k, MOD - 2);
    }

    private static int fastPow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int p = fastPow(x, y / 2) % MOD;
        p = p * p % MOD;
        if (y % 2 != 0) {
            p = p * x % MOD;
        }
        return p;
    }

    private static int comb(int n, int k) {
        return fact[n] * invFact[n - k] * invFact[k] % MOD;
    }
}