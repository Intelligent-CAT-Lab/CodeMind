```java
import java.math.BigInteger;

public class Festival {
    static final BigInteger MOD = BigInteger.TEN.pow(18).add(BigInteger.valueOf(3));

    public static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = frac[i-1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit-1] = frac[limit-1].modPow(MOD.subtract(BigInteger.valueOf(2)), MOD);
        for (int i = limit-2; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(limit + i + 1)).mod(MOD);
        }

        return new BigInteger[]{frac, fraci};
    }

    public static BigInteger comb(int a, int b, BigInteger[] frac, BigInteger[] fraci) {
        if (a < b || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a-b]).mod(MOD);
    }

    public static void main(String[] args) {
        BigInteger[] result = frac(1341);
        BigInteger[] frac = result[0];
        BigInteger[] fraci = result[1];

        int K = 7;
        int seg = 128;
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j+i, i, frac, fraci).multiply(BigInteger.valueOf(1 << j)));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        StringBuilder ans = new StringBuilder("F".repeat(K) + "ESTIVAL");
        for (int l : L) {
            ans.insert(0, "F".repeat(l) + OT);
        }

        System.out.println(ans);
    }
}
```
