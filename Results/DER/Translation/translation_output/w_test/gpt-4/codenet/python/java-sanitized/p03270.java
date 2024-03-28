import java.io.*;
import java.util.StringTokenizer;

public class p03270 {
    static final int MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U + 1];
    static long[] fact_inv = new long[U + 1];
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // Pre-calculate factorials and their modular inverses
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }
        fact_inv[U] = modInverse(fact[U], MOD);
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = (fact_inv[n] * n) % MOD;
        }

        // Solve using the provided F() function
        long[] answer = new long[(K & 1) == 0 ? 2 * K : 2 * K - 1];
        int index = 0;
        for (int S = 3; S <= K + 2; S += 2) {
            long x = F((S - 1) / 2, K - S + 1, N);
            answer[index++] = x;
            answer[index++] = x;
        }

        // Adjusting the answer according to the parity of K
        if ((K & 1) == 1) {
            index -= 1;
            for (int i = index - 3; i >= 0; i -= 2) {
                answer[index++] = answer[i];
            }
        } else {
            for (int i = index - 2; i >= 0; i -= 2) {
                answer[index++] = answer[i];
            }
        }

        // Output the result
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < index; i++) {
            output.write(answer[i] + "\n");
        }
        output.flush();
    }

    // Function to calculate combinations modularly
    static long comb(int n, int k) {
        if (!(0 <= k && k <= n)) {
            return 0;
        }
        return ((fact[n] * fact_inv[k]) % MOD * fact_inv[n - k]) % MOD;
    }

    // Fast exponentiation with mod
    static long fastPow(long a, long b, long mod) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
    }

    // Modular multiplicative inverse
    static long modInverse(long a, long mod) {
        return fastPow(a, mod - 2, mod);
    }

    // Function F as given in the original code
    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = (sum + comb(x, i) * fastPow(2, i, MOD) % MOD * comb(N + y - 1, i + y - 1) % MOD) % MOD;
        }
        return sum;
    }
}