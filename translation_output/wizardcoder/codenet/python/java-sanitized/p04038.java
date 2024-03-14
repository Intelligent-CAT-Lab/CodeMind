import java.io.*;
import java.util.*;

public class p04038 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, K;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        if (K == 1) {
            bw.write("1");
            bw.newLine();
            bw.close();
            br.close();
            return;
        }

        int MOD = (int) Math.pow(10, 9) + 7;

        int U = (N + 10) * (K + 10);

        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];

        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int i = U - 1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % MOD;
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int n = 2; n <= N; n++) {
            int[] prev = Arrays.copyOf(dp, n);
            int S = 0;
            for (int i = 0; i < n; i++) {
                S = (S + prev[i]) % MOD;
            }
            dp[0] = S;
            dp[1] = S;
            for (int i = 2; i < n; i++) {
                dp[i] = (S - prev[i - 1]) % MOD;
            }
            int[] coef = new int[K - 1];
            for (int i = 0; i < K - 1; i++) {
                coef[i] = fact[n * (K - 1) - 1 - i];
            }
            coef = multiply(coef, fact_inv[K - 2]);
            coef = multiply(coef, fact_inv[(n - 1) * (K - 1) + 1]);
            dp = multiply(dp, coef);
        }

        int answer = dp[N];
        answer = (answer * fact[N]) % MOD;
        bw.write(String.