import java.util.*;
import java.io.*;

class Main {
    static long MOD = 100000007;
    static int MAX = 2000;
    static long[] fact = new long[MAX];
    static long[] invFact = new long[MAX];
    static long[] unused = new long[MAX];
    static long[][] dp = new long[MAX][MAX];
    static int[][] abli = new int[MAX][2];
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2;
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            abli[i][0] = sc.nextInt();
            abli[i][1] = sc.nextInt();
        }
        sc.close();

        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[MAX - 1] = modInverse(fact[MAX - 1]);
        for (int i = MAX - 2; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }

        for (int i = 0; i < k; i++) {
            if (abli[i][0] > abli[i][1]) {
                int tmp = abli[i][0];
                abli[i][0] = abli[i][1];
                abli[i][1] = tmp;
            }
        }
        Arrays.sort(abli, (a, b) -> a[0] - b[0]);

        for (int i = 1; i <= n; i++) {
            unused[i] = 1;
        }
        for (int i = 0; i < k; i++) {
            unused[abli[i][0]]--;
            unused[abli[i][1]]--;
        }
        for (int i = 1; i <= n; i++) {
            unused[i] += unused[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                boolean isSandwiched = false;
                for (int l = 0; l < k; l++) {
                    if (abli[l][0] < i && j < abli[l][1]) {
                        isSandwiched = true;
                        break;
                    }
                }
                if (!isSandwiched) {
                    dp[i][j] = (doubleFactorial(unused[j] - unused[i - 1]) - getSum(i, j)) % MOD;
                    if (dp[i][j] < 0) {
                        dp[i][j] += MOD;
                    }
                }
            }
        }

        long ans = 0;
        int undetermined = unused[n] - unused[0];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (dp[i][j]!= 0) {
                    ans += dp[i][j] * doubleFactorial(undetermined - (unused[j] - unused[i - 1]));
                    ans %= MOD;
                }
            }
        }
        System.out.println(ans);
    }

    static long getSum(int i, int j) {
        long sum = 0;
        for (int l = 0; l < k; l++) {
            if (abli[l][0] < i && j < abli[l][1]) {
                sum += dp[i][abli[l][0]] * dp[abli[l][1] + 1][j] % MOD;
                sum %= MOD;
            }
        }
        return sum;
    }

    static long doubleFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            return fact[x - 1] * invFact[x - 1] % MOD;
        } else {
            return 0;
        }
    }

    static long modInverse(long a, long m) {
        long[] ans = extGCD(a, m);
        return (ans[0] + m) % m;
    }

    static long[] extGCD(long a, long b) {
        if (b == 0) {
            return new long[]{1, 0};
        } else {
            long[] ans = extGCD(b, a % b);
            long tmp = ans[0];
            ans[0] = ans[1];
            ans[1] = tmp - (a / b) * ans[1];
            return ans;
        }
    }
}