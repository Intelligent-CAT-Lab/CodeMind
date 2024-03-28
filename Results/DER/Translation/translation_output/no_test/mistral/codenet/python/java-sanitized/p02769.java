import java.util.*;

public class p02769 {
    static int mod = (int) 1e9 + 7;

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
            for (int i = 1; i < n; i++) {
                x = (x * (2 * n - 1 - i)) % mod;
            }
            int y = 1;
            for (int i = 1; i < n; i++) {
                y = (y * (i + 1)) % mod;
            }
            System.out.println((x * bp(y, 1000000007)) % mod);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 1; i <= k; i++) {
                t = (t * (i + 1)) % mod;
                y = (y * (n - 1 - i)) % mod;
                y = (y * (n - i)) % mod;
                int c = bp(t, 1000000007);
                x += (y * c * c) % mod;
            }
            System.out.println(x % mod);
        }
    }
}