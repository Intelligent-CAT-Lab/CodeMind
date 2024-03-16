import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p03270 {
    private static final int MOD = 998244353;
    private static final int U = 10000;
    private static BigInteger[] fact = new BigInteger[U+1];
    private static BigInteger[] fact_inv = new BigInteger[U+1];

    static {
        Arrays.fill(fact, BigInteger.ONE);
        Arrays.fill(fact_inv, BigInteger.ONE);
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1].multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(MOD));
        }
        fact_inv[U] = fact[U].modInverse(BigInteger.valueOf(MOD));
        for (int n = U; n > 0; n--) {
            fact_inv[n - 1] = fact_inv[n].multiply(BigInteger.valueOf(n)).mod(BigInteger.valueOf(MOD));
        }
    }

    private static long comb(int n, int k) {
        if (!(0 <= k && k <= n)) {
            return 0;
        }
        return fact[n].multiply(fact_inv[k]).multiply(fact_inv[n - k]).mod(BigInteger.valueOf(MOD)).longValue();
    }

    private static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += comb(x, i) * BigInteger.valueOf(2).modPow(BigInteger.valueOf(i), BigInteger.valueOf(MOD)).longValue() *
                        comb(N + y - 1, i + y - 1) % MOD;
        }
        return sum % MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder answer = new StringBuilder();
        for (int S = 3; S <= K + 2; S += 2) {
            long x = F((S - 1) / 2, K - S + 1, N);
            answer.append(x).append("\n").append(x).append("\n");
        }

        if ((K & 1) == 1) {
            String[] answers = answer.toString().trim().split("\\s+");
            answer = new StringBuilder();
            for (int i = 0; i < answers.length - 1; i++) {
                answer.append(answers[i]).append("\n");
            }
            for (int i = answers.length - 3; i >= 0; i--) {
                answer.append(answers[i]).append("\n");
            }
        } else {
            String[] answers = answer.toString().trim().split("\\s+");
            answer = new StringBuilder();
            for (String ans : answers) {
                answer.append(ans).append("\n");
            }
            for (int i = answers.length - 2; i >= 0; i--) {
                answer.append(answers[i]).append("\n");
            }
        }

        System.out.print(answer.toString());
    }
}