Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger mod = BigInteger.valueOf(1000000007);

    static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        Arrays.fill(frac, BigInteger.ONE);
        for (int i = 2; i < limit; i++) {
            frac[i] = frac[i - 1].multiply(BigInteger.valueOf(i)).mod(mod);
        }
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit - 1] = frac[limit - 1].modInverse(mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(limit + i + 1)).mod(mod);
        }
        return frac;
    }

    static BigInteger comb(int a, int b) {
        if (a < b || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[302];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j + i, i) * (1 << j);
            }
            L[i] = K / ci;
            K %= ci;
        }

        StringBuilder ans = new StringBuilder();
        ans.append("F".repeat(K
