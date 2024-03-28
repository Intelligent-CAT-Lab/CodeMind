import java.math.BigInteger;
import java.util.Scanner;

public class p03431 {
    private static final int P = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        BigInteger[] f = new BigInteger[k + 1];
        f[0] = BigInteger.ONE;
        for (int i = 1; i <= k; ++i) {
            // Computing factorial mod P
            f[i] = BigInteger.valueOf(i).multiply(f[i - 1]).mod(BigInteger.valueOf(P));
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = n - 1; i <= k; ++i) {
            // Computing the series using modular inverse and combination
            BigInteger term = f[k - 1].multiply(
                    f[i].modInverse(BigInteger.valueOf(P)).multiply(f[k - 1 - i].modInverse(BigInteger.valueOf(P)))
            ).mod(BigInteger.valueOf(P));

            sum = sum.add(term).mod(BigInteger.valueOf(P));
        }

        System.out.println(sum);
    }
}