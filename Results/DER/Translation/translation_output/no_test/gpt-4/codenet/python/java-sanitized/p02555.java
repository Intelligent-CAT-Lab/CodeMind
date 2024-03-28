import java.util.Scanner;
import java.math.BigInteger;

public class p02555 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }

        int n = s / 3;
        BigInteger[] fact = new BigInteger[2 * s + 1];
        BigInteger[] inv = new BigInteger[2 * s + 1];
        fact[0] = BigInteger.ONE;
        inv[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = BigInteger.valueOf(i).multiply(fact[i - 1]).mod(BigInteger.valueOf(MOD));
        }

        inv[inv.length - 1] = fact[fact.length - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = 2 * s; i > 1; i--) {
            inv[i - 1] = BigInteger.valueOf(i).multiply(inv[i]).mod(BigInteger.valueOf(MOD));
        }

        BigInteger ans = BigInteger.ZERO;
        for (int i = 1; i <= s; i++) {
            ans = ans.add(comb(fact, inv, s - 3 * i + i - 1, i - 1)).mod(BigInteger.valueOf(MOD));
        }

        System.out.println(ans);
        scanner.close();
    }

    private static BigInteger comb(BigInteger[] fact, BigInteger[] inv, int x, int y) {
        if (x < y || y < 0) {
            return BigInteger.ZERO;
        }
        return fact[x].multiply(inv[y]).mod(BigInteger.valueOf(MOD)).multiply(inv[x - y]).mod(BigInteger.valueOf(MOD));
    }
}