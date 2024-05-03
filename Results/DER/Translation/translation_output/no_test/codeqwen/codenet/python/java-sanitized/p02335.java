import java.util.Scanner;
import java.math.BigInteger;

public class p02335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger result = C(k, n).mod(MOD);
        if (n < k) {
            System.out.println(result);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static BigInteger P(int n, int r) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            result = result.multiply(BigInteger.valueOf(n - r + i));
        }
        return result;
    }

    public static BigInteger C(int n, int r) {
        return P(n, r).divide(P(r, r));
    }
}