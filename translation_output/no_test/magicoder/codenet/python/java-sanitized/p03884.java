import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    static BigInteger mod = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));
    static BigInteger[] frac, fraci;

    static void frac(int limit) {
        frac = new BigInteger[limit];
        fraci = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(mod);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = BigInteger.valueOf(limit - i).multiply(fraci[i + 1]).mod(mod);
        }
    }

    static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";
        frac(1341);

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j + i, i).shiftLeft(j));
            }
            L[i] = K.divide(ci).intValue();
            K %= ci.intValue();
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L) {
            ans = "F".repeat(l) + OT + ans;
        }

        System.out.println(ans);
    }
}