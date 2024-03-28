import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p04038 {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int[] fact = new int[(N + 10) * (K + 10)];
        int[] factInv = new int[(N + 10) * (K + 10)];
        makeFact(fact, factInv);

        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int n = 2; n <= N; n++) {
            int[] prev = dp.clone();
            dp = new int[n + 1];

            int S = 0;
            for (int i = 1; i <= n; i++) {
                S = (S + prev[i]) % MOD;
                prev[i] = (prev[i] + prev[i - 1]) % MOD;
            }

            dp[1] = S;
            for (int i = 2; i <= n; i++) {
                dp[i] = (S - prev[i - 1] + MOD) % MOD;
            }

            int[] coef = new int[n * (K - 1) + K];
            System.arraycopy(fact, n * (K - 1), coef, 0, K);
            reverseArray(coef);
            multiplyMod(coef, factInv[K - 2], MOD);
            multiplyMod(coef, range(factInv, (n - 1) * (K - 1), (n - 1) * K + 2), MOD);
            multiplyMod(dp, coef, MOD);
        }

        int answer = 0;
        for (int val : dp) {
            answer = (answer + val) % MOD;
        }

        answer = (int) ((long) answer * fact[N] % MOD);
        System.out.println(answer);
    }

    static void makeFact(int[] fact, int[] factInv) {
        fact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }

        factInv[factInv.length - 1] = pow(fact[fact.length - 1], MOD - 2);
        for (int i = factInv.length - 2; i >= 0; i--) {
            factInv[i] = (int) ((long) factInv[i + 1] * (i + 1) % MOD);
        }
    }

    static int pow(int base, int exp) {
        if (exp == 0) return 1;
        long res = 1;
        long b = base;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * b) % MOD;
            }
            b = (b * b) % MOD;
            exp /= 2;
        }
        return (int) res;
    }

    static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    static void multiplyMod(int[] arr, int multiplier, int mod) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((long) arr[i] * multiplier % mod);
        }
    }

    static void multiplyMod(int[] arr, int[] multiplier, int mod) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((long) arr[i] * multiplier[i] % mod);
        }
    }

    static int[] range(int[] arr, int start, int end) {
        int[] result = new int[end - start];
        System.arraycopy(arr, start, result, 0, end - start);
        return result;
    }
}