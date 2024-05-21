import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02965 {
    static int MOD = 998244353;
    static int MAX = 300000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] factorials = new long[MAX];
        long[] invs = new long[MAX];
        factorials[0] = 1;
        invs[1] = 1;
        for (int i = 1; i < MAX; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
            if (i > 1) {
                invs[i] = (MOD - MOD / i) * invs[(int) (MOD % i)] % MOD;
            }
        }

        long[] invFactorials = new long[MAX];
        invFactorials[MAX - 1] = modInverse(factorials[MAX - 1]);
        for (int i = MAX - 2; i >= 0; i--) {
            invFactorials[i] = (invFactorials[i + 1] * (i + 1)) % MOD;
        }

        long odds = 0;
        for (int i = M % 2; i <= M; i += 2) {
            odds += nCr(N, i, MOD);
            odds %= MOD;
        }

        long halves = (M * 3 - M) / 2;
        long c1 = nCr(halves + N - 1, N - 1, MOD) * odds % MOD;

        long c2a = nCr(halves + N - 1, N - 1, MOD) * odds % MOD;
        long c2b = nCr(halves + N - 2, N - 2, MOD) * (N * odds % MOD) % MOD;
        long c2 = (c2a - c2b + MOD) % MOD;

        System.out.println((c1 - c2 + MOD) % MOD);
    }

    static long modInverse(long a) {
        return modPow(a, MOD - 2);
    }

    static long modPow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            n /= 2;
        }
        return res;
    }

    static long nCr(int n, int r, int mod) {
        if (n < r) {
            return 0;
        }
        if (r > n - r) {
            r = n - r;
        }
        long res = 1;
        for (int i = 0; i < r; i++) {
            res *= n - i;
            res %= mod;
            res *= modInverse(i + 1);
            res %= mod;
        }
        return res;
    }
}