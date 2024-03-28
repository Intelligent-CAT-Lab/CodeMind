import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    private static final BigInteger MOD = new BigInteger("1000000000000000003");
    private static final int LIMIT = 1341;
    private static BigInteger[] frac = new BigInteger[LIMIT];
    private static BigInteger[] fraci = new BigInteger[LIMIT];
    
    private static void calculateFracs() {
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < LIMIT; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(MOD);
        }
        fraci[LIMIT - 1] = frac[LIMIT - 1].modInverse(MOD);
        for (int i = LIMIT - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
    }
    
    private static BigInteger comb(int a, int b) {
        if (!(a >= b && b >= 0)) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(MOD);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        BigInteger seg = BigInteger.valueOf(2).pow(7);
        String OT = "EESSTTIIVVAALL";
        int[] L = new int[301];

        calculateFracs();

        for (int i = 300; i >= 0; i--) {
            BigInteger ci = BigInteger.ZERO;
            for (int j = 0; j < 8; j++) {
                ci = ci.add(comb(j + i, i).shiftLeft(j));
            }
            L[i] = K / ci.intValue();
            K %= ci.intValue();
        }

        StringBuilder ans = new StringBuilder("F".repeat(K)).append("ESTIVAL");
        for (int l : L) {
            ans.insert(0, ("F".repeat(l) + OT));
        }

        System.out.println(ans);
    }
}