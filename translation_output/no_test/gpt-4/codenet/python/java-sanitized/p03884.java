import java.util.Scanner;
import java.math.BigInteger;

public class p03884 {
    private static final BigInteger MOD = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));
    private static final int SEG = 128;
    private static final String OT = "EESSTTIIVVAALL";
    private static BigInteger[] frac;
    private static BigInteger[] fraci;

    public static void main(String[] args) {
        initFrac(1341);
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        int[] L = new int[301];
        for (int i = 300; i >= 0; --i) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; ++j) {
                ci = ci.add(comb(j + i, i).multiply(BigInteger.valueOf(2).pow(j)));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        StringBuilder ans = new StringBuilder("F".repeat(K)).append("ESTIVAL");
        for (int l : L) {
            ans.insert(0, "F".repeat(l)).insert(l, OT);
        }

        System.out.println(ans.toString());
    }

    private static void initFrac(int limit) {
        frac = new BigInteger[limit];
        fraci = new BigInteger[limit];
        frac[1] = BigInteger.ONE;
        for (int i = 2; i < limit; ++i) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(MOD);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(MOD);
        for (int i = limit - 2; i >= 0; --i) {
            fraci[i] = BigInteger.valueOf(i + 1).multiply(fraci[i + 1]).mod(MOD);
        }
    }

    private static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(MOD);
    }
}