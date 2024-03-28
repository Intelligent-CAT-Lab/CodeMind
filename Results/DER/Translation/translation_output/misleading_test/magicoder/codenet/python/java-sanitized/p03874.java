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
            ans[i] += "L".repeat(k / a[i].intValue());
            k %= a[i].intValue();
        }
        for (int i = 0; i < n / 2; i++) {
            String temp = ans[i];
            ans[i] = ans[n - i - 1];
            ans[n - i - 1] = temp;
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