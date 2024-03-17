import java.math.BigInteger;
import java.util.Scanner;

public class p03884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;

        BigInteger[] frac = new BigInteger[1341];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < 1341; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i-1]).mod(BigInteger.valueOf(mod));
        }

        BigInteger[] fraci = new BigInteger[1341];
        fraci[1340] = frac[1340].modInverse(BigInteger.valueOf(mod));
        for (int i = 1339; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(1340-i).add(BigInteger.ONE)).mod(BigInteger.valueOf(mod));
        }

        int K = sc.nextInt();
        int seg = 128;
        String OT = "EESSTTIIVVAALL";

        int[] L = new int[301];
        for (int i = 300; i >= 0; i--) {
            int ci = 0;
            for (int j = 0; j < 8; j++) {
                ci += comb(j+i, i)*Math.pow(2, j);
            }
            L[i] = K/ci;
            K %= ci;
        }

        String ans = "F"*K + "ESTIVAL";
        for (int l : L) {
            ans = l*"F" + OT + ans;
        }

        System.out.println(ans);
    }

    public static int comb(int a, int b) {
        if (a < 0 || b < 0 || a < b) {
            return 0;
        }
        return (int) (frac[a].multiply(fraci[b]).multiply(fraci[a-b]).mod(BigInteger.valueOf(mod)).longValue());
    }

    private static final BigInteger mod = BigInteger.valueOf(1000000007);
    private static final BigInteger[] frac = new BigInteger[1341];
    private static final BigInteger[] fraci = new BigInteger[1341];
    static {
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < 1341; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i-1]).mod(mod);
        }
        fraci[1340] = frac[1340].modInverse(mod);
        for (int i = 1339; i >= 0; i--) {
            fraci[i] = fraci[i+1].multiply(BigInteger.valueOf(1340-i).add(BigInteger.ONE)).mod(mod);
        }
    }
}