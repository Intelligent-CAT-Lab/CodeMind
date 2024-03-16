import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    private static final BigInteger MOD = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));

    private static BigInteger[] frac;
    private static BigInteger[] fraci;

    public static void main(String[] args) {
        frac(1341);

        Scanner scanner = new Scanner(System.in);
        long K = scanner.nextLong();
        scanner.close();

        final int seg = 1 << 7;
        final String OT = "EESSTTIIVVAALL";

        long[] L = new long[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(i + j, i).multiply(BigInteger.valueOf(2).pow(j)));
            }
            L[i] = K / ci.longValue();
            K %= ci.longValue();
        }

        String ans = "F".repeat(Math.toIntExact(K)) + "ESTIVAL";
        for (long l : L) {
            ans = "F".repeat(Math.toIntExact(l)) + OT + ans;
        }

        System.out.println(ans);
    }

    private static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(MOD);
    }

    private static void frac(int limit) {
        frac = new BigInteger[limit];
        fraci = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(MOD);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(MOD);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
    }
}