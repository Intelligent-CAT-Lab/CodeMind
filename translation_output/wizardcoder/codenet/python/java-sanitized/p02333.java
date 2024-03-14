import java.math.BigInteger;
import java.util.Scanner;

public class p02333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int modulo = (int) Math.pow(10, 9) + 7;
        BigInteger ans = BigInteger.ZERO;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans = ans.add(BigInteger.valueOf((long) Math.pow(k - i, n))
                           .multiply(BigInteger.valueOf(combination(k, i))));
                } else {
                    ans = ans.subtract(BigInteger.valueOf((long) Math.pow(k - i, n))
                           .multiply(BigInteger.valueOf(combination(k, i))));
                }
            }
            ans = ans.mod(BigInteger.valueOf(modulo));
        }
        System.out.println(ans);
    }

    public static int combination(int n, int r) {
        if (r > n) {
            return 0;
        }
        BigInteger numerator = BigInteger.valueOf(1);
        BigInteger denominator = BigInteger.valueOf(1);
        for (int i = n; i >= n - r; i--) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= r; i++) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }
        return numerator.divide(denominator).intValue();
    }
}