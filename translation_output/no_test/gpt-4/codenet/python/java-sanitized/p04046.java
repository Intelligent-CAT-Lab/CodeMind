import java.util.Scanner;
import java.math.BigInteger;

public class p04046 {
    static final int MOD = 10_0000_0007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        BigInteger[] factorial = new BigInteger[H + W + 1];
        BigInteger[] inv_factorial = new BigInteger[H + W + 1];
        factorial[0] = BigInteger.ONE;
        inv_factorial[0] = BigInteger.ONE;
        
        for (int i = 1; i < H + W + 1; i++) {
            factorial[i] = factorial[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            inv_factorial[i] = factorial[i].modInverse(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = B + 1; i <= W; i++) {
            answer = answer.add(f(H - A, i, factorial, inv_factorial).multiply(f(A, W - i + 1, factorial, inv_factorial)));
            answer = answer.mod(BigInteger.valueOf(MOD));
        }

        System.out.println(answer.intValue());
    }

    private static BigInteger f(int h, int w, BigInteger[] factorial, BigInteger[] inv_factorial) {
        return factorial[h + w - 2].multiply(
                inv_factorial[h - 1].multiply(inv_factorial[w - 1])
        ).mod(BigInteger.valueOf(MOD));
    }
}