import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03270 {
    static final long MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    static void precompute() {
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD-2);
        for (int n = U; n > 0; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

    static long comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] % MOD * fact_inv[n-k] % MOD;
    }

    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long res = 0;
        for (int i = 0; i <= n; i++) {
            res += comb(x,i) * pow(2,i) % MOD * comb(N+y-1,i+y-1) % MOD;
        }
        return res % MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int K = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);
        precompute();
        List<Long> answer = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            long x = F((S-1)/2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) != 0) {
            answer.remove(answer.size()-1);
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        } else {
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        }
        for (long num : answer) {
            System.out.println(num);
        }
    }
}