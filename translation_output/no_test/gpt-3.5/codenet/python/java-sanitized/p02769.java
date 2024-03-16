import java.util.Scanner;

public class p02769 {
    
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (int) ((long) x * (2 * n - 1 - i) % mod);
            }

            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (int) ((long) y * (i + 1) % mod);
            }

            int result = (int) ((long) x * binPow(y, mod - 2) % mod);
            System.out.println(result);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;

            for (int i = 0; i < k; i++) {
                t = (int) ((long) t * (i + 1) % mod);
                y = (int) ((long) y * (n - 1 - i) % mod);
                y = (int) ((long) y * (n - i) % mod);
                int c = binPow(t, mod - 2);

                x = (x + (int) ((long) y * c % mod * c % mod)) % mod;
            }

            System.out.println(x);
        }
    }

    static int binPow(int a, int n) {
        int r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (int) ((long) r * a % mod);
            }
            a = (int) ((long) a * a % mod);
            n /= 2;
        }
        return r;
    }
}