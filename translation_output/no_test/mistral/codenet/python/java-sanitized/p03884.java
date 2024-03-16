import java.math.BigInteger;

public class p03884 {
    private static final BigInteger mod = BigInteger.valueOf(10000000000000000000L);

    private static BigInteger[] frac(int limit) {
        BigInteger[] frac = new BigInteger[limit];
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i.longValue()).multiply(frac[i-1]).mod(mod);
        }
        BigInteger[] fraci = new BigInteger[limit];
        fraci[limit-1] = frac[limit-1].pow(mod.subtract(BigInteger.valueOf(2)), mod).mod(mod);
        for (int i = limit-2; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(limit.longValue()+i+1)).mod(mod);
        }
        return new BigInteger[]{fracs, fraci};
    }

    private static BigInteger comb(int a, int b) {
        if (a < 0 || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a-b]).mod(mod);
    }

    public static void main(String[] args) {
        int K = Integer.parseInt(input());
        int seg = (int) Math.pow(2, 7);
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 299; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j+i, i).shiftLeft(j).intValue();
            }
            L[i] = K / ci;
            K %= ci;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < L.length; i++) {
            ans.append(L[i]).append("F");
        }
        ans.append(OT).append(ans.substring(ans.length()-2));

        System.out.println(ans.toString());
    }
}