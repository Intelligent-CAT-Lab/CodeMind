import java.util.Scanner;
import java.math.BigInteger;

public class p02333 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger modulo = BigInteger.valueOf(1000000007);
        BigInteger ans = BigInteger.ZERO;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans = ans.add(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                } else {
                    ans = ans.subtract(BigInteger.valueOf(k - i).pow(n).multiply(combination(k, i)));
                }
            }
            ans = ans.mod(modulo);
        }
        System.out.println(ans);
    }

    public static BigInteger combination(int i, int j) {
        BigInteger result = BigInteger.ONE;
        for (int k = 1; k <= j; k++) {
            result = result.multiply(BigInteger.valueOf(i - k + 1)).divide(BigInteger.valueOf(k));
        }
        return result;
    }
}