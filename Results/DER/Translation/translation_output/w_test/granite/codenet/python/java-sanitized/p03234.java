import java.io.*;
import java.util.*;

public class p03234 {
    static long MOD = 100000007;
    static long[] fact;
    static long[] invFact;

    static long modInv(long a, long b) {
        return modPow(a, b - 2, b);
    }

    static long modPow(long a, long b, long mod) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        return ans;
    }

    static void init() {
        fact = new long[200001];
        invFact = new long[200001];
        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1; i <= 200000; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            invFact[i] = modInv(fact[i], MOD);
        }
    }

    static long doubleFactorial(int n) {
        if (n % 2 == 0) {
            return fact[n - 1];
        } else {
            return 0;
        }
    }

    static long nCr(int n, int r) {
        if (n < r) {
            return 0;
        }
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    public static void main(String[] args) throws Exception {
        init();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]) * 2;
        int k = Integer.parseInt(in[1]);
        int[][] ab = new int[k][2];
        for (int i = 0; i < k; i++) {
            in = br.readLine().split(" ");
            ab[i][0] = Integer.parseInt(in[0]) - 1;
            ab[i][1] = Integer.parseInt(in[1]) - 1;
        }
        int[] count = new int[n];
        for (int i = 0; i < k; i++) {
            if (ab[i][0] > ab[i][1]) {
                int tmp = ab[i][0];
                ab[i][0] = ab[i][1];
                ab[i][1] = tmp;
            }
            count[ab[i][0]]++;
            count[ab[i][1] + 1]--;
        }
        for (int i = 1; i < n; i++) {
            count[i] += count[i - 1];
        }
        int[] nonSandwiched = new int[n];
        for (int i = 0; i < n; i++) {
            if (count[i] == 0) {
                nonSandwiched[i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            nonSandwiched[i] += nonSandwiched[i - 1];
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[j] - count[i] == j - i - 1) {
                    long tmp = doubleFactorial(j - i - 1);
                    for (int l = 0; l < k; l++) {
                        if (ab[l][0] >= i && ab[l][1] <= j) {
                            continue;
                        }
                        if (ab[l][0] >= i && ab[l][0] <= j && ab[l][1] > j) {
                            tmp = tmp * nCr(count[j] - count[i], 2) % MOD;
                        } else if (ab[l][0] < i && ab[l][1] >= i && ab[l][1] <= j) {
                            tmp = tmp * nCr(count[j] - count[i], 1) % MOD;
                        }
                    }
                    ans = (ans + tmp) % MOD;
                }
            }
        }
        System.out.println(ans);
    }
}