import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p03270 {
    
    static final int MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 1; i <= U; i++) {
            fact[i] = fact[i-1] * i % MOD;
        }
        fact_inv[U] = modPow(fact[U], MOD - 2, MOD);
        for (int i = U-1; i >= 0; i--) {
            fact_inv[i] = fact_inv[i+1] * (i + 1) % MOD;
        }

        String[] inputs = br.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);

        long[] answer = new long[2 * (K - 1) / 2 + 1];
        int index = 0;
        
        for (int S = 3; S <= K + 2; S += 2) {
            long x = F((S-1) / 2, K - S + 1, N);
            answer[index++] = x;
            answer[index++] = x;
        }

        if ((K & 1) == 1) {
            long[] newAnswer = new long[2 * (K - 1) / 2];
            for (int i = 0; i < newAnswer.length; i++) {
                newAnswer[i] = answer[i];
            }
            for (int i = newAnswer.length - 1; i >= 0; i--) {
                answer[index++] = newAnswer[i];
            }
        } else {
            long[] newAnswer = new long[2 * (K - 1) / 2];
            for (int i = 0; i < newAnswer.length; i++) {
                newAnswer[i] = answer[i];
            }
            for (int i = newAnswer.length - 1; i >= 0; i--) {
                answer[index++] = newAnswer[i];
            }
        }

        for (long result : answer) {
            System.out.println(result);
        }
    }

    static long modPow(long base, int exp, int modulus) {
        long result = 1;
        base %= modulus;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exp /= 2;
        }
        return result;
    }

    static long comb(int n, int k) {
        if (!(0 <= k && k <= n)) {
            return 0;
        }
        return (fact[n] * fact_inv[k] % MOD) * fact_inv[n - k] % MOD;
    }

    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (comb(x, i) * modPow(2, i, MOD) % MOD) * comb(N + y - 1, i + y - 1) % MOD;
            sum %= MOD;
        }
        return sum;
    }
}