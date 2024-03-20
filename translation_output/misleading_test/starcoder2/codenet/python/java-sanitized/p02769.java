import java.util.*;
import java.io.*;
public class p02769 {
    static int mod = 1000000007;
    static int bp(int a, int n) {
        int r = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = x * (2 * n - 1 - i) % mod;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = y * (i + 1) % mod;
            }
            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = t * (i + 1) % mod;
                y = y * (n - 1 - i) % mod;
                y = y * (n - i) % mod;
                int c = bp(t, mod - 2);
                x = (x + y * c * c % mod) % mod;
            }
            System.out.println(x);
        }
    }
}