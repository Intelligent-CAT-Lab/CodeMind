import java.util.Scanner;

public class p04038 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 1) {
            System.out.println(1);
            System.exit(0);
        }

        int U = (N + 10) * (K + 10);
        long[] fact = makeFact(U);

        long[] dp = new long[N + 1];
        dp[1] = 1;

        for (int n = 2; n <= N; n++) {
            long[] prev = dp.clone();
            dp = new long[n + 1];

            long S = sumArray(prev) % MOD;
            cumsum(prev);
            for (int i = 1; i < prev.length; i++) {
                prev[i] %= MOD;
            }

            dp[1] = S;
            for (int i = 2; i < dp.length; i++) {
                dp[i] = (S - prev[i - 1] + MOD) % MOD;
            }

            long[] coef = new long[n * (K - 1) + 2];
            for (int i = 0; i < coef.length; i++) {
                coef[i] = fact[n * (K - 1) + 1 - i];
            }
            reverseArray(coef);
            long invK = modInverse(K - 2);
            for (int i = 0; i < coef.length; i++) {
                coef[i] *= invK;
                coef[i] %= MOD;
            }
            long[] factInv = new long[(n - 1) * (K - 1) + 4];
            for (int i = 0; i < factInv.length; i++) {
                factInv[i] = fact[i];
            }
            reverseArray(factInv);
            for (int i = 0; i < coef.length; i++) {
                coef[i] *= factInv[(n - 1) * (K - 1) + 1 - i];
                coef[i] %= MOD;
            }

            for (int i = 0; i < dp.length; i++) {
                dp[i] *= coef[i];
                dp[i] %= MOD;
            }
        }

        long answer = sumArray(dp) % MOD;
        answer *= fact[N];
        answer %= MOD;
        System.out.println(answer);
    }

    public static long[] makeFact(int U) {
        long[] fact = new long[U];
        fact[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        return fact;
    }

    public static void cumsum(long[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
            arr[i] %= MOD;
        }
    }

    public static long sumArray(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
            sum %= MOD;
        }
        return sum;
    }

    public static long modInverse(int a) {
        return power(a, MOD - 2);
    }

    public static long power(long x, long y) {
        long res = 1;
        x = x % MOD;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % MOD;
            }
            y = y >> 1;
            x = (x * x) % MOD;
        }
        return res;
    }

}