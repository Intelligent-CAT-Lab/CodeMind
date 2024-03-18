import java.util.Scanner;
import java.math.BigInteger;

public class p04046 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        BigInteger[] factorial = new BigInteger[H + W + 1];
        BigInteger[] invFactorial = new BigInteger[H + W + 1];

        factorial[0] = BigInteger.ONE;
        invFactorial[0] = BigInteger.ONE;

        for (int i = 1; i < H + W + 1; i++) {
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i))
                            .mod(BigInteger.valueOf(MOD));
            invFactorial[i] = factorial[i].modInverse(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = B + 1; i <= W; i++) {
            answer = answer.add(
                 f(H - A, i, factorial, invFactorial)
                 .multiply(f(A, W - i + 1, factorial, invFactorial))
                 .mod(BigInteger.valueOf(MOD))
            ).mod(BigInteger.valueOf(MOD));
        }

        System.out.println(answer.intValue());
    }

    private static BigInteger f(int h, int w, BigInteger[] factorial, BigInteger[] invFactorial) {
        return factorial[h + w - 2]
                .multiply(invFactorial[h - 1])
                .multiply(invFactorial[w - 1])
                .mod(BigInteger.valueOf(MOD));
    }
}