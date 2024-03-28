import java.util.*;
import java.math.*;

public class p02769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % 1000000007;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % 1000000007;
            }
            BigInteger b = BigInteger.valueOf(x).pow(1000000005);
            BigInteger c = BigInteger.valueOf(y).pow(1000000005);
            BigInteger d = b.multiply(c);
            System.out.println(d.mod(BigInteger.valueOf(1000000007)));
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % 1000000007;
                y = (y * (n - 1 - i) * (n - i)) % 1000000007;
            }
            BigInteger b = BigInteger.valueOf(t).pow(1000000005);
            BigInteger c = BigInteger.valueOf(y).pow(1000000005);
            BigInteger d = b.multiply(c).multiply(c);
            x = (x + d.mod(BigInteger.valueOf(1000000007))) % 1000000007;
            System.out.println(x);
        }
    }
}