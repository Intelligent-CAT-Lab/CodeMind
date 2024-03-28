import java.util.*;
import java.math.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i).divide(factorial(i).divide(factorial(7)));
        }
        Arrays.sort(a, Collections.reverseOrder());

        int cnt = 600 * 7;
        String[] ans = new String[n];
        Arrays.fill(ans, "FESTIVA");
        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k.divide(a[i]).intValue());
            k = k.mod(a[i]);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = new StringBuilder(ans[i]).reverse().toString();
        }
        System.out.println(String.join("", ans));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}