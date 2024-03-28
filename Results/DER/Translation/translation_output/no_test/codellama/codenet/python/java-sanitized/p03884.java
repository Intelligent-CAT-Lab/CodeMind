import java.math.BigInteger;

public class p03884 {
    private static final BigInteger MOD = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));

    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        int[] L = new int[301];

        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j + i, i).multiply(BigInteger.valueOf(2).pow(j)));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = l + "F" + OT + ans;
        }

        System.out.println(ans);
    }

    private static BigInteger comb(int a, int b) {
        if (a < b || b < 0) {
            return BigInteger.ZERO;
        }
        return frac(a).multiply(fraci(b)).multiply(fraci(a - b)).mod(MOD);
    }

    private static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = frac[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        return frac;
    }

    private static BigInteger[] fraci(int limit) {
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit - 1] = frac(limit).modInverse(MOD);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(limit + i + 1)).mod(MOD);
        }
        return fraci;
    }
}