import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class p02965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MOD = 998244353;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        BigInteger[] finvs = new BigInteger[M * 3 / 2 + N + 1];
        BigInteger p = BigInteger.ONE;
        for (int i = 0; i < finvs.length; i++) {
            BigInteger inv = modInvs(M * 3 / 2 + N, MOD)[i];
            p = p.multiply(inv).mod(BigInteger.valueOf(MOD));
            finvs[i] = p;
        }

        // Calculate nCr values
        BigInteger sum = BigInteger.ZERO;
        for (int odds = M % 2; odds <= M; odds += 2) {
            int halves = (M * 3 - odds) / 2;

            BigInteger oc1 = ncr(N, odds, factorials, finvs, MOD);
            BigInteger oc2 = ncr(N - 1, odds, factorials, finvs, MOD);

            BigInteger c1 = ncr(halves + N - 1, N - 1, factorials, finvs, MOD).multiply(oc1).mod(BigInteger.valueOf(MOD));

            halves = (M - odds) / 2;
            BigInteger c2a = ncr(halves + N - 1, N - 1, factorials, finvs, MOD).multiply(oc1).mod(BigInteger.valueOf(MOD));
            BigInteger c2b = ncr(halves + N - 2, N - 2, factorials, finvs, MOD).multiply(oc2).mod(BigInteger.valueOf(MOD));

            BigInteger c2 = c2a.subtract(c2b).multiply(BigInteger.valueOf(N)).mod(BigInteger.valueOf(MOD));
            sum = sum.add(c1).subtract(c2);
        }

        System.out.println(sum.mod(BigInteger.valueOf(MOD)));
    }

    private static BigInteger[] getFactorials(int max, int mod) {
        BigInteger[] ret = new BigInteger[max + 1];
        ret[0] = BigInteger.ONE;
        BigInteger n = BigInteger.ONE;
        for (int i = 1; i <= max; i++) {
            n = n.multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(mod));
            ret[i] = n;
        }
        return ret;
    }

    private static BigInteger[] modInvs(int max, int mod) {
        BigInteger[] invs = new BigInteger[max + 1];
        invs[1] = BigInteger.ONE;
        for (int x = 2; x <= max; x++) {
            invs[x] = BigInteger.valueOf(mod - mod / x).multiply(invs[mod % x]).mod(BigInteger.valueOf(mod));
        }
        return invs;
    }

    private static BigInteger ncr(int n, int r, BigInteger[] factorials, BigInteger[] finvs, int mod) {
        BigInteger ret = factorials[n].multiply(finvs[r]).mod(BigInteger.valueOf(mod))
                .multiply(finvs[n - r]).mod(BigInteger.valueOf(mod));
        if (n < r) {
            ret = BigInteger.ZERO;
        }
        return ret;
    }
}