import java.util.Scanner;
import java.math.BigInteger;

public class p02334 {

    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;

        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(BigInteger.valueOf(MOD));
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger qInverse = q.modInverse(BigInteger.valueOf(MOD));
        BigInteger result = p.multiply(qInverse).mod(BigInteger.valueOf(MOD));
        System.out.println(result.longValue());
    }
}