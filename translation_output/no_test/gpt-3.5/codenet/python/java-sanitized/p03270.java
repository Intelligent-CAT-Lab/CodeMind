import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03270 {

    static int MOD = 998244353;
    static int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        try {
            fact[0] = 1;
            fact_inv[0] = 1;
            for (int n = 1; n <= U; n++) {
                fact[n] = fact[n-1] * n % MOD;
            }
            fact_inv[U] = pow(fact[U], MOD-2, MOD);
            for (int n = U-1; n >= 1; n--) {
                fact_inv[n] = fact_inv[n+1] * (n+1) % MOD;
            }
            
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            long[] answer = new long[(K+3)/2];
            for (int S = 3; S <= K+3; S += 2) {
                int x = F((S-1)/2, K - S + 1, N);
                answer[(S-3)/2] = x;
                answer[S/2] = x;
            }

            if ((K & 1) == 1) {
                long[] newAnswer = new long[K];
                for (int i = 0; i < K-1; i++) {
                    newAnswer[i] = answer[i];
                }
                for (int i = 0; i < K-1; i++) {
                    newAnswer[i+K-1] = answer[K-2-i];
                }
                answer = newAnswer;
            } else {
                long[] newAnswer = new long[K];
                for (int i = 0; i < K; i++) {
                    newAnswer[i] = answer[i];
                }
                for (int i = 0; i < K-1; i++) {
                    newAnswer[i+K] = answer[K-2-i];
                }
                answer = newAnswer;
            }

            for (long ans : answer) {
                System.out.println(ans);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static long comb(int n, int k) {
        if (!(0 <= k && k <= n)) {
            return 0;
        }
        return fact[n] * fact_inv[k] % MOD * fact_inv[n-k] % MOD;
    }

    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result = (result + comb(x, i) * pow(2, i, MOD) % MOD * comb(N+y-1, i+y-1) % MOD) % MOD;
        }
        return result;
    }

    static long pow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}