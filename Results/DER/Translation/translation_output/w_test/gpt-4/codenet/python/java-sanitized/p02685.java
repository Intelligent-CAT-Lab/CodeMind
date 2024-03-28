import java.util.Scanner;
import java.math.BigInteger;

public class p02685 {
    private static final int MAX_N = (int)1e6;
    private static final int MOD = 998244353;
    private static BigInteger[] fact = new BigInteger[MAX_N + 4];
    private static BigInteger[] factInv = new BigInteger[MAX_N + 4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        // Precompute factorials and modular inverses
        precompute();

        BigInteger ans = BigInteger.ZERO;
        BigInteger mBI = BigInteger.valueOf(m);
        BigInteger mMinusOneBI = BigInteger.valueOf(m - 1);

        for (int x = 0; x <= k; x++) {
            BigInteger term = mBI.multiply(mMinusOneBI.modPow(BigInteger.valueOf(n - 1 - x), BigInteger.valueOf(MOD)))
                                 .multiply(modCombK(n - 1, x))
                                 .mod(BigInteger.valueOf(MOD));
            ans = ans.add(term).mod(BigInteger.valueOf(MOD));
        }

        if (ans.compareTo(BigInteger.ZERO) < 0) {
            ans = ans.add(BigInteger.valueOf(MOD));
        }
        System.out.println(ans);
    }

    private static void precompute() {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        factInv[factInv.length - 1] = fact[fact.length - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = factInv.length - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }
    }

    private static BigInteger modCombK(int n, int k) {
        return fact[n].multiply(factInv[k])
            .multiply(factInv[n - k])
            .mod(BigInteger.valueOf(MOD));
    }
}