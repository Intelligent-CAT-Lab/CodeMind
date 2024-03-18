import java.math.BigInteger;
import java.util.Scanner;

public class p02702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] remain = new int[2020];
        BigInteger now = BigInteger.ZERO;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            BigInteger digit = new BigInteger(s.substring(i, i + 1));
            now = now.add(digit.multiply(BigInteger.TEN.pow(s.length()-i-1))).mod(BigInteger.valueOf(2019));
            ans += remain[now.intValue()];
            remain[now.intValue()]++;
        }

        ans += remain[0];
        System.out.println(ans);

        scanner.close();
    }
}