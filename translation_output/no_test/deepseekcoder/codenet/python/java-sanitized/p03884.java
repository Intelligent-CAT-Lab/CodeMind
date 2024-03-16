import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    static BigInteger mod = BigInteger.valueOf(10).pow(18).add(BigInteger.valueOf(3));

    static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i-1]).mod(mod);
        }
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit-1] = frac[limit-1].modInverse(mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(limit + i + 1)).mod(mod);
        }
        return frac;
    }

    static BigInteger comb(BigInteger a, BigInteger b) {
        if (a.compareTo(b) < 0 || b.compareTo(BigInteger.ZERO) < 0) {
            return BigInteger.ZERO;
        }
        return a.multiply(fraci[b]).multiply(fraci[a.subtract(b)]).mod(mod);
    }

    static BigInteger[] fraci = frac(1341);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";

        BigInteger[] L = new BigInteger[301];
        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(BigInteger.valueOf(j+i), BigInteger.valueOf(i)).shiftLeft(j));
            }
            L[i] = K.divideAndRemainder(ci)[0];
            K = K.divideAndRemainder(ci)[1];
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int i = 0; i < 301; i++) {
            ans = L[i].toString() + "F".repeat(i) + OT + ans;
        }

        System.out.println(ans);
    }
}