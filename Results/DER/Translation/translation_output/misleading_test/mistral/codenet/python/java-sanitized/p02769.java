import java.util.*;

public class p02769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) 1e9 + 7;
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int x = 1;
        int y = 1;
        int t = 1;
        for (int i = 0; i < k; i++) {
            t *= (i + 1);
            t %= mod;
            y *= (n - 1 - i);
            y %= mod;
            y *= (n - i);
            y %= mod;
            int c = bp(t, mod);
            x += y * c * c;
            x %= mod;
        }
        if (n <= k) {
            x = 1;
            for (int i = 1; i < n; i++) {
                x *= (2 * n - 1 - i);
                x %= mod;
            }
            y = 1;
            for (int i = 1; i < n; i++) {
                y *= (i + 1);
                y %= mod;
            }
            System.out.println((x * y) % mod);
        } else {
            x = 1;
            for (int i = 1; i < k; i++) {
                x *= (2 * k - 1 - i);
                x %= mod;
            }
            y = 1;
            for (int i = 1; i < k; i++) {
                y *= (k - 1 - i);
                y %= mod;
            }
            y *= (k - i);
            y %= mod;
            int c = bp(t, mod);
            x += y * c * c;
            x %= mod;
            System.out.println(x);
        }
    }

    public static int bp(int a, int n) {
        int r = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return r;
    }
}