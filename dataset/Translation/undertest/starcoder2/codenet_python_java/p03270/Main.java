import java.util.*;
import java.io.*;

public class p03270 {
    static int MOD = 998244353;
    static int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];
    static long comb(int n, int k) {
        if (k < 0 || n < k) return 0;
        return fact[n] * fact_inv[k] % MOD * fact_inv[n-k] % MOD;
    }
    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += comb(x, i) * pow(2, i) % MOD * comb(N+y-1, i+y-1) % MOD;
            ans %= MOD;
        }
        return ans;
    }
    static long pow(long x, long n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) ans = ans * x % MOD;
            x = x * x % MOD;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD-2);
        for (int n = U; n > 0; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
        ArrayList<Long> answer = new ArrayList<>();
        for (int S = 3; S <= K+3; S += 2) {
            long x = F((S-1)/2, K-S+1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) == 1) {
            answer.remove(answer.size()-1);
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        } else {
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        }
        for (long x : answer) {
            System.out.println(x);
        }
    }
}