import java.util.Scanner;
import java.math.BigInteger;

public class p02862 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        BigInteger c = BigInteger.valueOf(fact(n))
            .multiply(modinv(BigInteger.valueOf(fact(x)), MOD))
            .multiply(modinv(BigInteger.valueOf(fact(y)), MOD))
            .mod(BigInteger.valueOf(MOD));

        System.out.println(c);
    }

    public static long fact(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static BigInteger modinv(BigInteger a, int m) {
        return a.modInverse(BigInteger.valueOf(m));
    }
}