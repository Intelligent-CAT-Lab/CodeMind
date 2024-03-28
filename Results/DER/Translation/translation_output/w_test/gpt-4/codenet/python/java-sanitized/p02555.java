import java.math.BigInteger;
import java.util.Scanner;

public class p02555 {
    public static final BigInteger MOD = BigInteger.valueOf(1_000_000_007);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3; // This is not used in the rest of the program

        BigInteger[] fact = new BigInteger[2 * s + 1];
        BigInteger[] inv = new BigInteger[2 * s + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = BigInteger.valueOf(i).multiply(fact[i - 1]).mod(MOD);
        }
        
        inv[inv.length - 1] = fact[fact.length - 1].modInverse(MOD);
        for (int i = inv.length - 1; i > 1; i--) {
            inv[i - 1] = BigInteger.valueOf(i).multiply(inv[i]).mod(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        for (int i = 1; i <= s; i++) {
            ans = ans.add(comb(fact, inv, s - 3 * i + i - 1, i - 1)).mod(MOD);
        }
        System.out.println(ans);
        
        sc.close();
    }

    public static BigInteger comb(BigInteger[] fact, BigInteger[] inv, int x, int y) {
        if (x >= y && y >= 0) {
            return fact[x].multiply(inv[y]).mod(MOD).multiply(inv[x - y]).mod(MOD);
        }
        return BigInteger.ZERO;
    }
}