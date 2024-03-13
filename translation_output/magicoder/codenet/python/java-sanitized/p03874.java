import java.util.*;
import java.math.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = factorial(7 + i).divide(factorial(i).divide(factorial(7)));
            a[i] = val.intValue();
        }
        Arrays.sort(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        Arrays.fill(ans, "FESTIVA");
        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(ans[i]);
        }
        System.out.println(sb.toString());
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}