Below is the translated Java code for the given Python code:

```java
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    private static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] factorials = getFactorials(M * 3 / 2 + N, MOD);
        int[] finvs = modInvs(factorials, MOD);

        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = M % 2; i <= M; i += 2) {
            odds.add(i);
        }

        BigInteger c1 = BigInteger.ZERO;
        BigInteger c2 = BigInteger.ZERO;

        for (int odd : odds) {
            int halves = (M * 3 - odd) / 2;
            BigInteger oc1 = ncr(N, odd, factorials, finvs, MOD);
            BigInteger oc2 = ncr(N - 1, odd, factorials, finvs, MOD);

            BigInteger ncrValue = ncr(halves + N - 1, N - 1, factorials, finvs, MOD);
            c1 = c1.add(ncrValue.multiply(oc1)).mod(BigInteger.valueOf(MOD));

            halves = (M - odd) / 2;
            BigInteger c2a = ncr(halves + N - 1, N - 1, factorials, finvs, MOD).multiply(oc1).mod(BigInteger.valueOf(MOD));
            BigInteger c2b = ncr(halves + N - 2, N - 2, factorials, finvs, MOD).multiply(oc2).mod(BigInteger.valueOf(MOD));
            c2 = c2.add(c2a.subtract(c2b).multiply(BigInteger.valueOf(N)).mod(BigInteger.valueOf(MOD)));
        }

        System.out.println(c1.subtract(c2).mod(BigInteger.valueOf(MOD)));

    }

    private static int[] getFactorials(int max, int mod) {
        int[] ret = new int[max + 1];
        ret[0] = 1;
        for (int i = 1; i <= max; i++) {
            ret[i] = (int)(((long)ret[i - 1] * i) % mod);
        }
        return ret;
    }

    private static int[] modInvs(int[] factorials, int mod) {
        int[] invs = new int[factorials.length];
        invs[1] = 1;
        for (int i = 2; i < invs.length; i++) {
            invs[i] = mod - (mod / i) * invs[mod % i] % mod;
        }

        int p = 1;
        for (int i = 1; i < invs.length; i++) {
            p = (int)(((long)p * invs[i]) % mod);
            invs[i] = p;
        }
        return invs;
    }

    private static BigInteger ncr(int n, int r, int[] factorials, int[] finvs, int mod) {
        if (n < r) return BigInteger.ZERO;
        BigInteger ncr = BigInteger.valueOf(factorials[n])
                .multiply(BigInteger.valueOf(finvs[r]))
                .multiply(BigInteger.valueOf(finvs[n - r]))
                .mod(BigInteger.valueOf(mod));
        return ncr;
    }
}
```

Before running this program, please make sure that you've handled input and output correctly as the translated Java program assumes that input will be provided in the standard input and output will be printed to the standard output. Also, Java's I/O can be slow, and you may need to use a faster I/O method like `BufferedReader` and `PrintWriter` for large input datasets, as implemented in the above example.

The included code defines equivalent methods for calculating factorials, modular inverses, and the `ncr` function, mirroring the functionality of the Python version. The Python `numpy` array operations were replaced with Java data structures like `ArrayList`. BigInteger is used to handle calculations that may exceed the limit of primitive integer types and ensure correct modular arithmetic.
