import java.util.Scanner;
import java.math.BigInteger;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = factorial(7 + i).divide(factorial(i)).divide(factorial(7));
            a[n - 1 - i] = val;  // Reversing while storing
        }

        int cnt = 600 * 7;
        StringBuilder[] ans = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            ans[i] = new StringBuilder("FESTIVA");  // Use StringBuilder for efficiency
        }
        for (int i = 0; i < n; i++) {
            BigInteger item = a[i];
            BigInteger[] divmod = bigIntegerDivMod(BigInteger.valueOf(k), item);
            k = divmod[1].intValue();
            while (divmod[0].signum() == 1) {  // Equivalent to (k // item)
                ans[n - 1 - i].append("L");
                divmod[0] = divmod[0].subtract(BigInteger.ONE);
            }
        }
        for (StringBuilder part : ans) {
            System.out.print(part);
        }
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    private static BigInteger[] bigIntegerDivMod(BigInteger a, BigInteger b) {
        BigInteger[] result = new BigInteger[2];
        result[0] = a.divide(b);  // Division
        result[1] = a.mod(b);     // Modulus
        return result;
    }
}