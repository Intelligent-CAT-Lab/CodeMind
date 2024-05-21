import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02965 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int mod = 998244353;
        int[] factorials = new int[m * 3 / 2 + n + 1];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = (int) ((long) factorials[i - 1] * i % mod);
        }

        int[] invs = new int[m * 3 / 2 + n + 1];
        invs[1] = 1;
        for (int i = 2; i < invs.length; i++) {
            invs[i] = mod - (int) ((long) (mod / i) * invs[mod % i] % mod);
        }

        int[] finvs = new int[m * 3 / 2 + n + 1];
        finvs[0] = 1;
        for (int i = 1; i < finvs.length; i++) {
            finvs[i] = (int) ((long) finvs[i - 1] * invs[i] % mod);
        }

        long[] combs = new long[m * 3 / 2 + n + 1];
        for (int i = 0; i <= n; i++) {
            combs[i] = (long) factorials[n] * finvs[i] % mod * finvs[n - i] % mod;
        }

        long[] oddCombs = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs[i] = (long) factorials[n] * finvs[i] % mod * finvs[n - i] % mod;
        }

        long[] evenCombs = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evenCombs[i] = (long) factorials[n - 1] * finvs[i] % mod * finvs[n - 1 - i] % mod;
        }

        long[] odds = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            odds[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs2 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs2[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens2 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens2[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs3 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs3[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens3 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens3[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs4 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs4[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens4 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens4[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs5 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs5[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens5 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens5[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs6 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs6[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens6 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens6[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs7 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs7[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens7 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens7[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs8 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs8[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens8 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens8[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs9 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs9[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens9 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens9[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] oddCombs10 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            oddCombs10[i] = (long) factorials[m - i] * finvs[2] % mod * finvs[m - i - 1] % mod;
        }

        long[] evens10 = new long[m + 1];
        for (int i = 0; i <= m; i++) {
            evens10[i] = (long) factor