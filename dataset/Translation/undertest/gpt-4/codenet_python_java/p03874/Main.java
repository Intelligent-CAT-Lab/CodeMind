import java.math.BigInteger;
import java.util.Scanner;

public class p03874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            a[i] = factorial(7 + i).divide(factorial(i)).divide(factorial(7));
        }

        int cnt = 600 * 7; 
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }

        for (int i = 0; i < n; i++) {
            BigInteger item = a[n - 1 - i];
            StringBuilder sb = new StringBuilder(ans[i]);
            sb.append("L".repeat(k / item.intValueExact()));
            ans[i] = sb.toString();
            k %= item.intValueExact();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
        System.out.println();

        scanner.close();
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}