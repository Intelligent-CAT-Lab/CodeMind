import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p04038 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] fact, factInv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (K == 1) {
            System.out.println(1);
            System.exit(0);
        }

        int U = (N + 10) * (K + 10);
        fact = new long[U + 1];
        factInv = new long[U + 1];
        makeFact(U);

        long[] dp = new long[N + 1];
        dp[0] = dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            long[] prev = dp.clone();
            dp = new long[n + 1];
            long S = sumArray(prev) % MOD;
            dp[1] = S;
            for (int i = 2; i <= n; i++) {
                dp[i] = S - sumArray(prev, i - 1);
            }
            long[] coef = new long[n * K];
            for (int i = 0; i < n * K; i++) {
                coef[i] = (i < fact.length ? fact[i] : 0);
            }
            coef = multiply(coef, factInv, K - 2, n * K - 1);
            dp = multiply(dp, coef, 0, n);
        }
        long answer = sumArray(dp) % MOD;
        answer = (answer * fact[N]) % MOD;
        System.out.println(answer);
    }