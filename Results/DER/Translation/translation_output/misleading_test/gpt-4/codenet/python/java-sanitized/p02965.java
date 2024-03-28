import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p02965 {
    static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] modInvs = modInvs(M * 3 / 2 + N, MOD);

        BigInteger[] finvs = new BigInteger[M * 3 / 2 + N + 1];
        BigInteger p = BigInteger.ONE;
        for (int i = 0; i <= M * 3 / 2 + N; ++i) {
            p = p.multiply(BigInteger.valueOf(modInvs[i])).mod(BigInteger.valueOf(MOD));
            finvs[i] = p;
        }

        long result = 0;
        for (int odds = M % 2; odds <= M; odds += 2) {
            int halves = (M * 3 - odds) / 2;

            long oc1 = ncr(N, odds, factorials, finvs);
            long oc2 = ncr(N - 1, odds, factorials, finvs);

            long c1 = ncr(halves + N - 1, N - 1, factorials, finvs) * oc1 % MOD;

            halves = (M - odds) / 2;
            long c2a = ncr(halves + N - 1, N - 1, factorials, finvs) * oc1 % MOD;
            long c2b = ncr(halves + N - 2, N - 2, factorials, finvs) * oc2 % MOD;

            long c2 = (c2a - c2b + MOD) % MOD * N % MOD;

            result = (result + c1 - c2 + MOD) % MOD;
        }

        System.out.println(result);
    }

    private static int[] getFactorials(int max, int mod) {
        int[] ret = new int[max + 1];
        ret[0] = 1;
        for (int i = 1; i <= max; ++i) {
            ret[i] = (int) ((long) ret[i - 1] * i % mod);
        }
        return ret;
    }

    private static int[] modInvs(int max, int mod) {
        int[] invs = new int[max + 1];
        invs[1] = 1;
        for (int x = 2; x <= max; ++x) {
            invs[x] = (int) ((mod - (long) (mod / x) * invs[mod % x] % mod) % mod);
        }
        return invs;
    }

    private static long ncr(int n, int r, int[] factorials, BigInteger[] finvs) {
        if (n < r) return 0;
        return (long) factorials[n] * finvs[r].intValue() % MOD * finvs[n - r].intValue() % MOD;
    }
}