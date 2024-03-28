import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class p03884 {
    private static final BigInteger mod = BigInteger.valueOf(10000000000000000000L);

    public static void main(String[] args) {
        int K = 7;
        int seg = 1 << 7;
        String OT = "EESSTTIIVVAALL";

        Map<Integer, Integer> L = new HashMap<>();
        for (int i = 299; i >= 0; i--) {
            int ci = comb(i + seg, seg) * (1 << i);
            L.put(i, K / ci);
            K %= ci;
        }

        String ans = "F".repeat(K) + "ESTIVAL";
        for (int l : L.values()) {
            ans = l + OT + ans;
        }

        System.out.println(ans);
    }

    private static int comb(int a, int b) {
        if (a < b || b < 0) {
            return 0;
        }
        return (int) Math.pow(frac(a), b) % mod.intValue();
    }

    private static int[] frac(int limit) {
        int[] frac = new int[limit];
        for (int i = 1; i < limit; i++) {
            frac[i] = i * frac[i - 1] % mod.intValue();
        }
        int[] fraci = new int[limit];
        fraci[limit - 1] = pow(frac(limit - 1), mod.subtract(BigInteger.valueOf(2)).intValue(), mod.intValue());
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1] * (limit + i + 1) % mod.intValue();
        }
        return new int[]{fracs, fraci};
    }

    private static BigInteger pow(int a) {
        BigInteger result = BigInteger.valueOf(a);
        while (result.compareTo(BigInteger.ONE) < 0) {
            result = result.multiply(BigInteger.valueOf(a));
        }
        return result;
    }
}