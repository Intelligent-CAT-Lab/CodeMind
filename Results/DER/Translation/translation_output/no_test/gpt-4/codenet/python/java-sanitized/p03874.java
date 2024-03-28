import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p03874 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i).divide(factorial(i).multiply(factorial(7)));
        }

        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }

        for (int i = 0; i < n; i++) {
            BigInteger item = a[n - 1 - i];
            int times = k / item.intValue();
            k %= item.intValue();
            ans[i] += "L".repeat(times);
        }

        StringBuilder result = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            result.append(ans[i]);
        }

        System.out.println(result);
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}